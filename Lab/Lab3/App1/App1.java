package Lab.Lab3.App1;

public class App1 {


        private static boolean stopThreads = false;

        public static void main(String[] args){

            FileService service = new FileService("messages.txt");

            RThread reader = new RThread(service);

            WThread writer = new WThread(service);

            reader.start();

            writer.start();

        }

        public static boolean isStopThreads(){

            return stopThreads;

        }

    }

