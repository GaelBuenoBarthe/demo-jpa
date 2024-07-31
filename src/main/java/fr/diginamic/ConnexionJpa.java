package fr.diginamic;

import fr.diginamic.Dao.LivreDao;
import fr.diginamic.entite.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpa");
        EntityManager em = emf.createEntityManager();

        LivreDao livreDao = new LivreDao(em);
        Livre livre = livreDao.findById(3);
        if (livre != null) {
            System.out.println("Le livre trouvé avec l'ID " + livre.getId() + " est " + livre.getTitre() + " de "
                    + livre.getAuteur() + ".");
        } else {
            System.out.println("Pas de livre trouvé.");
        }
        System.out.println(em);
        System.out.println(emf);

        em.close();
        emf.close();
    }
}