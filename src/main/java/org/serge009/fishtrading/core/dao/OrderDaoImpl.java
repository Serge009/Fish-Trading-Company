package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Matrix on 13.11.2014.
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Order order) {
        em.persist(order);
    }
}
