package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="lignevente")
@EqualsAndHashCode(callSuper = true)
public class LigneVente extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes vente;


    @Column(name="quantite")
    private BigDecimal quantite;


    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;

}
