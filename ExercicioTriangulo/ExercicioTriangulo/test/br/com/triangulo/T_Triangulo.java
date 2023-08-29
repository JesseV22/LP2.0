package br.com.triangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class T_Triangulo {
	

	@Test
	void caseT1() {
		System.out.println("Caso 1:");
		Triangulo t1 = new Triangulo(3, 3, 5);
		String resp = t1.decideTipoTriangulo();
		System.out.println(resp); 
		assertEquals(Triangulo.ESCALENO, resp);
	}
	@Test
	void caseT2() {
		System.out.println("Caso 2:");
		Triangulo t1 = new Triangulo(4, 3, 5);
		String resp = t1.decideTipoTriangulo();
		System.out.println(resp);
		assertEquals(Triangulo.ISOCELES, resp);
	}
	@Test
	void caseT3() {
		System.out.println("Caso 3:");
		Triangulo t1 = new Triangulo(5, 5, 5);
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.EQUILATERO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT4a() {
		System.out.println("Caso 4.1:");
		Triangulo t1 = new Triangulo(3, 4, 5);
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.ISOCELES, t1.decideTipoTriangulo());
	}
	void caseT4b() {
		System.out.println("Caso 4.2:");
		Triangulo t1 = new Triangulo(5, 3, 4);
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.ISOCELES, t1.decideTipoTriangulo());
	}
	void caseT4c() {
		System.out.println("Caso 4.3:");
		Triangulo t1 = new Triangulo(4, 3, 5);
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.ISOCELES, t1.decideTipoTriangulo());
	}
	@Test
	void caseT5() {
		Triangulo t1 = new Triangulo(2, 3, 0);
		System.out.println("Caso 5:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.LADO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT6() {
		Triangulo t1 = new Triangulo(2, 3, -2);
		System.out.println("Caso 6:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.LADO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT7() {
		Triangulo t1 = new Triangulo(2, 3, 5);
		System.out.println("Caso 7:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT8a() {
		Triangulo t1 = new Triangulo(8, 3, 5);
		System.out.println("Caso 8.1:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT8b() {
		Triangulo t1 = new Triangulo(2, 5, 3);
		System.out.println("Caso 8.2:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT9() {
		Triangulo t1 = new Triangulo(2, 3, 19);
		System.out.println("Caso 9:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT10a() {
		Triangulo t1 = new Triangulo(2, 3, 19);
		System.out.println("Caso 10.1:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT10b() {
		Triangulo t1 = new Triangulo(30, 3, 4);
		System.out.println("Caso 10.2:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.NAO, t1.decideTipoTriangulo());
	}
	@Test
	void caseT10c() {
		Triangulo t1 = new Triangulo(2, 30, 10);
		System.out.println("Caso 10.3:");
		System.out.println(t1.decideTipoTriangulo());
	}
	@Test
	void caseT11() {
		Triangulo t1 = new Triangulo(0, 0, 0);
		System.out.println("Caso 11:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.LADO, t1.decideTipoTriangulo());
	}
	
	@Ignore
	void caseT12() {
		Triangulo t1 = new Triangulo(2, 3, 2.25);
		System.out.println("Caso 12:");
		System.out.println(t1.decideTipoTriangulo());
	}
	@Test
	void caseT13() {
		Triangulo t1 = new Triangulo(2, 3);
		System.out.println("Caso 13:");
		System.out.println(t1.decideTipoTriangulo());
		assertEquals(Triangulo.LADO, t1.decideTipoTriangulo());
	}
}
