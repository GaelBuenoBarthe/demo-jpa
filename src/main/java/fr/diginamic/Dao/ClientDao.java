package fr.diginamic.Dao;


import fr.diginamic.entite.Emprunt;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ClientDao {
    private EntityManager em;

    public ClientDao(EntityManager em) {
        this.em = em;
    }

    public Emprunt findEmpruntById(int id) {
        return em.find(Emprunt.class, id);
    }

    public List<Emprunt> findEmpruntsByClientId(int clientId) {
        TypedQuery<Emprunt> query = em.createQuery("SELECT e FROM Emprunt e WHERE e.client.id = :clientId", Emprunt.class);
        query.setParameter("clientId", clientId);
        return query.getResultList();
    }
}