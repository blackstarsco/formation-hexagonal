package com.inexa.formation.core.employe.application.gestionnairecommande;

import com.inexa.formation.GestionnaireCommande;
import com.inexa.formation.core.employe.application.casutilisation.ModifierEmploye;
import com.inexa.formation.core.employe.application.commande.CreerEmployeCommande;
import com.inexa.formation.core.employe.application.commande.UpdateEmployerCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;

public class GestionnaireModifierEmployeCommande implements GestionnaireCommande<UpdateEmployerCommande> {

    private  final ModifierEmploye modifierEmploye;

    public GestionnaireModifierEmployeCommande(EmployeRepositoryPort repositoryPort) {
        this.modifierEmploye = new ModifierEmploye(repositoryPort);
    }

    @Override
    public void execute(UpdateEmployerCommande updateEmployerCommande) {
        this.modifierEmploye.modifyEmployer(updateEmployerCommande);
    }
}
