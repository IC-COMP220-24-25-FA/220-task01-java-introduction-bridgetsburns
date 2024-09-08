package edu.ithaca.dragon.shapes;

public class Rectangle implements ShapeInterface{
    private double length;
    private double width;

    public Rectangle(double lengthIn, double widthIn){
        if (lengthIn <= 0 || widthIn <= 0 ){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        else{
            length = lengthIn;
            width = widthIn;
        }
    }

    public double calcArea(){
       double area = length * width;
       return area;
    }

    public void doubleSize(){
        length = length *2;
        width = width * 2;
    }

    public double longestLineWithin(){
        double longestLine = Math.sqrt((length * length)+ (width * width));
        return longestLine;
    }
    public String toString(){
        return "This is a rectangle with a width of "+ width + "and a length of " + length;
    }
    
}
