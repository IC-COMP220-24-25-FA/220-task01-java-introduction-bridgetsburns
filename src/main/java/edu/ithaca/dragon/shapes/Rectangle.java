package edu.ithaca.dragon.shapes;

public class Rectangle {
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
        throw new RuntimeException("Not implemented yet");
    }
    
}
