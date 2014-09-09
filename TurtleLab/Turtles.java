/*This class is for drawing patterns with turtles and exploring the api
 * Rob Norton
 * Completed on 9/9/2014
 */

import java.awt.Color;
import java.util.Random;

public class Turtles
{
    public static void main(String[] args)
    {
        World newWorld = new World(1400, 900);
        Picture img = new Picture("background.jpg");
        newWorld.setPicture(img);
        
        Turtle turtle1 = new Turtle(500, 500 ,newWorld);
        Turtle turtle2 = new Turtle(300, 300, newWorld);
        
        turtle1.setPenWidth(20);
        turtle2.setPenWidth(20);
        
        drawStar(turtle1);
        drawStar(turtle2);
        
        reposition(turtle1);
        reposition(turtle2);
        
        drawStar(turtle1);
        drawStar(turtle2);

    }
    
    public static void drawStar(Turtle turtle)
    {
        changeTurtle(turtle);
        turtle.turn(30);
        turtle.forward(200);
        changeTurtle(turtle);
        
        turtle.turn(135);
        turtle.forward(200);
        changeTurtle(turtle);
        
        turtle.turn(150);
        turtle.forward(200);
        changeTurtle(turtle);
        
        turtle.turn(145);
        turtle.forward(150);
        changeTurtle(turtle);
        
        turtle.turn(140);
        turtle.forward(180);
        turtle.turn(120);
    }
    
    public static void changeTurtle(Turtle turtle)
    {
        Random generator = new Random();
        int width = generator.nextInt(100);
        int height = generator.nextInt(100);
        turtle.setWidth(width);
        turtle.setHeight(height);
        
        int colorVar = generator.nextInt(7);
        Color penColor;
        if (colorVar == 0)
        {penColor = Color.RED;}
        
        else if (colorVar == 1)
        {penColor = Color.ORANGE;}
        
        else if (colorVar == 2)
        {penColor = Color.YELLOW;}
        
        else if (colorVar == 3)
        {penColor = Color.GREEN;}
        
        else if (colorVar == 4)
        {penColor = Color.BLUE;}
        
        else if (colorVar == 5)
        {penColor = Color.MAGENTA;}
        
        else {penColor = Color.CYAN;}
        
        turtle.setPenColor(penColor);
    }
    
    public static void reposition(Turtle turtle)
    {
        Random generator = new Random();
        int posx = generator.nextInt(1000) + 200;
        int posy = generator.nextInt(500) + 200;
        
        turtle.penUp();
        turtle.moveTo(posx, posy);
        turtle.penDown();
    }
}