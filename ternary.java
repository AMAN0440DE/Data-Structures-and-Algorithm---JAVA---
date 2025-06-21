import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        String b = ((a%2==0) ? "EVEN" : "ODD");
        System.out.println(b);
    }
}
