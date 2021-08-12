package edu.utfpr.cp.dacom.sa.soilcorrection.models;

import lombok.Builder;

@Builder
public record NutrientesCTC (
    double fosforo,
    double potassio,
    double calcio,
    double magnesio,
    double enxofre,
    double aluminio,
    double aluminioHidrogenio
) { }