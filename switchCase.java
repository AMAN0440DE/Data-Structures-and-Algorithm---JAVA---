import java.util.*;
public class switchCase {
    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int number = K.nextInt();

        switch(number){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            default : System.out.println("AAj kam karne ka man nahi hai");
        }
    }
}
