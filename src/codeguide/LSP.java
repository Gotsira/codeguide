package codeguide;

/**
 * Exercise for the Liskov Substitution Principle. 
 * 
 * TODO Answer all of the TODO questions in the ANSWER comments.
 * 
 * @author Sirasath Piyapootinun
 *
 */

public class LSP {
	public static void main(String[] args) {
		
		// TODO Is it legal of not?
		Shape shape = new Shape(2 , 3);
		// ANSWER
	
		//TODO Is it legal or not?
		Shape rectangle = new Rectangle(2 , 3);
		// ANSWER
		
		//TODO Is it legal or not?
		Rectangle rectangle_2 = new Square(2 , 3);
		// ANSWER
		
		//TODO What will it print? True or false or an error?
		System.out.println(rectangle.area() == shape.area());
		// ANSWER
		
		//TODO What will it print? True or false or an error?
		System.out.println(rectangle_1.area() == shape.area());
		// ANSWER
	}
}

class Shape {
	private int length;
	private int width;
	
	/**
	 * Constructs a shape of a particular length and width.
	 * 
	 * @param length is the length of the shape.
	 * @param width is width of the shape.
	 */
	public Shape(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns the area of the shape.
	 * 
	 * @return area of the shape.
	 */
	public int area() {
		return this.length * this.width;
	}
	
	/**
	 * Return length of the shape.
	 * 
	 * @return length of the shape.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Return width of the shape.
	 * 
	 * @return width of the shape.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Return the information of the shape.
	 */
	public String toString() {
		return "Area is " + area();
	}
}

class Rectangle extends Shape {

	/**
	 * Constructs a rectangle of a particular length and width.
	 * 
	 * @param length is the length of the rectangle.
	 * @param width is width of the rectangle.
	 */
	public Rectangle(int length, int width) {
		super(length, width);
	}
	
	/**
	 * Returns the area of the shape.
	 * 
	 * @return area of the shape.
	 */
	public int area() {
		return super.getLength() * super.getWidth();
	}
	
	/**
	 * Return the information of the square.
	 */
	public String toString() {
		return "Area is " + area();
	}
}