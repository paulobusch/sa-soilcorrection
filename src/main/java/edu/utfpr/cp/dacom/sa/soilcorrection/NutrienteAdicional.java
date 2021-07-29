package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Setter;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NutrienteAdicional {
    @NonNull
    private final NomeNutrienteAdicional nome;

    @Getter @NonNull
    private final double teorNutriente;

    @Getter @Setter
    private double correcaoAdicional; 
}
