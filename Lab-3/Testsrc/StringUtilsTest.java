import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
    @Test
    @DisplayName("Test if string is palindrome")
    void testIsPalindrome() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome("madam")); // Check palindrome
        assertFalse(stringUtils.isPalindrome("hello")); // Check non-palindrome
    }
    @Test
    @DisplayName("Test reverse of a string")
    void testReverseString() {
        StringUtils stringUtils = new StringUtils();
        assertEquals("olleh", stringUtils.reverse("hello")); // Verify reverse
        assertEquals("", stringUtils.reverse("")); // Verify empty string
    }
}