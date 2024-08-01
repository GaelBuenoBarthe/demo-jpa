package fr.diginamic;

import fr.diginamic.Dao.ClientDao;
import fr.diginamic.entite.Client;
import fr.diginamic.entite.Compo;
import fr.diginamic.entite.Emprunt;
import fr.diginamic.entite.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpa");
        EntityManager em = emf.createEntityManager();

        ClientDao clientDao = new ClientDao(em);

        Emprunt emprunt = clientDao.findEmpruntById(1);
        if (emprunt != null) {
            Client client = emprunt.getClient();
            for (Compo compo : emprunt.getCompos()) {
                Livre livre = compo.getLivre();
                System.out.println("Emprunt avec id " + emprunt.getId() + " fait par " + client.getNom() + " " + client.getPrenom() +
                        " avec le livre " + livre.getTitre() + " de " + livre.getAuteur() + " le " + emprunt.getDateDebut());
            }
        } else {
            System.out.println("Pas d'emprunt trouvé pour l'ID 1");
        }

        em.close();
        emf.close();
    }
}