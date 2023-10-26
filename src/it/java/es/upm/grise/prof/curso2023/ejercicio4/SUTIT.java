package es.upm.grise.prof.curso2023.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.grise.prof.curso2023.ejercicio4.SUT;

public class SUTIT {
	
	SUT sut;
	
	@BeforeEach
	public void setUp() {
		sut = new SUT();
	}
	
	@Test
	public void duplicatedAssertExample() {
		final int CERO = 0;
		final int UNO = 1;
		assertEquals(CERO, sut.doSomething(CERO));
		assertEquals(CERO, sut.doSomething(UNO));
	}
	
}
