package com.exo2_tp;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.util.regex.Pattern;

@Named("userBean")
@RequestScoped

public class UserBean {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String genre;
    private String email;

    // Getter et setter pour chaque propriété
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Méthode de validation personnalisée pour l'email
    public void validateEmail(FacesContext context, UIComponent component, Object value) {
        String email = (String) value;
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (!Pattern.matches(emailRegex, email)) {
            FacesMessage message = new FacesMessage("L'email n'est pas valide");
            context.addMessage(component.getClientId(context), message);
        }
    }
}
