package Catalogo;

import DAO.CatalogoDAO;
import DAO.PrestitoDAO;
import DAO.UtenteDAO;
import Entities.*;
import Utils.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;

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
        //**********RIVISTE**********\\
        Rivista riv1 = new Rivista("Game Informer", 1991, 25, Periodicita.SETTIMANALE);
        Rivista riv2 = new Rivista("Imagine Games Network", 2012, 32, Periodicita.MENSILE);
        Rivista riv3 = new Rivista("GameSpot", 1996, 40, Periodicita.SEMESTRALE);
        //**********UTENTI**********\\
        Utente ute1 = new Utente("Massimiliano", "D'orsi", LocalDate.of(1996, 6, 22));
        Utente ute2 = new Utente("Michela", "D'orsi", LocalDate.of(2001, 6, 5));
        Utente ute3 = new Utente("Claudia", "Ticli", LocalDate.of(1996, 2, 14));
        //**********PRESTITI**********\\
        Prestito pre1 = new Prestito(ute1, lib1, LocalDate.now(), LocalDate.now(), null);
        Prestito pre2 = new Prestito(ute2, lib2, LocalDate.of(2023, 3, 2), LocalDate.of(2023, 3, 2), LocalDate.of(2023, 3, 28));
        Prestito pre3 = new Prestito(ute1, riv1, LocalDate.of(2023, 1, 8), LocalDate.of(2023, 1, 8), LocalDate.of(2023, 3, 2));
        //**********SALVATAGGIO LIB,RIV,UTE,PRE**********\\
        ctd.save(lib1);
        ctd.save(lib2);
        ctd.save(lib3);
        ctd.save(riv1);
        ctd.save(riv2);
        ctd.save(riv3);
        utd.save(ute1);
        utd.save(ute2);
        utd.save(ute3);
        prd.save(pre1);
        prd.save(pre2);
        prd.save(pre3);
        //**********RIMOZIONE PER ISBM**********\\
        ctd.romPerISBN(1);
    }
}
