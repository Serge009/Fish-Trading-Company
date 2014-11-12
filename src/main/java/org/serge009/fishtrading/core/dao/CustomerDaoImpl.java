package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by SERGE on 12.11.2014.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Customer customer) {
        em.persist(customer);
    }
}
