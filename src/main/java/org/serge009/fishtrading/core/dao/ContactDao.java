package org.serge009.fishtrading.core.dao;

import org.serge009.fishtrading.core.entity.Contact;

import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public interface ContactDao {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);

    List<Contact> findAllByNativeQuery();
}
