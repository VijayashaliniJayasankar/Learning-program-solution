// package com.example;

// public class AssertionsTest {

// }
// package com.example; // Make sure this matches your folder structure

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// public class AssertionsTest {

//     @Test
//     public void testAddition() {
//         int result = 2 + 3;
//         System.out.println("The result is: " + result);  // 👈 This will print: The result is: 5
//         assertEquals(5, result);  // ✅ This checks the result
//     }

//     // You can also keep other test methods here:
//     @Test
//     public void testTrueAssertion() {
//         assertTrue(10 > 1);
//     }
// }
import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

 public class AssertionsTest {
     @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}
