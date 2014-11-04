package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by oper4 on 04.11.2014.
 */
@Repository(value = "productDao")
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return em.createQuery("from Product", Product.class).getResultList();
    }
}
