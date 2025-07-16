// import java.util.*;
// public class pattern2_Day10 {
//     public static void main(String args[]){
//         Scanner K = new Scanner(System.in);
//         int line = K.nextInt();

//         for(int i =line; i>=1; i--){
//             for(int j =line; j>=i; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }
///////////////////////////////////////////////////Wrong  ^^^^^^^^^^^^^^
/// 
/// 

import java.util.*;
public class Day10_pattern2 {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int line = K.nextInt();

        for(int i =1; i<=line; i++){
            for(int j =1; j<=(line-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
