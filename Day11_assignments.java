import java.util.*;
public class Day11_assignments {

    // public static void avg(int a,int b,int c){              // to print avg of 3 numbers
    //     System.out.println((a+b+c)/3);
    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     int a = K.nextInt();
    //     int b = K.nextInt();
    //     int c = K.nextInt();
    //     avg(a,b,c);
    // }

    //////////////////////////////////////// to print avg of any number count
    // public static void avg(int arr[]){
    //     float sum = 0;                                           // float for getting accurate average
    //     for(int i=0; i<(float)arr.length; i++){                  // type casting length to float so that result wont get auto change to int 
    //         sum += arr[i];
    //     }
    //     System.out.println(sum/arr.length);
    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     System.out.println("Enter count of numbers for which average is to be printed..");
    //     int a = K.nextInt();
    //     int arr[] = new int[a];
    //     for(int i =0; i<a; i++){
    //         arr[i] = K.nextInt();
    //     }
    //     avg(arr);
    // }

    ///////////////////////////////////////////////// isEven//////////////////////////
    /// 
    // /// 
    // public static boolean isEven(int a){
    //     if(a%2==0){
    //         return true;
    //     }
    //     return false;
    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     int a = K.nextInt();
    //     boolean result = isEven(a);
    //     System.out.println(result);
    // }
/////////////////////////////////////////////////////////////isPalindrome ////////////////////////////////////////////

