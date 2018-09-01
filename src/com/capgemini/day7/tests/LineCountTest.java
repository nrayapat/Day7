package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.LineCount;

class LineCountTest {

	@Test
	void testLineCount() {
		File file = new File("C:\\Nikhil\\nikhil1.txt");
				
		assertEquals(3, LineCount.count(file));
	}

}