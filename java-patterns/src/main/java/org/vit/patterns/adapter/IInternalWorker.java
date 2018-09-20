package org.vit.patterns.adapter;

public interface IInternalWorker {
    default void doWorkByType(String type) {
        System.out.println();
    }

    ;

    default void doInternalWork(String type) {
        System.out.println(String.format("internal job of type %s is done!", type));
    }
}
