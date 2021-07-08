package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio {

    @Test
    public void testaNecessidadeAdicionarCMolcDcm3() {
        
        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var necessidadeAdicionarCMolcDcm3 = correcaoCalcioMagnesio
            .calculaNecessidadeAdicionarCMolcDcm3(5.77, 0.447, 0.55);
        
        assertEquals(1.312, necessidadeAdicionarCMolcDcm3, 0.02);
    }

    @Test
    public void testaQuantidadeAplicar() {
        var necessidadeCalcario = 1.29;

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        assertEquals(1.85,
            correcaoCalcioMagnesio.calculaQuantidadeAplicar(
                necessidadeCalcario, 
                FonteCalcioMagnesio.CALCLARIO_CALCITICO
            )
        );
    }

    @Test
    public void testaCustoReaisHa() {
        var qtdeCalcarioAplicar = 1.29;

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        
        assertEquals(922.68, 
            correcaoCalcioMagnesio.calculaCusto(
                500.0,
                qtdeCalcarioAplicar
            )
        );
    }

    @Test
    public void testaNutrientesAdicionais() {
        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        
        var qtdeCalcioMagnesioAplicar = 1.85;

        assertEquals(1, 
            correcaoCalcioMagnesio
                .getNutrientesAdicionais(
                    qtdeCalcioMagnesioAplicar, 
                    FonteCalcioMagnesio.GESSO_AGRICOLA
                ).size()
        );
    }
}
