package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.dao.CustomerDao;
import org.serge009.fishtrading.core.entity.Customer;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by SERGE on 12.11.2014.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerDao customerDao;

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }
}
