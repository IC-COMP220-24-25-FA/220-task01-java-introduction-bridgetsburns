package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        if (baseIn <= 0 || heightIn <= 0){
            throw new IllegalArgumentException("Base and height must be greater than 0");
        }
        else{
            base = baseIn;
            height = heightIn;
        }
    }

    public double calcArea(){
        return ((base * height)/2);
    }

    public void doubleSize(){
        base = base * 2;
        height = height * 2;
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not Implemented");
    }

}
