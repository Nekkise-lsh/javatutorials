package org.opentutorials.javatutorials.ch5.verify;

/**
 * Created by Nekisse_lee on 2017. 8. 8..
 */
public class Example08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {93, 92, 96},
                {78, 83, 93, 87, 88},
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+= array[i][j];
                count++;

            }
        }
        avg = sum/count;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
