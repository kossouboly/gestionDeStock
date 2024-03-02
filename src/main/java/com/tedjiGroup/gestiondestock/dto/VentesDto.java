package com.tedjiGroup.gestiondestock.dto;


import com.tedjiGroup.gestiondestock.model.Ventes;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VentesDto {


    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    public VentesDto fromEntity(Ventes ventes) {

        if (ventes == null) {

            return null;
        }

        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();

    }

    public Ventes toEntity(VentesDto ventesDto) {


        if (ventesDto == null) {

            return null;

        }

        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());
        ventes.setCode(ventesDto.getCode());
        ventes.setDateVente(ventesDto.getDateVente());
        ventes.setCommentaire(ventesDto.getCommentaire());
        return ventes;
    }

}
