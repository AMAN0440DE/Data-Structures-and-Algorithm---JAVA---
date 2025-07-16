import java.util.*;
public class Day9_reversePrint {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int num = K.nextInt();
        while(num>0){
            int lastDigit = num%10;
            num = num/10;
            System.out.print(lastDigit);
        }
    }
}
