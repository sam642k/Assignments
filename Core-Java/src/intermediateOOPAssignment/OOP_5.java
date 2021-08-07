package intermediateOOPAssignment;

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	void draw() {
		System.out.println("Drawing a Line");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectange");
	}
}

class Cube extends Shape{
	void draw() {
		System.out.println("Drawing a Cube");
	}
}

public class OOP_5 {

	public static void main(String[] args) {
		Shape line= new Line();
		Shape rect= new Rectangle();
		Shape cube= new Cube();
		line.draw();
		rect.draw();
		cube.draw();
	}

}
