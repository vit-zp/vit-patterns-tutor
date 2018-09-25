package org.vit.patterns.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        AbstractApplicationBridge app1 = new BankingApplication(new JavaDeveloper());
        AbstractApplicationBridge app2 = new BillingApplication(new CPPDeveloper());
        AbstractApplicationBridge app3 = new BankingApplication(new NetDeveloper());

        app1.create();
        app2.create();
        app3.create();
    }
}
