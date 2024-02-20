package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {


    @Column(name = "nom")
    private String nom;


    @Column(name = "prenom")
    private String prenom;

    private String email;
    private String modeDePasse;

    @Column(name="datenaissance")
    private String dateNaissance;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;


    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;


    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;


}
