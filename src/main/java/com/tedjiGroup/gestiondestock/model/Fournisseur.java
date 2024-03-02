package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {

    @Column(name ="nom")

    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse addresse;


    @Column(name = "photo")
    private String photo;


    @Column(name = "mail")
    private String mail;


    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    List<CommandeFournisseur> commandeFournisseurs;


}
