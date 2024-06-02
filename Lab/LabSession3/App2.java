package Lab.LabSession3;

public class App2 {
    public static void main(String[] args) {
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(1);


        new ExecutionThreadApp2(monitor1, monitor2, 4, 2, 4, 4, 6).start();
        new ExecutionThreadApp2(monitor1, monitor2, 5, 3, 5,5,7).start();

    }
}
