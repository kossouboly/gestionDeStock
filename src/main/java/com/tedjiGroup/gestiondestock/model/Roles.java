package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "roles")
public class Roles extends AbstractEntity {

    @Column(name = "rolename")
    private String roleName;


    @ManyToOne
    @JoinColumn(name="idutilisateur")
    private Utilisateur utilisateur;


}
