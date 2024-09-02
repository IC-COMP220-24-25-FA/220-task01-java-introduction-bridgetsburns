package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radiusIn){
        radius = radiusIn;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = Math.PI*(this.radius)*(this.radius);
        return (area);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        radius = radius * 2;
    }

    public double returnRadius(){
        double returnRadius = radius;
        return returnRadius;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius * 2;
    }
}
