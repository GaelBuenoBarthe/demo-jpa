package fr.diginamic.Dao;

import fr.diginamic.entite.Livre;
import jakarta.persistence.EntityManager;

public class LivreDao {
    private EntityManager em;

    public LivreDao(EntityManager em) {
        this.em = em;
    }

    public Livre findById(int id) {
        return em.find(Livre.class, id);
    }
}