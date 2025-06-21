import java.util.*;
public class calculater {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        System.out.println("Enetr a");
        int a =K.nextInt();
        System.out.println("Enter b");
        int b = K.nextInt();
        System.out.println("Enter operator");
        char operator = K.next().charAt(0);

        switch(operator){
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default: System.out.println("invalid operator");
        }
    }
}
