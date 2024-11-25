package task9;
public class WorkerThread extends Thread {
    private final ResourceSynchronizer synchronizer;

    public WorkerThread(String name, ResourceSynchronizer synchronizer) {
        super(name);
        this.synchronizer = synchronizer;
    }

    @Override
    public void run() {
        synchronizer.accessResource(getName());
    }
}
