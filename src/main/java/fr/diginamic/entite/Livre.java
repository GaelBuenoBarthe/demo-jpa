package fr.diginamic.entite;

import jakarta.persistence.*;
import java.util.Set;

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
    private Set<Compo> compos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Set<Compo> getCompos() {
        return compos;
    }

    public void setCompos(Set<Compo> compos) {
        this.compos = compos;
    }
}