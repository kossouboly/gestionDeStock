package com.tedjiGroup.gestiondestock.dto;

import com.tedjiGroup.gestiondestock.model.Adresse;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AdresseDto {

    private Integer id;

    private String Adresse1;


    private String Adresse2;


    private String ville;


    private String codePostale;


    private String pays;


    public AdresseDto fromEntity(Adresse adresse) {
        if (adresse == null) {

            return null;

            //TODO
        }

        return AdresseDto.builder()
                .Adresse1(adresse.getAdresse1())
                .Adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();


    }


    public Adresse toEntity(AdresseDto adresseDto) {

        if (adresseDto == null) {
            return null;

            //TODO
        }


        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());

        return adresse;
    }

}
