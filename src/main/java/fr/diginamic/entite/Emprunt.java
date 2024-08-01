package fr.diginamic.entite;

import jakarta.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DATE_DEBUT", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @Column(name = "DELAI", nullable = false)
    private int delai;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT", nullable = true)
    private Client client;

    @OneToMany(mappedBy = "emprunt")
    private List<Compo> compos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getDelai() {
        return delai;
    }

    public Client getClient() {
        return client;
    }

    public List<Compo> getCompos() {
        return compos;
    }

}