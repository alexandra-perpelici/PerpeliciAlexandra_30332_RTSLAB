package Lab.LabSession3;

public class App4 {

    public static void main(String[] args){
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(1);
        ThreadOne t1 = new ThreadOne(monitor1,monitor2,7,2,3);
        ExecutionThreadApp4 t2 = new ExecutionThreadApp4(monitor2,0,3,5,t1);
        ExecutionThreadApp4 t3 = new ExecutionThreadApp4(monitor1,0,4,6,t1);

        t1.start();
        t2.start();
        t3.start();
}


}
