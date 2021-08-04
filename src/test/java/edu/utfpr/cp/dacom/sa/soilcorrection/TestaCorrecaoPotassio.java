package edu.utfpr.cp.dacom.sa.soilcorrection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.val;

public class TestaCorrecaoPotassio {

    @Test
    public void testaNecessidadeAdicionarCMolcDM3() {
        
        val correcaoPotassio = new CorrecaoPotassio();

        val necessidadeAdicionarCMolcDM3 = correcaoPotassio
        .calculaNecessidadeAdicionarCMolcDm3(0.15, 
                                             0.01164, 
                                             0.03);
        
        assertEquals(0.23659793814432992, 
                    necessidadeAdicionarCMolcDM3);
    }

    @Test
    public void testaConverteCMolcDm3EmMgDm3() {

        val necessidadeAdicionarCMolcDM3 = 0.23659793814432992;

        val cmolcConvertido = new ConverteCMolcDm3EmMgDm3()
                                .converte(necessidadeAdicionarCMolcDM3);

        assertEquals(92.509793814433, cmolcConvertido);
    }

    @Test
    public void testaConverteKgHaEmK2O() {

        val valorKgHa = 185.10;
        val valorK2o = new ConverteKgHaEmK2O()
                            .converte(valorKgHa);

        assertEquals(222.11999999999998, valorK2o);
    }

    @Test
    public void testaCalculaEficienciaNutriente() {

        val correcaoPotassio = new CorrecaoPotassio();

        val eficiencia = correcaoPotassio
                        .calculaEficienciaNutriente(222.12, 0.85);

        assertEquals(261.3176470588235, eficiencia);
    }

    @Test
    public void testaQuantidadeAplicar() {

        val correcaoPotassio = new CorrecaoPotassio();
        
        val eficiencia = 261.3176470588235;
        
        assertEquals(450.54766734279923,
        correcaoPotassio.calculaQuantidadeAplicar(eficiencia, FontePotassio.CLORETO_POTASSIO));
    }
    
    @Test
    public void testaCustoReaisHa() {

        val correcaoPotassio = new CorrecaoPotassio();
        
        val qtdeAplicar = 450.54766734279923;
        
        assertEquals(1126.3691683569982, 
        correcaoPotassio
        .calculaCusto(
            2500.0, 
            qtdeAplicar)
            );
        }
        
        
    @Test
    public void testaNutrientesAdicionais() {
            
        val correcaoPotassio = new CorrecaoPotassio();
        
        val qtdePotassioAplicar = 450.54766734279923;

        assertEquals(0, 
                    correcaoPotassio
                            .getNutrientesAdicionais(
                                qtdePotassioAplicar, 
                                FontePotassio.CLORETO_POTASSIO).size()
                    );
    }
}
