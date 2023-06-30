package com.inexa.formation.core.employe.application.commande;

import com.inexa.formation.commun.objetvaleur.Adresse;
import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public class CreerEmployeCommande {

    @NotBlank(message = "le nom de l'employé est obligatoire")
    private String nom;
    @NotBlank(message = "le prenom de l'employé est obligatoire")
    private String prenom;
    @NotNull
    private Civilite civilite;
    private Adresse adresse;

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
}
