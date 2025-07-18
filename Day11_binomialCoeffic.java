// import java.util.*;
// public class binomialCoeffic_Day11 {

//     public static int bin(int n, int r){                                               // nCr = n! / r!(n-r)!
//         int fact_n = 1;
//         int fact_r = 1;
//         int fact_nr = 1;
//         for(int i =1; i<=n; i++){
//             fact_n *= i;
//         }
//         for(int i =1; i<=r; i++){
//             fact_r *= i;
//         }
//         for(int i =1; i<=(n-r); i++){
//             fact_nr *= i;
//         }

//         return (fact_n/(fact_r*(fact_nr)));
//     }
//     public static void main(String args[]){
//         Scanner K = new Scanner(System.in);
//         int n = K.nextInt();
//         int r = K.nextInt();
//         System.out.println(bin(n,r));
//     }
// }


////////////////////////////////////////////////////////  to shorten this code we can just use factorial function once 👇
/// 

import java.util.*;
public class Day11_binomialCoeffic {

    public static int factorial(int a){
        int fact =1;
        for(int i=1; i<=a; i++){
            fact*=i;
        }
        return fact;
    }

    public static int bin(int n, int r){                                               // nCr = n! / r!(n-r)!
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);
        
        return (fact_n/(fact_r*(fact_nr)));
    }
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int n = K.nextInt();
        int r = K.nextInt();
        System.out.println(bin(n,r));
    }
}