    public static boolean isPalindrome(int a){
        int original = a;                  // preserve the original 
        int rev = 0;
        while(a>0){
            int lastDigit = a%10;
            rev = rev*10+lastDigit;
            a/=10;
        }
        if(rev == original){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner K = new Scanner(System.in);
        int a = K.nextInt();
        boolean res = isPalindrome(a);
        System.out.println(res);
        
    }
    
    /////////////////////////////////////////////////// math functions
    /// 
    
    // public static void main(String args[]){
    //     System.out.println(Math.min(2,5 ));
    //     System.out.println(Math.max(2,5 ));
    //     System.out.println(Math.sqrt( 36));
    //     System.out.println(Math.pow( 10,2));
    //     System.out.println(Math.abs( -35));
    // }
    
    /*                                                                          all math inbuilt function 👇
abs(x)	Returns the absolute value of x	double|float|int|long
acos(x)	Returns the arccosine of x, in radians	double
addExact(x, y)	Returns the sum of x and y	int|long
asin(x)	Returns the arcsine of x, in radians	double
atan(x)	Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	double
atan2(y,x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
cbrt(x)	Returns the cube root of x	double
ceil(x)	Returns the value of x rounded up to its nearest integer	double
copySign(x, y)	Returns the first floating point x with the sign of the second floating point y	double|float
cos(x)	Returns the cosine of x (x is in radians)	double
cosh(x)	Returns the hyperbolic cosine of a double value	double
decrementExact(x)	Returns x-1	int|long
exp(x)	Returns the value of Ex	double
expm1(x)	Returns ex -1	double
floor(x)	Returns the value of x rounded down to its nearest integer	double
floorDiv(x, y)	Returns the division between x and y rounded down	int|long
floorMod(x, y)	Returns the remainder of a division between x and y where the result of the division was rounded down	int|long
getExponent(x)	Returns the unbiased exponent used in x	int
hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow	double
IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
incrementExact(x)	Returns x+1	int|double
log(x)	Returns the natural logarithm (base E) of x	double
log10(x)	Returns the base 10 logarithm of x	double
log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1	double
max(x, y)	Returns the number with the highest value	double|float|int|long
min(x, y)	Returns the number with the lowest value	double|float|int|long
multiplyExact(x, y)	Returns the result of x multiplied with y	int|long
negateExact(x)	Returns the negation of x	int|long
nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y	double|float
nextDown(x)	Returns the floating point value adjacent to x in the negative direction	double|float
nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity	double|float
pow(x, y)	Returns the value of x to the power of y	double
random()	Returns a random number between 0 and 1	double
rint(x)	Returns the double value that is closest to x and equal to a mathematical integer	double
round(x)	Returns the value of x rounded to its nearest integer	long|int
scalb(x, y)	Returns x multiplied by 2 to the power of y	double|float
signum(x)	Returns the sign of x	double|float
sin(x)	Returns the sine of x (x is in radians)	double
sinh(x)	Returns the hyperbolic sine of a double value	double
sqrt(x)	Returns the square root of x	double
subtractExact(x, y)	Returns the result of x minus y	int|long
tan(x)	Returns the tangent of an angle	double
tanh(x)	Returns the hyperbolic tangent of a double value	double
toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees	double
toIntExact(x)	Converts a long value to an int	int
toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians	double
ulp(x)	Returns the size of the unit of least precision (ulp) of x	double|float 


    // public static void main(String[] args) {
    //     int i = 7;
    //     int j = -9;
    //     double x = 72.3;
    //     double y = 0.34;

    //     System.out.println("i is " + i);
    //     System.out.println("j is " + j);

    //     // The absolute value of a number is equal to the
    //     // number if the number is positive or zero and
    //     // equal to the negative of the number if the number
    //     // is negative.

    //     System.out.println("|" + i + "| is " + Math.abs(i));
    //     System.out.println("|" + j + "| is " + Math.abs(j));

    //     // Truncating and Rounding functions
    //     // You can round off a floating point number to the
    //     // nearest integer with round()
    //     System.out.println(x + " is approximately " + Math.round(x));
    //     System.out.println(y + " is approximately " + Math.round(y));

    //     // The "ceiling" of a number is the smallest integer
    //     // greater than or equal to the number. Every
    //     // integer is its own ceiling.
    //     System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
    //     System.out.println("The ceiling of " + y + " is " + Math.ceil(y));

    //     // The "floor" of a number is the largest integer
    //     // less than or equal to the number. Every integer
    //     // is its own floor.
    //     System.out.println("The floor of " + x + " is " + Math.floor(x));
    //     System.out.println("The floor of " + y + " is " + Math.floor(y));

    //     // Comparison operators

    //     // min() returns the smaller of the two arguments
    //     // you pass it
    //     System.out.println("min(" + i + "," + j + ") is " + Math.min(i, j));
    //     System.out.println("min(" + x + "," + y + ") is " + Math.min(x, y));

    //     // There's a corresponding max() method
    //     // that returns the larger of two numbers
    //     System.out.println("max(" + i + "," + j + ") is " + Math.max(i, j));
    //     System.out.println("max(" + x + "," + y + ") is " + Math.max(x, y));

    //     // The Math library defines a couple of useful
    //     // constants:
    //     System.out.println("Pi is " + Math.PI);
    //     System.out.println("e is " + Math.E);

    //     // Trigonometric methods. All arguments are given in
    //     // radians
    //     // Convert a 45 degree angle to radians
    //     double angle = 45.0 * 2.0 * Math.PI / 360.0;
    //     System.out.println("cos(" + angle + ") is " + Math.cos(angle));
    //     System.out.println("sin(" + angle + ") is " + Math.sin(angle));

    //     // Inverse Trigonometric methods. All values are
    //     // returned as radians
    //     double value = 0.707;
    //     System.out.println("acos(" + value + ") is " + Math.acos(value));
    //     System.out.println("asin(" + value + ") is " + Math.asin(value));
    //     System.out.println("atan(" + value + ") is " + Math.atan(value));

    //     // Exponential and Logarithmic Methods
    //     // exp(a) returns e (2.71828...) raised
    //     // to the power of a.
    //     System.out.println("exp(1.0) is " + Math.exp(1.0));
    //     System.out.println("exp(10.0) is " + Math.exp(10.0));
    //     System.out.println("exp(0.0) is " + Math.exp(0.0));

    //     // log(a) returns the natural
    //     // logarithm (base e) of a.
    //     System.out.println("log(1.0) is " + Math.log(1.0));
    //     System.out.println("log(10.0) is " + Math.log(10.0));
    //     System.out.println("log(Math.E) is " + Math.log(Math.E));

    //     // pow(x, y) returns x raised to the power of y.
    //     System.out.println("pow(2.0, 2.0) is " + Math.pow(2.0, 2.0));
    //     System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0, 3.5));
    //     System.out.println("pow(8, -1) is " + Math.pow(8, -1));

    //     // sqrt(x) returns the square root of x.
    //     for (i = 0; i < 10; i++) {
    //         System.out.println("The square root of " + i + " is " + Math.sqrt(i));
    //     }

    //     // Finally there's one Random method
    //     // that returns a pseudo-random number
    //     // between 0.0 and 1.0;
    //     System.out.println("Here's one random number: " + Math.random());
    //     System.out.println("Here's another random number: " + Math.random());
    // }




*/


///////////////////////////////////////////////////////Write a Java method to compute the sum of the digits in an integer////////////////////////////////////////////////////////////
/// 
    
    
    // public static void digitSum(int a){
    //     int sum = 0;
    //     while(a>0){
    //         int lastDigit = a%10;
    //         sum += lastDigit;
    //         a/=10;
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String args[]){
    //     Scanner K = new Scanner(System.in);
    //     int a = K.nextInt();
    //     digitSum(a);
    // }


    
}
