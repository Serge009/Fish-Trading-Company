package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.dao.OrderDao;
import org.serge009.fishtrading.core.entity.Order;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Matrix on 13.11.2014.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Inject
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
