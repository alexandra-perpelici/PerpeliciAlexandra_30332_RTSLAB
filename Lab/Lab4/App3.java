package Lab.Lab4;

public class App3 {
    public static void main(String[] args) {
        Integer monitor = new Integer(1);



        new ExecutionThreadApp3(monitor,  5, 3, 6).start();
        new ExecutionThreadApp3(monitor,  3,4,7).start();
        new ExecutionThreadApp3(monitor,6,5,7).start();

    }
}
