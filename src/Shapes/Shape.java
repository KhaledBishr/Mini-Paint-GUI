package Shapes;

import java.awt.*;
import java.util.Map;

public interface Shape {
    // Set Position
    public void setPosition(Point position);
    public Point getPosition();

    //Update Shape Specific Properties (e.g. , radius)
    public void setProperties (Map<String , Double> Properties );
    public Map<String , Double>  getProperties ();

    //Colorize
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor( Color color);
    public Color getFillColor();

    //redraw the shape on the canvas
    public void draw (java.awt.Graphics canvas);

}