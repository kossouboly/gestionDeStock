package com.tedjiGroup.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tedjiGroup.gestiondestock.model.Client;
import com.tedjiGroup.gestiondestock.model.CommandeClient;
import com.tedjiGroup.gestiondestock.model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {


    private Integer id;
    private String code;

    private Instant dateCommande;

    @JsonIgnore
    private ClientDto client;

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClients;

    public CommandeClientDto fromEntity(CommandeClient commandeClient) {

        if (commandeClient == null) {

            return null;

        }


        return CommandeClientDto.builder()

                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(getDateCommande())
                .build();


    }


    public static  CommandeClient toEntity(CommandeClientDto commandeClientDto) {

        if (commandeClientDto == null) {

            return null;
        }

        CommandeClient commandeClient = new CommandeClient();

        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());

        return commandeClient;


    }


}
