/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIPTO
 */
public class Task_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //number of plastic bags
        float[] weight = new float[n];

        for (int i = 0; i < n; ++i) {
            weight[i] = input.nextFloat(); //weights of the plastic bags
        }

        System.out.println(efficientJanitor(weight));

        input.close();
    }

    public static int efficientJanitor(float[] weight) {
        int trip = 1, n = weight.length;

        int i = 0;
        double weight_per_trip = 0.0;

        while (i < n) {
                if ((weight_per_trip + weight[i] <= 3)) {
                    weight_per_trip += weight[i++];
                } else {
                    ++trip;
                    weight_per_trip = 0.0;
                }
            }
        return trip;
    }
}
