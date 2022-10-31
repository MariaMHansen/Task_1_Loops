import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * This class is for testing your solutions
 * Do not modify the tests if you wnat to avoid problems submitting your task to Classroom.
 * If you can not pass the assignment remotely, even though tests pass locally,
 * consider cloning a new repository, and copying your solution there,
 * to make sure this class was not modified by mistake.
 */
class LoopsPracticeTest {
    LoopsPracticeTest() {
    }

    // Test 1
    @DisplayName("Checks if simple login returns true for the correct password.")
    @Test
    void simpleLoginTrueTest() throws Exception {
        // Feedback in case the correct password fails
        if(LoopsPractice.simpleLogin(1234).equals("Login failed")){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " Have you changed the correct pin?\n" +
                    "          The correctPin must be 1234 for the test to work.\n"+
                    "          Your login method returns false for the correct pin code.\n"+
                    "          Please, check your conditional statements.\n"+
                    "          You can read more about if statements in:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

       Assertions.assertEquals("Login successful", LoopsPractice.simpleLogin(1234));
    }
    // Test 2
    @DisplayName("Checks if simple login returns false for the wrong password.")
    @Test
    void simpleLoginFalseTest() throws Exception {
        // Feedback in case the wrong password returns true
        if(LoopsPractice.simpleLogin(1111).equals("Login successful")){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " The login method failed to reject the wrong password.\n" +
                    "          This is a big security issue :) \n"+
                    "          You should check your conditional if statements.\n"+
                    "          You can read more about if statements in:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals("Login failed", LoopsPractice.simpleLogin(1111));
    }

    // Test 3
    @DisplayName("Checks if login system returns true for the correct password.")
    @Test
    void loginSystemTrueTest() throws Exception {
        Assertions.assertEquals("Login successful", LoopsPractice.loginSystem(1234));
    }
    // Test 4
    @DisplayName("Checks if login system returns false for the wrong password.")
    @Test
    void loginSystemFalseTest() throws Exception {
        // Feedback for counter counting one too many loop iterations
        if(LoopsPractice.loginSystem(1111).equals("Login failed, wrong attempts: "+4)){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " I looks like your counter counted the attempts, before the password match was checked.\n" +
                    "          Make sure to increase the counter after the password check condition.\n"+
                    "          You can find an example of a while loop counter in:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.2 The while Loop 183, counter-controlled loop\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback for a counter that does not iterate
        if(LoopsPractice.loginSystem(1111).equals("Login failed, wrong attempts: "+0)){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " Your counter is still on zero\n" +
                    "          The possible problem is that it doesn't increment.\n"+
                    "          There could be a missing counter ++ statement.\n"+
                    "          Or the counter is not inside the loop:\n"+
                    "          For an example of a while loop with counter see:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.2 The while Loop 183, counter-controlled loop\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals("Login failed, wrong attempts: "+3, LoopsPractice.loginSystem(1111));
    }
    // Test 5
    @DisplayName("Checks if guess a number returns the correct number of attempts.")
    @Test
    void guessNumberTest() {
        // Feedback for counter counting to zero
        if(LoopsPractice.guessNumber(5,3,7)==0){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " I looks like your counter didn't count the attempts, it is still zero.\n" +
                    "          The possible problem is that it doesn't increment.\n"+
                    "          There could be a missing counter ++ statement.\n"+
                    "          Or the counter is not inside the loop:\n"+
                    "          You can read more about counters in loops in:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 5 Introduction \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the counter keeps counting after the number is found
        if(LoopsPractice.guessNumber(5,3,7)==7){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " The number of attempts returned by your method is too high.\n" +
                    "          Did you remember to break the loop after finding the matching number?\n"+
                    "          Another possible problem is that your counter increments before \n"+
                    "          the matching condition is checked. \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.2 The while Loop 183, counter-controlled loop\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the loop starts at zero
        if(LoopsPractice.guessNumber(5,3,7)==6){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " The number of attempts is incorrect.\n" +
                    "          Does your loop start as i=0?\n"+
                    "          It is supposed to start from the startNumber given. \n"+
                    "          You might want to check the task description. \n"+
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(3, LoopsPractice.guessNumber(5,3,10));
    }

    // Test 6
    @DisplayName("Checks if guess combination returns the correct number of attempts.")
    @Test
    void guessCombinationTest() {
        // Feedback for a counter that does not iterate
        if(LoopsPractice.guessCombination(123)==0){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " Your counter is still on zero\n" +
                    "          The possible problem is that it doesn't increment.\n"+
                    "          There could be a missing counter ++ statement.\n"+
                    "          Or the counter is not inside the loop:\n"+
                    "          For an example of a while loop with counter see:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.2 The while Loop 183, counter-controlled loop\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the counter is incremented one time too many before the loop breaks
        if(LoopsPractice.guessCombination(123)==124){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You are close to the correct solution!\n" +
                    "          But the counter incremented one times too many.\n"+
                    "          Try moving it after the if statement that checks for the match.\n"+
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the loop keeps iterating after the number is found
        if(LoopsPractice.guessCombination(123)==999){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " Looks like the nested loops are going through all the 999 combinations.\n" +
                    "          That is a great start, but remember to stop the loop after the number is found.\n"+
                    "          Try using a conditional statement inside the loop.\n"+
                    "          Also reread the tips in the task description.\n"+
                    "          Foe examples of stopping the loop see:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.12 Keywords break and continue\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(123, LoopsPractice.guessCombination(123));
    }
    // Test 7
    @DisplayName("Checks if pin generator returns the number of digits reqiested.")
    @Test
    void pinGeneratorTest() throws Exception {
        // Feedback for counter counting one too many loop iterations
        if((LoopsPractice.pinGenerator(6)).length()==4){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " Your method can generate 4 digit numbers, witch is a good start. \n" +
                    "          Have you tested it with longer numbers?\n"+
                    "          Your pin generator loop should complete the number of iterations:\n"+
                    "          Defined by the parameter passed to the method.\n"+
                    "          If 6 is passed it should return a 6 digit number.\n"+
                    "          Try using a counter, which adds a random to the result \n"+
                    "          For each iteration until it reaches the number of digits defined. \n"+
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback for a counter that does not iterate
        if(LoopsPractice.pinGenerator(4).equals(LoopsPractice.pinGenerator(4))){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " Your method generates the same pin every time instead of making it random.\n" +
                    "          You can try to use Math.random() and cast it to (int).\n"+
                    "          There is an example of using it in the book:\n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "           7.2.6 Processing Arrays, Initializing arrays with random values example\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(6, (LoopsPractice.pinGenerator(6)).length());
    }
}