package DAO;

import Entities.Catalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Catalogo ct) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        ;
        em.persist(ct);
        transaction.commit();
        System.out.println("ELEMENTO SALVATO!!");
    }
}
