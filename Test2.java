/**
 * Created by ITHOD on 29-08-2016.
 */
abstract class Shape
{
    String color;
    boolean filled;
    public Shape()
    {
        color="Green";
        filled=true;
    }
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    abstract public String toString();

}
class Circle extends Shape{
    double radious;
    public Circle()
    {
        radious=0;
    }

    public Circle(double radious, String color, boolean filled)
    {
        super(color,filled);
        this.radious=radious;

    }
    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String toString()
    {
        return "Circle[Shape[color="+color+",filled="+filled+"],radious="+radious+"]";
    }
    @Override
    double getArea() {
        return 3.14*radious*radious;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radious;
    }
}
class Rectangle extends Shape
{
    double width;
    double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    double getArea() {
        return width*lenght;
    }

    @Override
    double getPerimeter() {
        return 2*width*lenght;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color="+color+",filled="+filled+"]width="+width+",length="+lenght+"]";
    }
}
class Square extends Rectangle
{

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    double getSide()
    {
        return super.getWidth();
    }
    void setSide(double side)
    {
        super.setWidth(side);
        super.setLenght(side);
    }
    public String toString()
    {
        return "Rectangle[Shape[color="+color+",filled="+filled+"],side="+width+"]";
    }
}
public class Test2 {
	public static void main(String args[]){
		Circle c1=new Circle(2,"Red",true);
		Rectangle r1=new Rectangle(2,3);
		Square s1=new Square(2);
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(s1);
	}
}