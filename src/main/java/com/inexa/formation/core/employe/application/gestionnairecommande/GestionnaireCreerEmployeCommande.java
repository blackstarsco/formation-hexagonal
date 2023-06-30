package com.inexa.formation.core.employe.application.gestionnairecommande;

import com.inexa.formation.GestionnaireCommande;
import com.inexa.formation.core.employe.application.casutilisation.CreerEmploye;
import com.inexa.formation.core.employe.application.commande.CreerEmployeCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public class GestionnaireCreerEmployeCommande implements GestionnaireCommande<CreerEmployeCommande> {

    private final CreerEmploye creerEmploye;

    public GestionnaireCreerEmployeCommande(EmployeRepositoryPort employeRepository) {
        this.creerEmploye = new CreerEmploye(employeRepository);
    }

    @Override
    public void execute(CreerEmployeCommande commande) {
        this.creerEmploye.enregistrer(commande);
    }
}
