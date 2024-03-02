package com.tedjiGroup.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.LigneVente;
import com.tedjiGroup.gestiondestock.model.Ventes;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class LigneVenteDto {

    private Integer id;


    @JsonIgnore
    private VentesDto vente;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;


    public LigneVenteDto fromEntity(LigneVente ligneVente ){

        if (ligneVente == null){

            return null;
        }

        return LigneVenteDto.builder()

                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();

    }


    public LigneVente toEntity(LigneVenteDto ligneVenteDto){

        if(ligneVenteDto == null){
            return null;
        }

        LigneVente ligneVente = new LigneVente();

        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());

        return ligneVente;
    }



}
