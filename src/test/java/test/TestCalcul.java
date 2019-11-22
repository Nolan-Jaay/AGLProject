package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Calcul;

public class TestCalcul {
	private Calcul subject;
	
	@Before
	public void setup() {
		subject=new Calcul();
	}

	@Test
	public void testAdd() {
		assertEquals(6, subject.addition(3, 3));
	}
	
	@Test
	public void testAdd1() {
		assertNotEquals(8, subject.addition(2, 5));
	}
	
	@Test
	public void testAdd2() {
		assertEquals(0, subject.addition(-3, 3));
	}
	
	@Test
	public void testMul() {
		assertEquals(6, subject.multiplication(2, 3));
	}
	
	@Test
	public void testMul1() {
		assertNotEquals(8, subject.multiplication(-2, 5));
	}
	
	@Test
	public void testMul2() {
		assertEquals(0, subject.multiplication(0, 3));
	}
	
	

}
