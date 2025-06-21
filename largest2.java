import java.util.*;
public class largest2{
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        int b = K.nextInt();
        int c = K.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is largest of all");
        }
        else if(b>c){
            System.out.println(b + " is largest of all");
        }
        else{
            System.out.println(c + " is largest of all");
        }

    }
}