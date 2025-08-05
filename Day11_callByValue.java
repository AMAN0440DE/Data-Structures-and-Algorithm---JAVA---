import java.util.*;
public class Day11_callByValue {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        return;
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        int b = K.nextInt();
        swap(a,b);                                      // since swap fun is called and sout is present there so value gets swapped 
        System.out.println("a = "+a);                 // since we are not changing anything inside main so main stack frame is not disturbed 
        System.out.println("b = "+b);
        
    }
}                                                    // call by value: original remains same only value gets passed and if written inside main fun itself so call by refernce
