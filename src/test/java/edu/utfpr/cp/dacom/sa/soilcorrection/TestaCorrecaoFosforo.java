package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import lombok.val;

public class TestaCorrecaoFosforo {

    @Test
    public void testaConverteMgDm3EmKgHa() {

        val teorFosforoAdicionarMgDm3 = 3.41;
        val teorFosforoAdicionarKgHa = new ConverteMgDm3EmKgHa()
        .converte(teorFosforoAdicionarMgDm3);
        
        assertEquals(6.82, teorFosforoAdicionarKgHa);
    }
    
    @Test
    public void testaConverteKgHaEmP2O5() {
        
        val teorFosforoAdicionarKgHa = 6.82;
        val teorFosforoAdicionarP2O5 = new ConverteKgHaEmP2O5()
                                    .converte(teorFosforoAdicionarKgHa);
        
        assertEquals(15.6178, teorFosforoAdicionarP2O5);
    }

    @Test
    public void testaNecessidadeFosforo() {

        val teorFosforoAdicionarP2O5 = 15.6178;

        val correcaoFosforo = new CorrecaoFosforo();

        val necessidadeFosforo = correcaoFosforo
                    .calculaEficienciaNutriente(teorFosforoAdicionarP2O5, 0.7);

        assertEquals(22.31114285714286, necessidadeFosforo);
    }

    @Test
    public void testaQuantidadeAplicar() {

        val necessidadeFosforo = 22.31114285714286;

        val correcaoFosforo = new CorrecaoFosforo();

        assertEquals(123.95079365079366,
                correcaoFosforo.calculaQuantidadeAplicar(
                    necessidadeFosforo, 
                    FonteFosforo.SUPERFOSFATO_SIMPLES)
        );
    }

    @Test
    public void testaCustoReaisHa() {

        val correcaoFosforo = new CorrecaoFosforo();
        
        val qtdeFosforoAplicar = 123.95079365079366;
        
        assertEquals(156.178, correcaoFosforo.calculaCusto(
                                                        1260.0, 
                                                        qtdeFosforoAplicar)
            );
        }
        
    @Test
    public void testaNutrientesAdicionais() {

        val correcaoFosforo = new CorrecaoFosforo();
        
        val qtdeFosforoAplicar = 123.95079365079366;

        assertEquals(2, correcaoFosforo.getNutrientesAdicionais(
                                            qtdeFosforoAplicar, 
                                            FonteFosforo.SUPERFOSFATO_SIMPLES).size());
    }

}
