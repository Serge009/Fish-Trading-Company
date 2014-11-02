package org.serge009.fishtrading.web.beans;

import org.serge009.fishtrading.core.entity.Contact;
import org.serge009.fishtrading.service.ContactService;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by SERGE on 02.11.2014.
 */
@Named
@Scope("request")
public class ContactBean {

    private Contact contact;

    @Inject
    private ContactService service;

    @PostConstruct
    private void init() {
        this.contact = this.service.findById(1l);
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
