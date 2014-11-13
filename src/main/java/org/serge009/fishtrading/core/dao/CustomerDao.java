package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Customer;

/**
 * Created by SERGE on 12.11.2014.
 */
public interface CustomerDao {

    public Customer findById(int id);

    public void save(Customer customer);
}
