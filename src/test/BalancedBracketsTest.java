package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testOnlyBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void testStringWithNoBracketsReturnsTure () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World"));
    }
    @Test
    public void testStringWithMixedBalancedBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("H[ello W]or[ld]"));
    }
    @Test
    public void testThatUnbalancedBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][[]"));
    }
    @Test
    public void testStartingWithClosingBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMultipleSetsOfOpenBracketsThatCloseIsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

}
