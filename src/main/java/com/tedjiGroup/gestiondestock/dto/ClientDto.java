package com.tedjiGroup.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Adresse;
import com.tedjiGroup.gestiondestock.model.Client;
import com.tedjiGroup.gestiondestock.model.CommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;


    private String prenom;


    @JsonIgnore
    private AdresseDto adresse;


    private String photo;


    private String mail;


    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;


    public ClientDto fromEntity(Client client) {


        if (client == null) {

            return null;

            // TODO
        }


        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .photo(client.getPhoto())
                .build();
    }

    public Client toEntity(ClientDto clientDto){


        if(clientDto == null){

            return null;


        }

        Client client =new Client();

        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());
        client.setPhoto(clientDto.getPhoto());
        return client;
    }


}
