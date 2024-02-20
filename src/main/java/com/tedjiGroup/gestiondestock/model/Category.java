package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity {


    @Column(name = "code")
    private String code;

    @Column(name="designation")
    private String designation;


    @OneToMany(mappedBy = "category")
    private List<Article> articles;


}
