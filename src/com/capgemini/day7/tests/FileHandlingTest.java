package com.capgemini.day7.tests;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.Test;
class FileHandlingTest {
	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\Nikhil");
		assertEquals(true, file.exists());
	}
}
