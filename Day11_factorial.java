import java.util.*;
public class Day11_factorial {

    public static int fact(int a){
        int factorial = 1;
        for(int i=1; i<=a; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        int result = fact(a);
        System.out.println(result);
        System.out.println(fact(a));       // another way to print
    }
}
