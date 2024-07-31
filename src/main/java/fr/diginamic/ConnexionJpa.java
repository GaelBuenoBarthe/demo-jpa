package fr.diginamic;

import fr.diginamic.Dao.LivreDao;
import fr.diginamic.entités.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        // Creation de l'EntityManagerFactory et de l'EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpa");
        EntityManager em = emf.createEntityManager();

        // Utilise le DAO pour récupérer un livre par son ID
        LivreDao livreDao = new LivreDao(em);
        Livre livre = livreDao.findById(1L);
        if (livre != null) {
            System.out.println("Livre found with ID: " + livre.getId());
            System.out.println("Titre: " + livre.getTitre());
            System.out.println("Auteur: " + livre.getAuteur());
        } else {
            System.out.println("Livre not found.");
        }

        // Fermeture de l'EntityManager et de l'EntityManagerFactory
        em.close();
        emf.close();
    }
}