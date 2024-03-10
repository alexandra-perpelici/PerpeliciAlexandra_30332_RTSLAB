package Lab.Lab1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Select an option: addition, subtraction, multiplication.");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        System.out.println("Enter 2 imaginary numbers:");
        int re1 = scan.nextInt();
        int im1 = scan.nextInt();
        //scan.nextLine();
        int re2 = scan.nextInt();
        int im2 = scan.nextInt();

        switch(choice)
        {
            case "Addition": {
                int re = re1+re2;
                int im = im1+im2;
                System.out.println(re + "+" + im + "i");
            }
            break;
            case "Subtraction": {
                int re = re1-re2;
                int im = im1-im2;
                System.out.println(re + "+" + im + "i");

            }
            break;
            case "Multiplication:":
            {   int re = re1*re2 -im1*im2;
                int im = re1*im1 + re2*im2;
                System.out.println(re + "+" + im + "i");

            }
            break;

        }


    }
}