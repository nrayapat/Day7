package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.PatternSearch;

class PatternSearchTest {

	@Test
	void testPatternSearch() throws FileNotFoundException, IOException {
		File file = new File("C:\\Nikhil\\nikhil1.txt");
				
		assertEquals("Line number 6 : import java.util.Objects;\n", PatternSearch.findString(file,"import"));
	}

}
