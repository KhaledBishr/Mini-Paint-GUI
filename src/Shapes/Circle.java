package Shapes;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Circle implements Shape {
    private Point position;
    private double radius;
    private Color color;
    private Color fillColor;

    public Circle(Point position, double radius, Color color) {
        this.position = position;
        this.radius = radius;
        this.color = color;
        this.fillColor = null;
    }

    @Override
    public void draw(Graphics g) {
        
        if(fillColor != null)
        {
            g.setColor(fillColor);
             g.fillOval(position.x, position.y, (int)radius * 2, (int)radius * 2);
        }
        g.setColor(color);
        g.drawOval(position.x, position.y, (int)radius * 2,(int) radius * 2);
        
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> Properties) {
        if (Properties.containsKey("radius")) {
            this.radius = Properties.get("radius").doubleValue();
        }

    }

    @Override
    public Map<String, Double> getProperties() {
        
        Map<String, Double> properties = new HashMap<>();
        properties.put("radius", radius);
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        
        this.fillColor = color;

    }

    @Override
    public Color getFillColor() {
         return fillColor;
    }

}
