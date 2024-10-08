package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        /* 
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();

        rectangleList.add(new Rectangle(10, 20));
        rectangleList.add(new Rectangle(5, 25));
        rectangleList.add(new Rectangle(7, 12));
        rectangleList.add(new Rectangle(14, 28));
        rectangleList.add(new Rectangle(27, 102));

       
        for (int i = 0; i < 5; i++){
        
        for (int j = 0; j < rectangleList.size(); j++){
            double area = rectangleList.get(j).calcArea();
            double longestLine = rectangleList.get(j).longestLineWithin();
            System.out.println("Rectangle " + (j+1) + ": area = " + area + ", longest line = " + longestLine);
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Which rectangle would you like to double in size?");
        int rectangleNumber = myObj.nextInt() - 1;
        rectangleList.get(rectangleNumber).doubleSize(); 
    }
    for (int j = 0; j < rectangleList.size(); j++){
        double area = rectangleList.get(j).calcArea();
        double longestLine = rectangleList.get(j).longestLineWithin();
        System.out.println("Rectangle " + (j+1) + ": area = " + area + ", longest line = " + longestLine);
    }
        */

    ArrayList<ShapeInterface> shapeList = new ArrayList<ShapeInterface>(); 
    for (int i = 0; i < 10; i++){
        Random random = new Random();
        int randint = random.nextInt(2);
        if (randint == 0){
            shapeList.add(new Rectangle(random.nextInt(30),random.nextInt(30)));
        }
        if (randint == 1){
            shapeList.add(new Triangle(random.nextInt(30), random.nextInt(30)));
        }
        if (randint == 2){
            shapeList.add(new Circle(random.nextInt(30)));
        }
    }
    for (int i = 0; i < shapeList.size(); i++){
        System.out.println(shapeList.get(i).toString());
    }
    for (int i = 0; i < shapeList.size(); i++){
        shapeList.get(i).doubleSize();
    }
    for (int i = 0; i < shapeList.size(); i++){
        System.out.println(shapeList.get(i).toString());
    }
    }
}
