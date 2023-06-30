package com.inexa.formation.infrastructure.repository.impl;

import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;
import com.inexa.formation.infrastructure.repository.EmployeRepositoryJpa;
import org.springframework.stereotype.Repository;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
@Repository
public class PgEmployeRepositoryAdaptateur implements EmployeRepositoryPort {
    private final EmployeRepositoryJpa employeRepositoryJpa;

    public PgEmployeRepositoryAdaptateur(EmployeRepositoryJpa employeRepositoryJpa) {
        this.employeRepositoryJpa = employeRepositoryJpa;
    }

    @Override
    public void enregistrer(Employe employe) {
        String nom = employe.getNom();
        String prenom = employe.getPrenom();
        Civilite civilite = employe.getCivilite();

    }
}
