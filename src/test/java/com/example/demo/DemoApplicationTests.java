package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	
 @Test
    public void testReverseString() {
        // Arrange
        String original = "Hello";
        String expectedReversed = "olleH";

        // Act
        String reversed = StringUtil.reverseString(original);

        // Assert
        assertEquals(expectedReversed, reversed);
    }

    @Test
    public void testReverseStringWithEmptyString() {
        // Arrange
        String original = "";
        String expectedReversed = "";

        // Act
        String reversed = StringUtil.reverseString(original);

        // Assert
        assertEquals(expectedReversed, reversed);
    }

    @Test
    public void testReverseStringWithNull() {
        // Act and Assert
        // Make sure your function handles null input gracefully
        assertEquals(null, StringUtil.reverseString(null));
    }
}
