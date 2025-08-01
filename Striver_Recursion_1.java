import java.util.*;
public class Striver_Recursion_1 {
    static int count = 0 ;         // make count = 0 as static to access in static classes 
    public static void f(){
        // int count = 0;             The variable count is declared and initialized to 0 inside the method f(). Every time f() is called, count is reset to 0, so count never reaches 3, and the base case (if(count == 3)) is never true.
        if(count == 3){             // base case: stopping case for stack overflow
            return;
        }
        System.out.println(count);
        count++;
        f();
    }
    // Q1 Print name n times using recursion
    public static void q1(int i ,int n){
        if(i > n){
            return;
        }
        System.out.println("Aman");
        q1(i+1, n);
    }

    // Q2 Print 1 to N 
    public static void q2(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        q2(i+1, n);
    }

    // Q3 Print N to 1
    public static void q3(int i , int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        q3(i-1,n);
    }

    // Q4 Print 1 to N using Backtracking
    public static void q4(int i , int n){
        if(i<1){
            return;
        }
        q4(i-1,n);
        System.out.println(i);
    } 

    // Q5 Print N to 1 using Backtarcking
    public static void q5(int i , int n){
        if(i>n){
            return;
        }
        q5(i+1, n);
        System.out.println(i);
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        f();
        
        int n = K.nextInt();
        q1(1, n);
        System.out.println("Q1 Done /////////////////////////////");
        q2(1, n);
        System.out.println("Q2 Done /////////////////////////////");
        q3(n, n);          // n , n because eg. 3, 3 will pass and compare 3<1, 2<1, 1<1, 0<1 -> return
        System.out.println("Q3 Done /////////////////////////////");
        q4(n, n);
        System.out.println("Q4 Done /////////////////////////////");
        q5(1, n);
        System.out.println("Q5 Done /////////////////////////////");


    }
}
