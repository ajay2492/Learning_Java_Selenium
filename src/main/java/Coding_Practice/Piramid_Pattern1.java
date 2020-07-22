package Coding_Practice;

import java.util.Scanner;

public class Piramid_Pattern1 {

   static int inputNumber;

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the odd nuber to print piramid");
        inputNumber = scanner.nextInt();
        int temp = 0;
        for(int i = inputNumber; i > 0 ;i--){
            for(int n = 0; n < temp; n++){
                System.out.print(" ");
            }
            for(int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            --i; ++temp;
        }
    }
}
