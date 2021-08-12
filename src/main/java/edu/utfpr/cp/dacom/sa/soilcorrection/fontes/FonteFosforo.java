package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.fontes.IFonteNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;

@RequiredArgsConstructor
public enum FonteFosforo implements IFonteNutriente {
    SUPERFOSFATO_SIMPLES(0.18, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.1), new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.28))),
    SUPERFOSFATO_TRIPO(0.41, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.2))),
    MAP(0.48, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.CALCIO, 0.09)));

    @Getter
    private final double teorFonte;

    @Getter @NonNull
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
