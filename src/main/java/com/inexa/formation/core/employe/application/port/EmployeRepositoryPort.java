package com.inexa.formation.core.employe.application.port;

import com.inexa.formation.core.employe.domaine.entite.Employe;

import java.util.Optional;
import java.util.UUID;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public interface EmployeRepositoryPort {

    void enregistrer(Employe employe);

    Optional<Employe> obtenirParId(UUID id);
}
