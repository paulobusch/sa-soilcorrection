package edu.utfpr.cp.dacom.sa.soilcorrection.interfaces;

import edu.utfpr.cp.dacom.sa.soilcorrection.models.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
