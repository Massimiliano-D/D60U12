package DAO;

import Entities.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager em;

    public PrestitoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito pr) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        ;
        em.persist(pr);
        transaction.commit();
        System.out.println("PRESTITO SALVATO!!");
    }
}
