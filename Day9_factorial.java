
// import java.util.*;

// public class factorial {
//     public static void main(String args[]){
//         Scanner K = new Scanner(System.in);
//         int num = K.nextInt();
//         long factorial = 1;
//         if(num<=0){
//             System.out.println("Factorial exists for positive only");
//         }
//         else{
//             for(int i = num; i>=1 ; i--){
//                 factorial *= i;
//             }
//             System.out.println(factorial);
//         }

//     }
// }



import java.util.*;

public class Day9_factorial {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int num = K.nextInt();
        long factorial = 1;
        if(num<=0){
            System.out.println("Factorial exists for positive only");
        }
        else{
            for(int i = 1; i<= num ; i++){                                           // can also work in decreasing way 👆
                factorial *= i;
            }
            System.out.println(factorial);
        }

    }
}