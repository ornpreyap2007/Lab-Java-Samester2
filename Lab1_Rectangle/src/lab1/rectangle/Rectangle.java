package lab1.rectangle;

public class Rectangle {
	int width ;
	int length ;
	
	Rectangle(){
		width = 1;
		length =1;
	}
	Rectangle(int x,int y){
		width = x;
		length = y;
	}
	double findArea() {
		return width*length;
		
	}
	double findParimeter() {
		return 2*(length+width);
	}
	double findDiagonal() {
		return Math.sqrt(length*length+width*width);
	}
	boolean isSquare() {
		return length == width;
	}
	void printBasicInfo() {
		System.out.println("The width is "+width);
		System.out.println("The length is "+length);
	}
}
