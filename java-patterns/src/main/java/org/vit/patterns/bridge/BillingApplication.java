package org.vit.patterns.bridge;

public class BillingApplication extends AbstractApplicationBridge {

    public BillingApplication(Developer developer) {
        this.type = "Billing application";
        this.developer = developer;
    }
}
