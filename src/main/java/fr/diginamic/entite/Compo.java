package fr.diginamic.entite;

import jakarta.persistence.*;

@Entity
public class Compo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_LIVRE", nullable = false)
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "ID_EMPRUNT", nullable = false)
    private Emprunt emprunt;

    public int getId() {
        return id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Emprunt getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Emprunt emprunt) {
        this.emprunt = emprunt;
    }
}