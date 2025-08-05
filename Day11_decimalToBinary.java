import java.util.*;
public class Day11_decimalToBinary {

    // public static void bin(int a){
    //     int binary=0;
    //     int power = 0;
    //     while(a>0){
    //         int rem = a%2;
    //         binary += rem*(int)Math.pow(10,power);
    //         power ++;
    //         a = a/2;
    //     }
    //     System.out.println(binary);

    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     int a = K.nextInt();
    //     bin(a);
    // }
    // Practice/////////////////////////////////////////////////////////////////////


    public static void bin(int a){
        int binary = 0;
        int power = 0;
        while(a>0){
            int rem = a%2;
            binary += rem*(int)Math.pow(10, power);
            power++;
            a /= 2;
        }
        System.out.println(binary);
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        bin(a);
    }
}   



