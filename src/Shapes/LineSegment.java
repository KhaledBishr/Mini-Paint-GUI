package Shapes;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class LineSegment implements Shape {
    private Point start, end;
    private Color color;
    private Color fillColor;

    public LineSegment(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
        this.fillColor=null;
    }

    @Override
    public void draw(Graphics g) {
        if(fillColor != null)
        {
           g.setColor(fillColor);
           g.drawLine(start.x, start.y, end.x, end.y);
        }else{
           g.setColor(color);
           g.drawLine(start.x, start.y, end.x, end.y);
        }
    }

    @Override
    public void setPosition(Point position) {
        int dx = position.x - start.x;
        int dy = position.y - start.y;
        start.translate(dx, dy);
        end.translate(dx, dy);
    }

    @Override
    public Point getPosition() {
        return start;
    }

    @Override
    public void setProperties(Map<String, Double> Properties) {
        if (Properties.containsKey("startX") && Properties.containsKey("startY") &&
            Properties.containsKey("endX") && Properties.containsKey("endY")) {
            start = new Point(Properties.get("startX").intValue(), Properties.get("startY").intValue());
            end = new Point(Properties.get("endX").intValue(), Properties.get("endY").intValue());
        }

    }

    @Override
    public Map<String, Double> getProperties() {
        Map<String, Double> properties = new HashMap<>();
        properties.put("startX", (double) start.x);
        properties.put("startY", (double) start.y);
        properties.put("endX", (double) end.x);
        properties.put("endY", (double) end.y);
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
        this.fillColor=color;

    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

}
