package lab1.rectangle;

public class TestRectangle {
	public static void main(String[]args) {
	Rectangle box1 = new Rectangle();
	Rectangle box2 = new Rectangle(10,5);
	
	box1.printBasicInfo();
	System.out.println("the perimeter is "+box1.findParimeter());
	System.out.println("the diagonal is "+box1.findDiagonal());
	if (box1.isSquare()==true) {
	System.out.println("It is a square box.");
	} else {
	System.out.println("It is not a squarebox.");
	}
	
	box2.printBasicInfo();
	System.out.println("the perimeter is "+box2.findParimeter());
	System.out.println("the diagonal is "+box2.findDiagonal());
	if (box2.isSquare()==true) {
	System.out.println("It is a square box.");
	} else {
	System.out.println("It is not a squarebox.");
	}
	}
}
