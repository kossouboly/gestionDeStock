package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {


    @Column(name = "adresse1")
    private String Adresse1;

    @Column(name = "adresse2")
    private String Adresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codePostale")
    private String codePostale;

    @Column(name = "pays")
    private String pays;


}
