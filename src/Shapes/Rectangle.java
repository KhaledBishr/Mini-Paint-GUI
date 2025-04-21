package Shapes;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Rectangle implements Shape {
    private Point position;
    private double width, length;
    private Color color;
    private Color fillColor;

    public Rectangle(Point position, double width, double length, Color color) {
        this.position = position;
        this.width = width;
        this.length = length;
        this.color = color;
        this.fillColor=null;
    }


    @Override
    public void setPosition(Point position) {
        this.position=position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> Properties) {
        if(Properties.containsKey("x") && Properties.containsKey("y")
           && Properties.containsKey("Length")&& Properties.containsKey("Width")){
            
            this.position.x=Properties.get("x").intValue();
            this.position.y=Properties.get("y").intValue();
            this.length =Properties.get("Length").doubleValue();
            this.width =Properties.get("Width").doubleValue();
        }
    }

    @Override
    public Map<String, Double> getProperties() {
        Map<String, Double> properties = new HashMap<>();
        properties.put("x", position.getX());
        properties.put("y",position.getY());
        properties.put("Length", length);
        properties.put("Width", width);
        return properties;
    }

    @Override
     public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor=color;

    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void draw(Graphics g) {   
         if(fillColor != null)
        {
            g.setColor(fillColor);
            g.fillRect(position.x, position.y,(int)width,(int)length);
        }
        g.setColor(color);
        g.drawRect(position.x,position.y,(int) width, (int) length);
        
    }
}
