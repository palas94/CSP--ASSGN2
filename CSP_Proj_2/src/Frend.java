import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import prefuse.render.AbstractShapeRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;
public class Frend extends AbstractShapeRenderer
{
     // protected RectangularShape m_box = new Rectangle2D.Double();
     protected Ellipse2D m_box = new Ellipse2D.Double();
      
      @Override
      //decides the size of the node based on the number of neighboring nodes
      protected Shape getRawShape(VisualItem item)
      {
    	  
    	  m_box.setFrame(item.getX(), item.getY(),
               5*   (Integer) item.get("Frequency")/3,
               5*  (Integer) item.get("Frequency")/3);
    	  return m_box;
      }
}