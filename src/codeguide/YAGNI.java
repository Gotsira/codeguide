package codeguide;

/**
 * YAGNI class is used to perform several mathematics calculations. It is like a calculator.
 * 
 * TODO remove all extra attributes or method in which the program does not require.
 * 
 * @author Sirasath Piyapootinun
 * @version 3.2.2017
 *
 */

public class YAGNI {
	// Value used in the mathematics calculations.
	private double a;
	
	// Value used in the mathematics calculations.
	private double b;
	
	// Name of the person.
	private String name;
	
	// Grade of the person.
	private int grade;
	
	/**
	 * Constructs a calculator with a value of a and b.
	 * 
	 * @param a is the value to be performed.
	 * @param b is the value to be performed.
	 */
	public YAGNI(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Returns the sum of a and b.
	 * 
	 * @return sum of a and b.
	 */
	public double add() {
		return a + b;
	}
	
	/**
	 * Returns the solution of a subtracts b.
	 * 
	 * @return the solution of a subtracts b.
	 */
	public double subtract() {
		return a - b;
	}
	
	/**
	 * Returns the solution of a multiply by b.
	 * 
	 * @return the solution of a multiply by b.
	 */
	public double multiply() {
		return a * b;
	}
	
	/**
	 * Returns the solution of a divided by b.
	 * 
	 * @return the solution of a divided by b.
	 */
	public double divide() {
		return a / b;
	}
	
	/**
	 * Gets the value of a.
	 * 
	 * @return the value of a.
	 */
	public double getA() {
		return a;
	}

	/**
	 * Sets the value of a.
	 * 
	 * @param a is the value used for mathematics calculations.
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Gets the value of b.
	 * 
	 * @return the value of b.
	 */
	public double getB() {
		return b;
	}

	/**
	 * Sets the value of b.
	 * 
	 * @param b is the value used for mathematics calculations.
	 */
	public void setB(double b) {
		this.b = b;
	}
	
	/**
	 * Gets the name of the person.
	 * 
	 * @return the of the person.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the person.
	 * 
	 * @param name is the name of the person.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}