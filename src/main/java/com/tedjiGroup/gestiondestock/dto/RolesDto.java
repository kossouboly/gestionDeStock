package com.tedjiGroup.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Roles;
import com.tedjiGroup.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class RolesDto {


    private Integer id;

    private String roleName;


    @JsonIgnore
    private UtilisateurDto utilisateur;


    public RolesDto fromEntity(Roles roles){

        if (roles == null) {
            return null;

        }

       return  RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }

    public Roles toEntity(RolesDto rolesDto){

        if (rolesDto == null) {
            return null ;
        }

        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());
        return roles;
    }
}
