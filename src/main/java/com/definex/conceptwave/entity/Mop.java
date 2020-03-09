package com.definex.conceptwave.entity;

import java.io.Serializable;

public class Mop  implements Serializable{
    private  String subscriptionId;

    public Mop() {
    }
    public Mop(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Override
    public String toString() {
        return "Mop{" +
                "subscriptionId='" + subscriptionId + '\'' +
                '}';
    }
}
