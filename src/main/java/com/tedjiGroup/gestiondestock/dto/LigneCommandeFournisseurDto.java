package com.tedjiGroup.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Article;
import com.tedjiGroup.gestiondestock.model.CommandeFournisseur;
import com.tedjiGroup.gestiondestock.model.LigneCommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;


    @JsonIgnore
    private ArticleDto article;

    @JsonIgnore
    private CommandeFournisseurDto commandeFournisseur;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;



    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){

        if (ligneCommandeFournisseur ==null){

            return  null;
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build();


    }


    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){


        if (ligneCommandeFournisseurDto == null){

            return null;
        }

        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDto.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire());

        return ligneCommandeFournisseur;
    }
}
