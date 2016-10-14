package com.su.auction.dao.hibernate;

import com.su.auction.dao.api.ItemDao;
import com.su.domain.Item;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {

    @PersistenceContext
    private EntityManager em;

    public List<Item> getAll() {
        return em.createQuery("Select i from Item i").getResultList();
    }

    @Transactional
    public void add(Item entity) {
        em.persist(entity);
    }

    @Transactional
    public void remove(Item entity) {
        em.remove(entity);
    }
}
