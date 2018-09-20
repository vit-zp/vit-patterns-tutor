package org.vit.patterns.adapter;

public class AdapterPattern {

    public static void main(String[] args) {

        IInternalWorker worker = new RemoteWorkerAdapter();

        worker.doWorkByType("internal");

        worker.doWorkByType("remote");

    }
}
