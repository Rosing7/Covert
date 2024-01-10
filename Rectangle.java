/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rupp_;

/**
 *
 * @author Admin
 */
public class Rectangle {
    private double width;
    private double length;
public Rectangle(double width, double length) {
this.width = width;
this.length = length;
}
public double getArea() {
return width * length;
}
public double getPerimeter() {
return 2 * (width + length);
}

}
