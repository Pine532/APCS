/*
Name: Owen Zhang
Block: D
Program: PA26
Date: 12/10/21
 */
public class PA26 {

    public static void main(String[] args) {
        Rectangle what = new Rectangle();
        what.setHeight(100);
        what.setWidth(80);
        System.out.println("the width is "+what.getWidth()+"ft");
        
        System.out.println(" the height is "+what.getHeight()+"ft");

        System.out.println("the area is "+what.getArea()+"ft");

        System.out.println("the Perimeter is "+what.getPerimeter()+"ft");

        System.out.print("is it square?: "+ what.isSquare());
    }

}