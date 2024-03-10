package Lab.Lab1;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

        Random random_nr = new Random();
        int vector[] = new int[10];
        for (int i = 0;i<vector.length;i++) {
            vector[i] = random_nr.nextInt(100);
        }

        int aux = 0;
        for ( int i = 0;i< vector.length;i++)
        {
            for ( int j = i+1;j< vector.length ;j++)
                if(vector[i]>vector[j])
                {   aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;

                }
        }

        for (int i = 0;i<vector.length;i++) {
            System.out.print(vector[i] + " ");
        }
    }
}