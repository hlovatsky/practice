package thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadTest {

    @Test
    void testThreadImplementedRunnable() {
        ThreadCreatorImplementedRunnable implementedRunnable = new ThreadCreatorImplementedRunnable();
        Thread thread1 = new Thread(implementedRunnable);
        Thread thread2 = new Thread(implementedRunnable);
        Thread thread3 = new Thread(implementedRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        assertEquals("Thread-0", thread1.getName());
        assertEquals("Thread-1", thread2.getName());
        assertEquals("Thread-2", thread3.getName());
    }


//    you will get StackOverflowException
//    private static void createStackOverflowException() {
//        ThreadCreatorImplementedRunnable implementedRunnable = new ThreadCreatorImplementedRunnable();
//        Thread thread1 = new Thread(implementedRunnable);
//        Thread thread2 = new Thread(implementedRunnable);
//        Thread thread3 = new Thread(implementedRunnable);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        createStackOverflowException();
//    }

//    you will get OutOfMemoryError exception
//    private static void OutOfMemoryErrorException() {
//        ThreadCreatorImplementedRunnable implementedRunnable = new ThreadCreatorImplementedRunnable();
//        Thread thread1 = new Thread(implementedRunnable);
//        Thread thread2 = new Thread(implementedRunnable);
//        Thread thread3 = new Thread(implementedRunnable);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        int temp = 0;
//        List<Integer> list = new ArrayList<>();
//        while (true) {
//            list.add(temp);
//        }
//    }
}
