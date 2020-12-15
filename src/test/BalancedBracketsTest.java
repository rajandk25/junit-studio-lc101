package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello"));
    }
    @Test
    public void returnsFlaseIfOnlyOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello"));
    }
    @Test
    public void returnsFlaseIfOnlyCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello]"));
    }
    @Test
    public void returnsTrueIfBothBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello]"));
    }

    @Test
    public void returnsFlaseIfClosedBracketIsFirst()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Hello"));
    }
    @Test
    public void returnsFlaseIfOpenBracketIsLast(){

        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello["));
    }
    @Test
    public void returnsFlaseIfOppositeBrackets(){

        assertFalse(BalancedBrackets.hasBalancedBrackets("]Hello["));
    }


}
