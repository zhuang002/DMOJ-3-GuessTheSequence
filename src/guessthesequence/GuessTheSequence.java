/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthesequence;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class GuessTheSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(15);
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = rand.nextInt(3);
        }

        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            while (a != sequence[i]+1){
                System.out.println("NO");
                a=sc.nextInt();
            } 
            System.out.println("YES");
        }
        System.out.println("DONE");
    }
}
