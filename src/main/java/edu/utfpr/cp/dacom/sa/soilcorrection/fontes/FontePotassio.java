package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.interfaces.IFonteNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.models.NutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.enums.NomeNutrienteAdicional;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;

@RequiredArgsConstructor
public enum FontePotassio implements IFonteNutriente {
    CLORETO_POTASSIO(0.58, Set.of()),
    SULFATO_POTASSIO(0.52, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.17))),
    SULFATO_POTASSIO_MAGNESIO(0.22, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.22), new NutrienteAdicional(NomeNutrienteAdicional.MAGNESIO, 0.18)));

    @Getter
    private final double teorFonte;

    @Getter @NonNull
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
