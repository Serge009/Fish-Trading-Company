package org.serge009.fishtrading.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SERGE on 02.11.2014.
 */
@Entity
@Table(name = "hobby")
public class Hobby implements Serializable {
    @Id
    @Column(name = "HOBBY_ID")
    private String hobbyId;

    @ManyToMany
    @JoinTable(name = "contact_hobby_detail",
            joinColumns = @JoinColumn(name = "HOBBY_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"))
    private Set<Contact> contacts = new HashSet<>();

    public String getHobbyId() {
        return this.hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public String toString() {
        return "Hobby :" + getHobbyId();
    }
}
