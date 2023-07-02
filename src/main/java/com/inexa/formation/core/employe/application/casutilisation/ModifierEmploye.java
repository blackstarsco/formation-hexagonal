package com.inexa.formation.core.employe.application.casutilisation;

import com.inexa.formation.core.employe.application.commande.UpdateEmployerCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.core.employe.domaine.exception.EmployerNonTrouverException;
import com.inexa.formation.core.employe.domaine.objetvaleur.Disponibilite;

import java.util.UUID;
import java.util.logging.Logger;

public class ModifierEmploye {

    private final EmployeRepositoryPort employerRepositoryPort;

    private final Logger log = Logger.getLogger(this.getClass().getName());

    public  ModifierEmploye(EmployeRepositoryPort employeRepositoryPort){
        this.employerRepositoryPort = employeRepositoryPort;
    }

    public void modifyEmployer(UpdateEmployerCommande updateEmployerCommande){

        UUID id = updateEmployerCommande.getId();
        Disponibilite disponibilite = updateEmployerCommande.getDisponibilite();
        Employe employe = this.employerRepositoryPort.obtenirParId(id)
                .orElseThrow(()->new EmployerNonTrouverException("Employer non trouvé"));

        employe.changeDisponibilite(disponibilite);
        this.employerRepositoryPort.enregistrer(employe);
    }
}
