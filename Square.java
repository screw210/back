package test1;

public class Square {
	int height;
	int width;
	
	public int getArea() {
		int area = height * width;
		return area;
	}
	public int getround() {
		int round = (height + width) * 2;
		return round;
	}
}
