package com.inexa.formation.core.employe.application.commande;

import com.inexa.formation.core.employe.domaine.objetvaleur.Disponibilite;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.rmi.server.UID;
import java.util.UUID;

public class UpdateEmployerCommande {

    @NotBlank(message = "Entrez un Identifiant!")
    private UUID id;

    @NotNull(message = "Veuillez choisir une disponibilité !")
    private Disponibilite disponibilite;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public Disponibilite getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {
        this.disponibilite = disponibilite;
    }





}
