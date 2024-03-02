package com.tedjiGroup.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Adresse;
import com.tedjiGroup.gestiondestock.model.CommandeFournisseur;
import com.tedjiGroup.gestiondestock.model.Fournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {


    private Integer id;

    private String nom;


    private String prenom;

    @JsonIgnore
    private AdresseDto addresse;


    private String photo;


    private String mail;


    private String numTel;

    @JsonIgnore
    List<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur) {

        if (fournisseur == null) {
            return null;
        }

        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();


    }

    public Fournisseur toEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;

        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseur.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        return fournisseur;
    }


}
