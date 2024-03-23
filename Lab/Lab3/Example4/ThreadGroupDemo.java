package Lab.Lab3.Example4;

public class ThreadGroupDemo {
    public static void main(String args[]) throws Exception {

        ThreadGroup tg = new ThreadGroup("Group of threads");
        ThreadEx fir1 = new ThreadEx(tg, "ThreadEx #1");
        ThreadEx fir2 = new ThreadEx(tg, "ThreadEx #2");
        ThreadEx fir3 = new ThreadEx(tg, "ThreadEx #3");

        fir1.start();
        fir2.start();
        fir3.start();

        Thread.sleep(4000); // 4 seconds delay until next print
        System.out.println(tg.activeCount() + " Thread in group.");


        Thread thrds[] = new Thread[tg.activeCount()];
        tg.enumerate(thrds); // populate thrds[] with the threads from tg

//        for (Thread t : thrds) {
//            System.out.println(t.getName());
//        }
//
        fir1.stopThread(); // ends the first thread
        Thread.sleep(1000); // 1 sec delay until next print
        System.out.println(tg.activeCount() + " Thread in group.");

        // ! if I don't call the stopThread() function on the thread than the group of threads will interrupt
//        fir2.stopThread();
//        Thread.sleep(1000);
//        System.out.println(tg.activeCount() + " Thread in group.");
//
//        fir3.stopThread();
//        Thread.sleep(1000);
//        System.out.println(tg.activeCount() + " Thread in group.");


        // use this to interrupt the for loop from ThreadEx => interrupt the group of threads
        tg.interrupt();
    }
}
