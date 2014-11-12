package org.serge009.fishtrading.core.entity;

import javax.persistence.*;

/**
 * Created by Matrix on 12.11.2014.
 */
@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "ID")
public class Customer extends User {

    @Column(name = "PAYMENT_RIGHT")
    private int payRight;

    public int getPayRight() {
        return payRight;
    }

    public void setPayRight(int payRight) {
        this.payRight = payRight;
    }
}
