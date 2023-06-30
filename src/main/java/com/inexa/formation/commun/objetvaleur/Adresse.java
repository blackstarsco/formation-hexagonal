package com.inexa.formation.commun.objetvaleur;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
public class Adresse {

    private String ville;
    private String quartier;
    private String codePostal;
    private String telephone;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
