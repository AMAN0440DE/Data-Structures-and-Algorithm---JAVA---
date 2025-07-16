import java.util.*;
public class Day10_pattern1 {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int line = K.nextInt();

        for(int i = 1; i<= line; i++){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

