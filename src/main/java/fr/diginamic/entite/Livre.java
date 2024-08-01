package fr.diginamic.entite;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TITRE", nullable = false)
    private String titre;

    @Column(name = "AUTEUR", nullable = false)
    private String auteur;

    @OneToMany(mappedBy = "livre")
    private List<Compo> compos;

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public List<Compo> getCompos() {
        return compos;
    }

}