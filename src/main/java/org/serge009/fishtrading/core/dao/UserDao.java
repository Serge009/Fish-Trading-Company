package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.User;

/**
 * Created by SERGE on 08.11.2014.
 */
public interface UserDao {
    public User findByUsername(String username);

    public void save(User user);
}
