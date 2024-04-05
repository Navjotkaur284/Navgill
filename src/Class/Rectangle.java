package Class;


import java.awt.geom.Area;

public class Rectangle {

    double width = 100;
    double length = 20;
    double area;
    public void calculateArea(){
        area = width * length;
        System.out.println("Area of rectangle  " + area)  ;
    }
    public static void main (String[] args){

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();


    }


}
