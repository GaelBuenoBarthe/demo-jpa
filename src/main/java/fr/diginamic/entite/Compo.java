package fr.diginamic.entite;

import jakarta.persistence.*;

@Entity
public class Compo {
    @EmbeddedId
    private CompoId id;

    @ManyToOne
    @MapsId("idEmp")
    @JoinColumn(name = "ID_EMP", nullable = false)
    private Emprunt emprunt;

    @ManyToOne
    @MapsId("idLiv")
    @JoinColumn(name = "ID_LIV", nullable = false)
    private Livre livre;

    public CompoId getId() {
        return id;
    }

    public Emprunt getEmprunt() {
        return emprunt;
    }

    public Livre getLivre() {
        return livre;
    }

}