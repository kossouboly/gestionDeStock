package com.tedjiGroup.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Adresse;
import com.tedjiGroup.gestiondestock.model.Entreprise;
import com.tedjiGroup.gestiondestock.model.Roles;
import com.tedjiGroup.gestiondestock.model.Utilisateur;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private String modeDePasse;

    private String dateNaissance;


    @JsonIgnore
    private AdresseDto adresse;

    private String photo;

    @JsonIgnore
    private EntrepriseDto entreprise;

    @JsonIgnore
    private List<RolesDto> roles;

    public UtilisateurDto fromEntity(Utilisateur utilisateur) {

        if (utilisateur == null) {
            return null;

        }

        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .dateNaissance(utilisateur.getDateNaissance())
                .photo(utilisateur.getPhoto())
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {

        if (utilisateurDto == null) {

            return null;

        }
        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setDateNaissance(utilisateurDto.getDateNaissance());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        return utilisateur;
    }
}
