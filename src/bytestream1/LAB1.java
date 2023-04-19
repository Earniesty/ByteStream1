/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestream1;

/**
 *
 * @author Dell
 */
public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator CircleDecorator = new RedShapeDecorator(circle);
        CircleDecorator.draw();
        
        
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator RectangleDecorator = new RedShapeDecorator(rectangle);
        RectangleDecorator.draw();
    }
}
