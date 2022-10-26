import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LoopsPracticeTest {
    LoopsPracticeTest() {
    }
    // Test 1
    @DisplayName("Checks if simple login returns true for the correct password.")
    @Test
    void simpleLoginTrueTest() throws Exception {
       Assertions.assertEquals("Login successful", LoopsPractice.simpleLogin(1234));
    }
    // Test 2
    @DisplayName("Checks if simple login returns false for the wrong password.")
    @Test
    void simpleLoginFalseTest() throws Exception {
        Assertions.assertEquals("Login failed", LoopsPractice.simpleLogin(1111));
    }
    // Test 3
    @DisplayName("Checks if login system returns true for the correct password.")
    @Test
    void loginSystemTrueTest() throws Exception {
        Assertions.assertEquals("Login successful, total attempts:"+1, LoopsPractice.loginSystem(1234));
    }
    // Test 4
    @DisplayName("Checks if login system returns false for the wrong password.")
    @Test
    void loginSystemFalseTest() throws Exception {
        Assertions.assertEquals("Login failed, total attempts: "+4, LoopsPractice.loginSystem(1111));
    }

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld() {
        Assertions.assertEquals("hello world!", LoopsPractice.sayHello());
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString() {
        int count = LoopsPractice.countDogs("cat cat catcat");
        Assertions.assertEquals(0, count);
    }

}