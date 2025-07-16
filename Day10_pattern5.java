import java.util.*;
public class Day10_pattern5 {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int line = K.nextInt();

        // char ch = 'A';

        for(int i =1; i<=line; i++){
            for(char ch = 'A' ; ch<='A' + i; ch++){
                System.out.print(ch +" ");
            }
            
            System.out.println();
        }
    }
}