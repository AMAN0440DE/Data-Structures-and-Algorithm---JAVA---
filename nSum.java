import java.util.*;
public class nSum {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();

        long sum = 0;

        int i = 0;
        while(i<=a){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
