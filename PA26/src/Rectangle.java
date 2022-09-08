
public class Rectangle {
private int width;
private int height;

public Rectangle(int theWidth, int theHeight) {
	if(theWidth<0 || theHeight < 0) {
		theWidth = 0;
		theHeight = 0;
	}
	width = theWidth;
	height = theHeight;
}public Rectangle(int side){
	if(side < 0) {
		side = 0;
	}
	height = side;
	width = side;
}public Rectangle(){
	width = 1;
	height = 1;
}public void setHeight(int num){
	height = num;
}public void setWidth(int num) {
	width = num;
}public int getHeight() {
	return height;
}public int getWidth() {
	return width;
}public int getArea() {
	return width*height;
}public int getPerimeter() {
	return (width*2) + (height*2);
}public boolean isSquare() {
	if(width == height) {
		return true;
	}else
		return false;
}
	public static void main(String[] args) {
		

	}

}
