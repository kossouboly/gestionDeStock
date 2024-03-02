package com.tedjiGroup.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.CommandeFournisseur;
import com.tedjiGroup.gestiondestock.model.Fournisseur;
import com.tedjiGroup.gestiondestock.model.LigneCommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;
    private String code;
    private Instant dateCommande;


    @JsonIgnore
    private FournisseurDto fournisseur;


    @JsonIgnore
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;


    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {

        if (commandeFournisseur == null) {

            return null;
        }


        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }


    public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {


        if (commandeFournisseurDto == null) {
            return null;
        }


        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();

        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        return commandeFournisseur;
    }


}
