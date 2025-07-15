// import java.util.*;
// public class continu {
//     public static void main(String args[]){
//         Scanner K = new Scanner(System.in);
//         int num = K.nextInt();
//         if(num%10==0){
//             continue;                                         can't use continue outside loop 
//         }
//         System.out.print(num);

//     }
// }

/////////////////////////////////////////////////////////using do while
import java.util.*;
public class Day9_continu {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        do { 
            int num = K.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Your num was " + num);
        } while (true);

    }
}
