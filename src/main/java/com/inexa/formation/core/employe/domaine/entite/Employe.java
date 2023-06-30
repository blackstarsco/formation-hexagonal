package com.inexa.formation.core.employe.domaine.entite;

import com.inexa.formation.commun.objetvaleur.Adresse;
import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;
import com.inexa.formation.core.employe.domaine.objetvaleur.Disponibilite;

import java.util.UUID;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public class Employe {

    private UUID id;
    private String nom;
    private String prenom;
    private Civilite civilite;
    private Adresse adresse;
    private Disponibilite disponibilite;

    public Employe() {
        this.id = UUID.randomUUID();
    }

    public Employe(String nom, String prenom, Civilite civilite, Adresse adresse, Disponibilite disponibilite) {
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.adresse = adresse;
        this.disponibilite = disponibilite;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Disponibilite getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {
        this.disponibilite = disponibilite;
    }
}
