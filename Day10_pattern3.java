import java.util.*;
public class Day10_pattern3 {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int line = K.nextInt();
        for(int i =0; i<=line; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
