package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Setter;
import lombok.Getter;
import lombok.NonNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class NutrienteAdicional {
    @NonNull
    private final NomeNutrienteAdicional nome;

    @Getter
    private final double teorNutriente;

    @Getter @Setter
    private double correcaoAdicional; 
}
