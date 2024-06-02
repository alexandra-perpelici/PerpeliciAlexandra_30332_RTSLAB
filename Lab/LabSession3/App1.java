package Lab.LabSession3;

public class App1 {
    public static void main(String[] args) {
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(1);


        new ExecutionThreadApp1(monitor1, null,4, 2, 4).start();
        new ExecutionThreadApp1(monitor1,monitor2,3, 3, 6).start();
        new ExecutionThreadApp1(null,monitor2, 5, 2,5).start();

    }
}
