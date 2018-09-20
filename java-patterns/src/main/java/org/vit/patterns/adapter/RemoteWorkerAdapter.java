package org.vit.patterns.adapter;

public class RemoteWorkerAdapter implements IInternalWorker {
    private IRemoteWorker remoteWorker = new IRemoteWorker() {

    };

    @Override
    public void doWorkByType(String type) {
        if ("remote".equals(type)) {
            remoteWorker.doWork();
        } else {
            doInternalWork(type);
        }
    }
}
