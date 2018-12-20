package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    @Test
    public void palindrome() {
        String expected = "Palindrome";
        String actual = palindrome.palindrome("madam");
        assertEquals(expected, actual);
    }
    @Test
    public void notSamePalindrome() {
        String expected = "Palindrome";
        String actual = palindrome.palindrome("hellomadam");
        assertNotSame(expected, actual);
    }
    @Test
    public void notPalindrome() {
        String expected = "Not Palindrome";
        String actual = palindrome.palindrome("stackroute");
        assertEquals(expected, actual);
    }
}