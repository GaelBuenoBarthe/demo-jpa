package fr.diginamic.entite;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompoId implements Serializable {
    private int idLiv;
    private int idEmp;

    public int getIdLiv() {
        return idLiv;
    }

    public void setIdLiv(int idLiv) {
        this.idLiv = idLiv;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

}