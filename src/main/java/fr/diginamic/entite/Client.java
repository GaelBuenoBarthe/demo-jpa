package fr.diginamic.entite;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NOM" ,nullable = false)
    private String nom;

    @Column(name = "PRENOM" ,nullable = false)
    private String prenom;

    @OneToMany(mappedBy = "client")
    private List<Emprunt> emprunts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

}