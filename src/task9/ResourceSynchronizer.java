package task9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceSynchronizer {
    private final SharedResource resource;
    private final Lock lock = new ReentrantLock();

    public ResourceSynchronizer(SharedResource resource) {
        this.resource = resource;
    }

    public void accessResource(String threadName) {
        lock.lock();
        try {
            System.out.println(threadName + " получил доступ к ресурсу.");
            resource.increment();
            System.out.println(threadName + " обновил значение ресурса до " + resource.getValue());
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(threadName + " был прерван.");
        } finally {
            System.out.println(threadName + " освободил ресурс.");
            lock.unlock();
        }
    }
}
