package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente {
    CALCLARIO_DOLOMITICO(0.304),
    CALCLARIO_CALCITICO(0.56),
    CALCLARIO_CONCHA(0.54),
    GESSO_AGRICOLA(0.29),
    HIDROXIDO_CALCIO(0.757),
    CALCARIO_MAGNESIO(0.35);
    
    private final double teorFonte;

    FonteCalcioMagnesio(double teorFonte) {
        this.teorFonte = teorFonte;
    }

    @Override
    public double getTeorFonte() {
        return this.teorFonte;
    }
}
