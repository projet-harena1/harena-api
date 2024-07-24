package com.harena.api.dto.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FluxImpossiblesDataFromJsonFile {
    private String nomArgent;
    private LocalDate date;
    private Integer valeurArgent;
}
