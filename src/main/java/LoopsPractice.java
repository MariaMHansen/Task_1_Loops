public class LoopsPractice {

  /*
       Welcome to assignment two,
       Where you will practice with different kinds of loops.
       Loops are a commonly used feature in programming,
       for executing a  part of code repeatedly until a condition evaluates to be true.
       We will also be exploring using as a tool loops for systematically guessing numbers.
       ------------------------------------------------------------
       Brute-Forcing with Loops
       -------------------------------------------------------------
       Brute-Forcing is tactic used by hackers for trying to crack a pin codes
       by simply trying out different combinations of numbers in succession.
       This technique is implemented using one or more loops to go through the numbers.
       This can be done using a for loop, a while loop or nested loops.

       In this exercise you will use different loops to
       create, check and guess pin codes.
       Scroll down to in STEP 1:
       */


    /**
     * This is the Main method,
     * Uncomment the lines of code for each method you implement
     * to test your solution
     * Experiment with entering your own attributes
     */

    public static void main(String[] args) {
        System.out.println("Task 1: Simple login: " + simpleLogin(1234));
        System.out.println("Task 2: Login system: " + loginSystem(1234));
        System.out.println("Task 3: Guess a number: " + guessNumber(5, 3, 10)+ " attempts");
        System.out.println("Task 4: Guess combination: " + guessCombination(123)+ " attempts");
        System.out.println("Task 5: Pin generator: " + pinGenerator(4));
    }
    /**
     *  STEP 1:
     *     A Simple Login Method
     *     Make a method that takes a pin code as an input,
     *     checks if it matches the correct pin code and
     *     returns "Login successful" if it is correct
     *     and "Login failed" if it is wrong
     *     The correct pin must be 1234
     *     Example: Using 1111 as input would return "Login failed"
     * @param pin the pin to compare with the correct one
     * @return  return the exact phrase provided in the description above
     * Points: 2
     * New skills: conditions
     * Difficulty: 1
     */
    public static String simpleLogin(int pin){
        int correctPin = 1234;
        if(pin==correctPin) {return "Login successful";}
        else {return "Login failed";}
    }
    /**
     *  STEP 2:
     *     A 3 attempt Login System
     *     To prevent Brute-Forcing, we need to upgrade our login system,
     *     by only allowing 3 wrong attempts to enter the password.
     *     Make a method that accepts a pin as input and tries to compare it
     *     to the correctPin 4 times.
     *     If the pin is correct the method returns "Login successful, total attempts: " +counter;
     *     If the pin is wrong the method returns "Login failed, total attempts: " +counter;
     *     The counter is a variable which counts how many times the loop was executed.
     *     Example: If we use 1111 as input the method will return
     *              Login failed, total attempts: 4
     * @param pin the pin to compare with the correct one
     * @return  a provided String followed by a counter variable
     * Points: 2
     * New skills: for loop with conditions
     * Difficulty: 2
     */
    public static String loginSystem(int pin){
        int correctPin = 1234;
        int counter = 1;
        for (int i=1; i<=4; i++){
            if(counter>3){
                break;
            }
            if(pin == correctPin){
                return "Login successful, total attempts: "+counter;
            }
            counter++;
        }

        return "Login failed, total attempts: "+counter;
    }

    /**
     *  STEP 3:
     *     Guessing A Small Number
     *     Make a loop that goes through numbers
     *     from targetNumber to endNumber one by one,
     *     until it finds a number that is equal to targetNumber.
     *     After the number is found the loop stops executing
     *     and returns the number of attempts it made to guess the number.
     *     Example: For input targetNumber 5, start number 3 and endNumber 10,
     *              the method will try numbers 3, 4, 5 and then
     *              return the number of attempts 3.
     *     Tip: Break the loop after the number is found.
     *     For this task the pin will always be within the range checked.
     * @param startNumber  number where the loop to starts
     * @param endNumber  number where the loop to stops
     * @param targetNumber  number which the loop is trying to guess
     * @return  whole number of attempts it took to guess the number
     * Points: 3
     * New skills: for loop with conditions and counter
     * Difficulty: 3
     */
    public static int guessNumber(int targetNumber, int startNumber, int endNumber){
        int counter = 0;
        for(int i = startNumber; i<endNumber; i++){
            counter ++;
            if (i==targetNumber){
                break;
            }
        }
        return counter;
    }

    /**
     *  STEP 4:
     *     Brute-Forcing Passwords
     *     For brute forcing passwords, which consist of not only numbers
     *     A loop is made per symbol. But for the sake of simplicity we will
     *     apply this technique to a numeric pin code.
     *     Imagine a combination lock. For 3 digits there are 3 wheels with numbers.
     *     If you forgot your password, you would
     *     try each number on the first wheel, with each number of the second wheel etc.
     *     The nested loops use the same principle.
     *     Make a method that uses nested loops to guess a 3 digit number.
     *     Example: For input targetNumber 5, start number 3 and endNumber 10,
     *              the method will try numbers 3, 4, 5 and then
     *              return the number of attempts 3.
     *     Tip: Remember to multiply by 100 for the first digit,
     *     and by 10 for the second digit when comparing to the 3 digit input pin
     * @param pin the code the method is trying to brute-force
     * @return  number of attempts it took to guess the number
     * Points: 2
     * New skills: nested loops
     * Difficulty: 4
     */
      public static int guessCombination (int pin){
        int counter = 0;
          for(int i = 0; i<10; i++) {
              for (int j = 0; j < 10; j++) {
                  for (int k = 0; k < 10; k++) {
                      counter++;
                      if (pin == ((i*100)+(j * 10) + k)) {
                          return counter;
                      }
                  }
              }
          }
        return counter;
    }

    /**
     *  STEP 5:
     *     A Pin Generator
     *     For security reasons it is not wise to use pin codes such as 1234,
     *     therefore we will make a method for generating random pin codes.
     *     Make a method that takes the size of the number that needs to be generated,
     *     and returns a random number, with the number of digits equal to size.
     *     Example: Using 4 as input would return a 4 digit random number
     *     Tip! Be aware of the data types, the number returned must be a Sring.
     *          To add an extra integer digit to a String number use
     *          result+= 1
     * @param size  number of digits for the random number
     * @return  whole number of attempts it took to guess the number
     * Points: 2
     * New skills: while loop with counter
     * Difficulty: 3
     */
    public static String pinGenerator(int size){
        String result ="";
        int counter = 0;
        while (counter <size){
            result+=(int)Math.floor(Math.random() * 10);
            counter ++;

        }
        return result;
    }
















    //////////////////////////////
    //  OLD CODE                //
    //////////////////////////////
    // Write a public static function `sayHello` that returns "hello world!"
    public static String sayHello(){
        // Add Your Code Here ...
        return "hello world!";
    }

    // Write a public static function that counts how many times the letter combination "dog" appears in the string
    public static int countDogs(String phrase) {
        // Add Your Code Here ...
        return -1;
    }
}