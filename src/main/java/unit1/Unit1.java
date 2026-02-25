package unit1;

public class Unit1 {

	// Main method to test the static methods
	public static void main(String[] args) {
		// Test your methods here by calling them and printing the results
		System.out.println(addIntegers(5, 5));
        System.out.println(castDoubleToInt(5.5));
        System.out.println(isTrue(false));
        System.out.println(maxValueMinusOne());
        System.out.println(multiplyIntAndDouble(8, 3.7));
	}
 /**
  * Method 1: Returns the sum of two integers.
  * 
  *
  * @param a the first integer
  * @param b the second integer
  * @return the sum of a and b
  */
 public static int addIntegers(int a, int b) {
     int sum = a+b;
     return sum; // Placeholder return
 }

 /**
  * Method 2: Converts a double to an int by casting.

  *
  * @param value the double value to cast
  * @return the value cast to an int
  */
 public static int castDoubleToInt(double value) {
     int newNum = (int) value;
     return newNum; // Placeholder return
 }

 /**
  * Method 3: Checks if a boolean expression is true.
  * 
  * @param value the boolean value to check
  * @return true if value is true, false otherwise
  */
 public static boolean isTrue(boolean value) {
     if(value == true){
        return true;
     }
     else{
         return false;
     }
     // Placeholder return
 }

 /**
  * Method 4: Returns the maximum integer value minus one.
  
  *
  * @return Integer.MAX_VALUE minus one
  */
 public static int maxValueMinusOne() {
     int num = Integer.MAX_VALUE - 1;
     return num; // Placeholder return
 }

 /**
  * Method 5: Returns the product of an integer and a double as a double.

  * @param a the integer value
  * @param b the double value
  * @return the product of a and b as a double
  */
 public static double multiplyIntAndDouble(int a, double b) {
     double num = (double) (a*b);
     return num; // Placeholder return
 }
}
