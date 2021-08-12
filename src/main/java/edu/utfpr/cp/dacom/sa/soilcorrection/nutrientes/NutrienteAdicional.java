package edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;

import lombok.Setter;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NutrienteAdicional {
    @NonNull
    private final NomeNutrienteAdicional nome;

    @Getter
    private final double teorNutriente;

    @Getter @Setter
    private double correcaoAdicional; 
}
