import java.util.*;
public class Day9_mulTable {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int num = K.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
