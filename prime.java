import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int num = K.nextInt();
        boolean isPrime = true;

        if(num==2){
            System.out.println("Num is Prime");
        }
        else{
            for(int i = 2; i<= Math.sqrt(num); i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println("Num is Prime");
            }
            else{
                System.out.println("Num is not Prime");
            }
        }
    }
}
