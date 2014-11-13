package org.serge009.fishtrading.core.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Created by SERGE on 08.11.2014.
 */
@Entity
@Table(name = "authority")
public class Authority implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER")
    private User user;

    @Column(name = "ROLE")
    private String authority;

    public Authority() {}

    public Authority(String authority) {
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authority='" + authority + '\'' +
                ", id=" + id +
                '}';
    }
}
