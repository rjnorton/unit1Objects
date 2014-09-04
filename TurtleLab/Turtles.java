/*This class is for drawing patterns with turtles and exploring the api
 * Rob Norton
 */

import java.awt.Color;

public class Turtles
{
    public static void main(String[] args)
    {
        World newWorld = new World(1400,900);
        Picture img = new Picture("background.jpg");
        newWorld.setPicture(img);
        Turtle turtle1 = new Turtle(500,500,newWorld);
        turtle1.setHeight(100);
        turtle1.setPenColor(Color.RED);
        turtle1.drawStar();
    }
    
    public void drawStar();
    {
        turtle.forward();
    }
}