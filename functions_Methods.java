import java.util.*;
public class functions_Methods{

    public static int sumCalculate(int num1, int num2){              // parameters/ formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        int b = K.nextInt();
        int sum = sumCalculate(a,b);                                 // arguments/ actual parameters
        System.out.println(sum);

    }
}
