package org.vit.patterns.bridge;

public class BankingApplication extends AbstractApplicationBridge {

    public BankingApplication(Developer developer) {
        this.type = "Banking application";
        this.developer = developer;
    }
}
