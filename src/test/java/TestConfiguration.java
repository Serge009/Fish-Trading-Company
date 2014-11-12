import org.serge009.fishtrading.core.entity.Customer;
import org.serge009.fishtrading.service.CustomerService;
import org.serge009.fishtrading.service.SecurityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SERGE on 02.11.2014.
 */
public class TestConfiguration {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");

        CustomerService service = ctx.getBean("customerServiceImpl", CustomerService.class);

        Customer customer = new Customer();
        customer.setName("Customer");
        customer.setSurname("Surname");
        customer.setPayRight(2);
        customer.setPassword("pass");
        customer.setUsername("username");

        service.save(customer);

        Customer customer2 = new Customer();
        customer2.setName("Customer");
        customer2.setSurname("Surname");
        customer2.setPayRight(2);
        customer2.setPassword("pass");
        customer2.setUsername("username");

        service.save(customer2);
        System.out.println(customer2);
        /*SecurityService service = ctx.getBean("securityService", SecurityService.class);

        UserDetails admin = service.loadUserByUsername("admin");
        System.out.println(admin);*/
        /*ContactService service = ctx.getBean("contactService", ContactService.class);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(service.findById(1l));
        listContactsWithDetail(contacts);*/
    }

    /*private static void listContactsWithDetail(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts with details:");
        for (Contact contact : contacts) {
            System.out.println(contact);
            if (contact.getContactTelDetails() != null) {
                for (ContactTelDetail contactTelDetail :
                        contact.getContactTelDetails()) {
                    System.out.println(contactTelDetail);
                }
            }
            if (contact.getHobbies() != null) {
                for (Hobby hobby : contact.getHobbies()) {
                    System.out.println(hobby);
                }
            }
            System.out.println();
        }
    }

    private static void listContacts(List<Contact> contacts) {
        System.out.println("");
        System.out.println("Listing contacts without details:");
        for (Contact contact : contacts) {
            System.out.println(contact);
            System.out.println();
        }
    }*/
}
