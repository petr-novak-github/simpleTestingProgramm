package cz.vsb.signumTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import cz.vsb.signum.*;

class Signum2Test {
	
	private static final double DELTA = 0.000001;
	Signum2 s;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		s = new Signum2();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void znamenkoProMinus3JeMinus1() {
		
		int actual = s.znamenko2(-3);
		assertEquals(-1,actual);
	}
	
	@Test
	void znamenkoProNuluJe0() {
		
		int actual = s.znamenko2(0);
		assertEquals(0,actual);
		
		
	}
	
	
	@Test
	void znamenkoProOsmJe1() {
		
		int actual = s.znamenko2(8);
		assertEquals(1,actual,DELTA);
		
	}
	
	@Test
	void znamenkoProStringovouMinus4JeMinus1() {
		
		double actual = s.znamenko2("-4");
		assertEquals(-1,actual,DELTA);
		
	}
	
	@Test
	void znamenkoProStringovouNuluJe0() {
		
		double actual = s.znamenko2("0");
		assertEquals(0,actual,DELTA);
		
	}
	
	@Test
	void znamenkoProStringovouSemickuJe1() {
		
		double actual = s.znamenko2("7");
		assertEquals(1,actual);
		
	}
	
	@Test
	void znamenkoProStringovouSemickuCelychTriJe1() {
		
		double actual = s.znamenko2("7.3");
		assertEquals(1,actual);
		
	}
	
	@Test
	void znamenkoProStringovouMinusSemickuCelychTriJeMinus1() {
		
		double actual = s.znamenko2("-7.3");
		assertEquals(-1,actual);
		
	}
	
	@Test
	void znamenkoProText() {
		
		//double actual = s.znamenko2("aaa");
		assertThrows(NumberFormatException.class, ()->s.znamenko2("aaa"), "spatny format");
		
	}

	

}