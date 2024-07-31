package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        // creation de l' EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpa");

        // Creation de l' EntityManager
        EntityManager em = emf.createEntityManager();

        // Verifie que la connexion est établie
        System.out.println("Connexion établie. Check logs pour les détails.");

        // Ferme EntityManager et EntityManagerFactory
        em.close();
        emf.close();
    }
}