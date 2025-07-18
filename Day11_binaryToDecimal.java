import java.util.*;
public class Day11_binaryToDecimal {

    // public static void dec(int a){
    //     int power = 0;
    //     int decimal = 0;
    //     while(a>0){
    //         int lastDigit = a%10;
    //         decimal += lastDigit*Math.pow(2,power);
    //         power++;
    //         a = a/10;
    //     }
    //     System.out.println(decimal);
    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     int a = K.nextInt();
    //     dec(a);
    // }

    // Practice/////////////////////////////////////////////

    public static void decimal(int a){
        int dec = 0;
        int power = 0;
        while(a>0){
            int lastDigit =a%10;
            dec += lastDigit*(int)Math.pow(2, power);
            power++;
            a /= 10;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        decimal(a);
    }
}
