package epam.com.TddJunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
public class RemoveAIfFirstTwoTest {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
	RemoveAIfFirstTwo removeAIfFirstTwo;
	@BeforeEach
	public void setUp() {
		RemoveAIfFirstTwo removerAIfFirstTwo = new RemoveAIfFirstTwo(); 
	}
	@Test
	public void test0Chars() {
		assertEquals("",removeAIfFirstTwo.remove(""));
	}
	
	@Test
	public void test1CharRemoveA() {
		assertEquals("", removeAIfFirstTwo.remove("A"));
	}
	
	@Test
	public void test1CharNoAAtFirst() {
		assertEquals("B",removeAIfFirstTwo.remove("B"));
	}
	
	@Test
	public void test2CharsRemove2AChars() {
		assertEquals("", removeAIfFirstTwo.remove("AA"));
	}
	
	@Test
	public void test2CharsRemove1AAtFirst() {
		assertEquals("B", removeAIfFirstTwo.remove("AB"));
	}
	
	@Test
	public void test2CharsRemove1AAtSecond() {
		assertEquals("B",removeAIfFirstTwo.remove("BA"));
	}
	
	@Test
	public void test4CharsRemove2As() {
		assertEquals("CD", removeAIfFirstTwo.remove("AACD"));
	}
	
	@Test
	public void test4CharsRemove1AAtFirst() {
		assertEquals("BCD", removeAIfFirstTwo.remove("ABCD"));
	}
	
	@Test
	public void test4CharsRemove1AAtSecond() {
		assertEquals("BCD", removeAIfFirstTwo.remove("BACD"));
	}
	
	@Test
	public void test4CharsNoAAtFirstSecondPosition() {
		assertEquals("BBAA", removeAIfFirstTwo.remove("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", removeAIfFirstTwo.remove("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", removeAIfFirstTwo.remove("AABAA"));
	}
	
	@Test
	public void testNCharsNoAAtFirstSecondPosition() {
		assertEquals("BCDAB", removeAIfFirstTwo.remove("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", removeAIfFirstTwo.remove("AAAAAAA"));
	}


}



