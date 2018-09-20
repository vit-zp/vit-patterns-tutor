package org.vit.patterns.adapter;

public interface IRemoteWorker {

    default void doWork() {
        System.out.println("I am do work remotely");
    }
}
