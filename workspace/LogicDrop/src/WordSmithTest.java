import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class WordSmithTest {
	
	WordSmith wordSmith;
	@Before
	public void setUp() throws Exception {
		wordSmith = new WordSmith();
	}
	
	//starting test for checking each division rules
	//creating new arrays in each test
	
	@Test
	public void testDividableby3() {
		ArrayList <String> expectedResult = new ArrayList<String>();
		expectedResult.add("word");
		assertEquals(expectedResult, wordSmith.getWord(6));
	}

	@Test
	public void testDivadableby5()
	{
		ArrayList <String> expectedResult= new ArrayList<String>();
		expectedResult.add("smith");
		assertEquals(expectedResult, wordSmith.getWord(5));
	}
	
	@Test
	public void testDivadableby15()
	{
		ArrayList <String> expectedResult = new ArrayList<String>();
		expectedResult.add("word");
		expectedResult.add("smith");
		expectedResult.add("wordsmith");
		assertEquals(expectedResult, wordSmith.getWord(15));
	}


	@Test
	public void testNoRequirement()
	{
		ArrayList <String> expectedResult = new ArrayList<String>();
		expectedResult.add("22");
		assertEquals(expectedResult, wordSmith.getWord(22));
	}
	
	@Test
	public void testNoRequirement2()
	{
		ArrayList <String> expectedResult = new ArrayList<String>();
		expectedResult.add("-1");
		assertEquals(expectedResult, wordSmith.getWord(-1));
	}
	
}
