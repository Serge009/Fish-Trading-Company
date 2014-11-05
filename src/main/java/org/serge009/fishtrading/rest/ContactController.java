package org.serge009.fishtrading.rest;

import org.serge009.fishtrading.core.entity.Contact;
import org.serge009.fishtrading.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.*;

/**
 * Created by Matrix on 05.11.2014.
 */
@Controller
public class ContactController {
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @Inject
    @Qualifier("contactService")
    private ContactService contactService;

    @RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
    public @ResponseBody Contact getContact(@PathVariable("id") long id) {
        logger.info("Searching for contact with id = {}", id);
        return contactService.findById(id);
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public @ResponseBody List<Contact> getAllContacts() {
        logger.info("Getting list of all contacts");
        return contactService.findAll();
    }

}
