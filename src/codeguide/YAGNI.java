package codeguide;

/**
 * YAGNI class is used to perform several mathematics calculations.
 * 
 * TODO remove all extra attributes or method in which the program does not require.
 * 
 * @author Sirasath Piyapootinun
 * @version 3.2.2017
 *
 */

public class YAGNI {
	private double a;
	private double b;
	private String name;
	
	public YAGNI(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double add() {
		return a + b;
	}
	
	public double subtract() {
		return a - b;
	}
	
	public double multiply() {
		return a * b;
	}
	
	public double divide() {
		return a / b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}