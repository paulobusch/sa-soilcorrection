package edu.utfpr.cp.dacom.sa.soilcorrection.correcoes;

import edu.utfpr.cp.dacom.sa.soilcorrection.correcoes.ICorrecaoNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.FonteCalcioMagnesio;

public class CorrecaoCalcioMagnesio 
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        double qtdeFonteAdicionar, 
        double prntPercent
    ) {

        if (qtdeFonteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (prntPercent <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeFonteAdicionar / prntPercent;
    }
}
