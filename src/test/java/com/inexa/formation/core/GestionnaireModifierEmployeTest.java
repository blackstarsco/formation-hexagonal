package com.inexa.formation.core;

import com.inexa.formation.core.employe.application.commande.UpdateEmployerCommande;
import com.inexa.formation.core.employe.application.gestionnairecommande.GestionnaireCreerEmployeCommande;
import com.inexa.formation.core.employe.application.gestionnairecommande.GestionnaireModifierEmployeCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.core.employe.domaine.objetvaleur.Disponibilite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GestionnaireModifierEmployeTest {

    @Mock
    EmployeRepositoryPort employeRepositoryPort;

    private GestionnaireModifierEmployeCommande gestionnaireModifierEmployeCommande;

    @BeforeEach
    public void setUp() {
        this.gestionnaireModifierEmployeCommande = new GestionnaireModifierEmployeCommande(employeRepositoryPort);
    }

    @Test
    @DisplayName("test de modification d'un l'employé")
    public void testerUpdate(){
        //Given

        UUID id  = UUID.randomUUID();
        var employer = new Employe();
        employer.setId(id);
        employer.setDisponibilite(Disponibilite.EN_ACTIVITE);

        var employerCommande = new UpdateEmployerCommande();
        employerCommande.setId(id);
        employerCommande.setDisponibilite(Disponibilite.EN_ACTIVITE);

        //When

        when(this.employeRepositoryPort.obtenirParId(id)).thenReturn(Optional.of(employer));
        this.gestionnaireModifierEmployeCommande.execute(employerCommande);
//THEN
        Mockito.verify(this.employeRepositoryPort, Mockito.times(1)).enregistrer(any(Employe.class));

        //Then

    }
}
