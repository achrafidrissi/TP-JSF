package com.exo1_jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named("bean")
@RequestScoped

public class NumberBean {
    private int nombre;

    // Getter et Setter pour "nombre"
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    // Méthode pour obtenir les 5 nombres suivant le nombre saisi
    public List<Integer> getSuivants() {
        int nb = 5;
        List<Integer> t = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            t.add(i);
        }
        return t;
    }
}
