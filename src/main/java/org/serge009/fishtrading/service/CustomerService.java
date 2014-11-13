package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.entity.Customer;

/**
 * Created by SERGE on 12.11.2014.
 */
public interface CustomerService {

    public Customer findById(int id);

    public void save(Customer customer);
}
