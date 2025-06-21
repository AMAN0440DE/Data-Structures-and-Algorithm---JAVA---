import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int num = K.nextInt();
        int counter = 1;
        while(counter<=num){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println("Printed " + num + " times");
    }
}
