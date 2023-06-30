package com.inexa.formation.core;

import com.inexa.formation.core.employe.application.commande.CreerEmployeCommande;
import com.inexa.formation.core.employe.application.gestionnairecommande.GestionnaireCreerEmployeCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
@ExtendWith(MockitoExtension.class)
public class GestionnaireEmployeTest {

    @Mock
    EmployeRepositoryPort employeRepositoryPort;

    private GestionnaireCreerEmployeCommande gestionnaireCreerEmployeCommande;

    @BeforeEach
    void setUp() {
        this.gestionnaireCreerEmployeCommande = new GestionnaireCreerEmployeCommande(employeRepositoryPort);
    }

    @Test
    @DisplayName("test de l'enregistrement de l'employé")
    void tester() {
        //Given
        var commande = new CreerEmployeCommande();
        commande.setNom("roger");
        commande.setPrenom("Kpego");
        commande.setCivilite(Civilite.MONSIEUR);

        //when
        this.gestionnaireCreerEmployeCommande.execute(commande);

        //Then
        Mockito.verify(this.employeRepositoryPort, Mockito.times(1)).enregistrer(any(Employe.class));
    }
}
