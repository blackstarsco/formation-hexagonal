package com.inexa.formation.core.employe.application.casutilisation;

import com.inexa.formation.core.employe.application.commande.CreerEmployeCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.commun.objetvaleur.Adresse;
import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;
import com.inexa.formation.core.employe.domaine.objetvaleur.Disponibilite;

import java.util.logging.Logger;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public class CreerEmploye {

    private final EmployeRepositoryPort employeRepository;
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public CreerEmploye(EmployeRepositoryPort employeRepository) {
        this.employeRepository = employeRepository;
    }

    public void enregistrer(CreerEmployeCommande commande) {
        Employe employe = genererEmploye(commande);
        this.employeRepository.enregistrer(employe);
        log.info("Nouvel employé enregistré");
    }

    protected Employe genererEmploye(CreerEmployeCommande commande) {
        String nom = commande.getNom();
        String prenom = commande.getPrenom();
        Civilite civilite = commande.getCivilite();
        Adresse adresse = commande.getAdresse();
        return new Employe(nom, prenom, civilite, adresse, Disponibilite.EN_ACTIVITE);
    }
}
