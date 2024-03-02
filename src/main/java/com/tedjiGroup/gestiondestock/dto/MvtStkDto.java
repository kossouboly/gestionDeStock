package com.tedjiGroup.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Article;
import com.tedjiGroup.gestiondestock.model.MvtStk;
import com.tedjiGroup.gestiondestock.model.TypeMvtStk;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@Builder
public class MvtStkDto {


    private Integer id;

    private Instant dateMvt;


    private BigDecimal quantite;

    @JsonIgnore
    private ArticleDto article;


    private TypeMvtStk typeMvt;

    public MvtStkDto fromEntity(MvtStk mvtStk) {

        if (mvtStk == null) {
            return null;
        }

        return  MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .typeMvt(mvtStk.getTypeMvt())
                .build();
    }


    public MvtStk toEntity(MvtStkDto mvtStkDto){
        if (mvtStkDto == null) {
            return null;

        }


        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setTypeMvt(mvtStk.getTypeMvt());
        return mvtStk;
    }
}

