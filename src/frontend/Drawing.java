
package frontend;

import Shapes.Shape;

/**
 *
 * @author DELL
 */
public interface Drawing {
     /* Manage shape objects */
    public void addShape(Shape shape);
    public void removeShape(Shape shape);

    /* Return the created shape objects */
    public Shape[] getShapes();

    /* Redraw all shapes on the canvas */
    public void refresh(java.awt.Graphics canvas);
}
