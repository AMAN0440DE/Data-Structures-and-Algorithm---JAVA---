

////////////////////////////////////////////Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class Day9_evenOdd {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do { 
            System.out.println("Enetr the number");
            num = K.nextInt();

            if(num%2 == 0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }

            System.out.println("Do you want to continue then press 1 else press 0");
            choice = K.nextInt();
        } while (choice == 1);

        System.out.println("Even sum "+ evenSum);
        System.out.println("Odd sum "+ oddSum);
    }
}
