package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="lignecommandefournisseur")
public class LigneCommandeFournisseur   extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;

    @Column(name="quantite")
    private BigDecimal quantite;


    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;

}
