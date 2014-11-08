package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by SERGE on 08.11.2014.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User findByUsername(String username) {
        return em.createQuery("from User u where u.username = '" + username + "'", User.class).getSingleResult();
    }
}
