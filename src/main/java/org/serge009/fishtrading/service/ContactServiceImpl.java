package org.serge009.fishtrading.service;

import org.serge009.fishtrading.core.dao.ContactDao;
import org.serge009.fishtrading.core.entity.Contact;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by SERGE on 02.11.2014.
 */

@Service("contactService")
@Transactional
public class ContactServiceImpl implements ContactService {

    @Inject
    @Qualifier("contactDao")
    private ContactDao contactDao;

    @Override
    @Transactional(readOnly = true)
    public Contact findById(Long id) {
        return contactDao.findById(id);
    }
}
