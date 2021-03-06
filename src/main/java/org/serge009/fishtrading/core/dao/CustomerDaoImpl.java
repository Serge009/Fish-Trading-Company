package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by SERGE on 12.11.2014.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public Customer findById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        em.persist(customer);
    }
}
