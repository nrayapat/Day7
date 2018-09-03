package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Mag;

import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class MonthlyTimeTest {

		@Test
		void test() {
			assertEquals(true, Mag.checkMagic(2,2,04));
			assertEquals(false,Mag.checkMagic(2,2,14));
		}

	}