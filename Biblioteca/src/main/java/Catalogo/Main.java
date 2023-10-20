package Catalogo;

import DAO.CatalogoDAO;
import DAO.PrestitoDAO;
import DAO.UtenteDAO;
import Entities.Libro;
import Utils.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    private static EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        CatalogoDAO ctd = new CatalogoDAO(em);
        UtenteDAO utd = new UtenteDAO(em);
        PrestitoDAO prd = new PrestitoDAO(em);
        //**********LIBRI**********\\
        Libro lib1 = new Libro("Il Guardiano degli Innocenti", 2010, 370, "Andrzej Sapkowsk", "Fantasy");
        Libro lib2 = new Libro("La Spada del Destino", 2011, 393, "Andrzej Sapkowsk", "Fantasy");
        Libro lib3 = new Libro("Il Sangue degli Elfi", 2012, 393, "Andrzej Sapkowsk", "Fantasy");
    }
}
