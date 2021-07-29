package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;

@RequiredArgsConstructor
public enum FonteFosforo implements IFonteNutriente {
    SUPERFOSFATO_SIMPLES(0.18, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.1), new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.28))),
    SUPERFOSFATO_TRIPO(0.41, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.2))),
    MAP(0.48, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.09)));

    @Getter @NonNull
    private final double teorFonte;

    @Getter @NonNull
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
