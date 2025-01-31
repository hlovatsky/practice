package thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//also you can inherit Thread class
public class ThreadCreatorImplementedRunnable implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(ThreadCreatorImplementedRunnable.class);

    @Override
    public void run() {
        LOGGER.info("Message is {}, Thread is {}", "Hello, World", Thread.currentThread().getName());
    }
}
