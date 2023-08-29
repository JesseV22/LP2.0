package br.com.triangulo;

public class Triangulo {
	private int a, b, c;
	static final String EQUILATERO = "É um triângulo equilatero!";
	public static final String ESCALENO = "É um triângulo escaleno!";
	static final String ISOCELES = "É um triângulo isóceles!";
	static final String NAO = "Não pode ser triângulo!!!";
	static final String LADO = "Algum lado não é coerente com o lado de um triângulo!";

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	private boolean podeSerTriangulo() {
		if ((a + b) > c) {
			if ((a + c) > b) {
				if ((b + c) > a) {
					return true;
				}

			}

		}
		return false;
	}

	private boolean verificaLados() {
		if (a > 0) {
			if (b > 0) {
				if (c > 0) {
					return true;
				}
			}
		}
		return false;
	}

	public String decideTipoTriangulo() {

		if (verificaLados()) {
			if (podeSerTriangulo()) {

				if (a == b && a == c) {
					return EQUILATERO;
				}
				if (a == b || a == c || b == c) {
					return ESCALENO;
				}
				return ISOCELES;

			} else {
				return NAO;
			}
		} else {
			return LADO;
		}
	}

	public Triangulo(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangulo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.c = 0;
	}

	public Triangulo(int a) {
		super();
		this.a = a;
		this.b = 0;
		this.c = 0;
	}

	public Triangulo() {
		super();
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

}
