package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.domain.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\Nikhil\\nikhil1.txt");
				

		assertEquals("Number of vowels = 15\nNumber of consonants = 35", VowelsAndConsonants.findVowelAndConsonant(file));
	}

}

