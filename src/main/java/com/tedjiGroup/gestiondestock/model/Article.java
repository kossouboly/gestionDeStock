package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="article")
public class Article extends AbstractEntity {


    @Column(name= "codearticle")
    private String codeArticle;


    @Column(name="designation")
    private String designation ;


    @Column(name="prixunitaireht")
    private BigDecimal prixUnitaireHt;


    @Column(name="tauxtva")
    private BigDecimal tauxTva;


    @Column(name="prixunitairettc")
    private  BigDecimal prixUnitaireTtc;


    @ManyToOne
    @JoinColumn(name="idcategory")
    private Category category ;


    @Column(name="photo")
    private String photo;




}
