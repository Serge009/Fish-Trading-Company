package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.entity.Contact;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public interface ContactService {
    public Contact findById(Long id);

    public List<Contact> findAll();
}
