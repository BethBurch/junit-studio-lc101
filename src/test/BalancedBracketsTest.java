package test;
// TODO: import BalancedBrackets class from main package

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // TODO: Test balanced brackets in front of other characters — "[]"
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // TODO: Test balanced brackets in front of other characters — "[]LaunchCode"
    @Test
    public void pairOfBracketsBeforeOtherCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    // TODO: Test balanced brackets in front of other characters — "Launch[Code]"
    @Test
    public void pairOfBracketsInTheMiddleOfCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // TODO: Test balanced brackets in front of other characters — "[LaunchCode]"
    @Test
    public void pairOfBracketsCoveringEntireCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // TODO: Test balanced brackets — ""
    @Test
    public void pairOfBracketsAreEmptyButValid() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // TODO: Test unbalanced brackets — "[LaunchCode"
    @Test
    public void missingClosingBracketWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void invalidFlippedFloppedBracketsWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void missingClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void missingOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void invalidFlippedFloppedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void multipleMismatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]["));
    }
//  TODO: The string may contain non-bracket characters as well.
    @Test
    public void charactersInBracketsAreNonBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[#$%]"));
    }
}
