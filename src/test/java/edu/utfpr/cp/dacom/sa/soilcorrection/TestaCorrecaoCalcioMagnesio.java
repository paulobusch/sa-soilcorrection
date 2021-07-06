package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio {

    @Test
    public void testaQuantidadeAplicar() {
        var necessidadeCalcario = 6.25;

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        assertEquals(1850.0,
            correcaoCalcioMagnesio.calculaQuantidadeAplicar(
                necessidadeCalcario, 
                FonteCalcioMagnesio.CALCLARIO_CALCITICO
            )
        );
    }

    @Test
    public void testaCustoReaisHa() {
        var qtdeCalcarioAplicar = 6.25;

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        
        assertEquals(922.68, 
            correcaoCalcioMagnesio.calculaCusto(
                500.0,
                qtdeCalcarioAplicar
            )
        );
    }

}
