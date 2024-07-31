package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        // creation de l' EntityManagerFactory et de l' EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpa");
        EntityManager em = emf.createEntityManager();

        // Verifie que la connexion est établie
        System.out.println("Connexion établie. Verifiez les logs pour les détails." + emf);

        // Ferme EntityManager et EntityManagerFactory
        em.close();
        emf.close();
    }
}