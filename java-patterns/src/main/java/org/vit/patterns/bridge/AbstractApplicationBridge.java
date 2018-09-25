package org.vit.patterns.bridge;

public abstract class AbstractApplicationBridge {

    protected Developer developer;

    protected String type;

    public void create() {
        System.out.println(String.format("Application %s is been creating...", type));
        developer.developApp();
    }
}
