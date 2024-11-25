package task9;

public class ResourceSynchronizationApp {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ResourceSynchronizer synchronizer = new ResourceSynchronizer(resource);

        Thread t1 = new WorkerThread("Поток-1", synchronizer);
        Thread t2 = new WorkerThread("Поток-2", synchronizer);
        Thread t3 = new WorkerThread("Поток-3", synchronizer);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Основной поток был прерван.");
        }

        System.out.println("Итоговое значение ресурса: " + resource.getValue());
    }
}
