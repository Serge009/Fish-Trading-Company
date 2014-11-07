package org.serge009.fishtrading.rest;

import org.serge009.fishtrading.core.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by oper4 on 07.11.2014.
 */
@Controller
@RequestMapping("/coffee")
public class XMLController {

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public @ResponseBody
    Coffee getCoffeeInXML(@PathVariable String name) {

        Coffee coffee = new Coffee(name, 100);

        return coffee;

    }

}
