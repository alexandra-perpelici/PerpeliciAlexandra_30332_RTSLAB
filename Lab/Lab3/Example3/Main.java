package Lab.Lab3.Example3;

class JoinTestThread extends Thread{

    Thread t;
    private final String n;
    int number;
    int sum;


    JoinTestThread(String n, Thread t, int number){

        this.n = n;
        this.t = t;
        this.number = number;

    }

    public void run() {

        System.out.println("Thread "+n+" has entered the run() method");

        try {

            if (t != null)
                t.join();

                for(int j = 1; j <= number; j++)
                {
                    if (number % j == 0)
                       sum = sum+j;
                }
            Main.sum += sum;
            System.out.println("Thread "+n+" executing operation.The sum is: " +sum);

            Thread.sleep(3000);

            System.out.println("Thread "+n+" has terminated operation. The total sum is: " +Main.sum );

        }

        catch(Exception e){e.printStackTrace();}
    }

}

public class Main {
 public static int sum = 0;
    public static void main(String[] args){



        JoinTestThread w1 = new JoinTestThread("Thread 1",null,100000);

        JoinTestThread w2 = new JoinTestThread("Thread 2",w1,30000);


        w1.start();
        w2.start();
        System.out.println(Main.sum);

    }

}
