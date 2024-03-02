package com.tedjiGroup.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Adresse;
import com.tedjiGroup.gestiondestock.model.Entreprise;
import com.tedjiGroup.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {


    private Integer id;

    private String nom;

    @JsonIgnore
    private AdresseDto adresse;


    private String photo;


    private String email;


    private String numTel;


    private String steWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;

    public EntrepriseDto fromEntity(Entreprise entreprise) {
        if (entreprise == null) {

            return null;

        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .steWeb(entreprise.getSteWeb())
                .build();
    }


    public Entreprise toEntity(EntrepriseDto entrepriseDto) {

        if (entrepriseDto == null) {

            return null;
        }


        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setSteWeb(entrepriseDto.getSteWeb());

        return entreprise;
    }

}
