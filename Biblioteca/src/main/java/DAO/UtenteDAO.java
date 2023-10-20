package DAO;


import Entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Utente ut) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        ;
        em.persist(ut);
        transaction.commit();
        System.out.println("UTENTE SALVATO!!");
    }
}
