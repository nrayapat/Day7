package com.capgemini.filehandling.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.WordCount;

class WordCountTest {

	@Test
	void testWordCount() {
		File file = new File("C:\\Nikhil\\nikhil1.txt"
				);

		assertEquals(3, WordCount.countWords(file));
	}

}