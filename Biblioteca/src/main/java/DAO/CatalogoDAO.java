package DAO;

import Entities.Catalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    public void romPerISBN(long ISBN) {
        Catalogo foundCatalogo = em.find(Catalogo.class, ISBN);
        if (foundCatalogo != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(foundCatalogo);
            transaction.commit();
            System.out.println("Elemento" + ISBN + "ELIMINATO dal Database!!");

        } else {
            System.out.println("ELEMENTO NON TROVATO!!");
        }
    }

    public void save(Catalogo ct) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(ct);
        transaction.commit();
        System.out.println("ELEMENTO SALVATO!!");
    }

}
