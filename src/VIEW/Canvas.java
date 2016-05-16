package VIEW;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.plaf.LayerUI;
import paintproject.shape.Circle;
import paintproject.shape.Ellipse;
import paintproject.shape.Line;
import paintproject.shape.Pencil;
import paintproject.shape.Rectangle;
import paintproject.shape.Rubber;
import paintproject.shape.Shape;
import paintproject.shape.Square;
import paintproject.shape.Triangle;

public class Canvas extends JPanel {
    protected List<Shape> shapes;
    protected List<Shape> UndoRedoTemp;
    //protected List<JLayer> layers;
    
    public Canvas() {
        shapes = new ArrayList<>();
        UndoRedoTemp = new ArrayList<>();
        //layers= new ArrayList<>();

        /*
        shapes.add(new Rectangle(50 , 50 , 100 , 80 , Color.blue , Color.GRAY));
        shapes.add(new Square(100 , 80 , 150 , 130 , Color.blue , Color.GRAY));
        shapes.add(new Rectangle(150 , 130 , 200 , 160 , Color.BLACK , Color.WHITE));
        shapes.add(new Ellipse(150 , 130 , 200 , 160 , Color.blue , Color.BLUE));
        shapes.add(new Circle(200 , 160 , 250 , 210 , Color.blue , Color.GRAY));
        shapes.add(new Rectangle(250 , 210 , 300 , 260 , Color.red , Color.WHITE));
        shapes.add(new Triangle(250 , 210 , 300 , 260 , Color.blue , Color.GRAY));
        shapes.add(new Line(300 , 260 , 350 , 310 , Color.blue));
        shapes.add(new Pencil(350 , 310 , Color.GREEN));
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(350, 311);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(351, 311);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(351, 312);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(352, 312);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(352, 313);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(353, 313);
        ((Pencil)shapes.get(shapes.size()-1)).addpoint(353, 314);
         shapes.add(new  Rubber(350, 310));
         Shape x = new Circle(10, 10, 20, 20, Color.yellow, Color.yellow);
         
        /*((Rubber)shapes.get(shapes.size()-1)).addpoint(350, 311);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(351, 311);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(351, 312);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(352, 312);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(352, 313);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(353, 313);
        ((Rubber)shapes.get(shapes.size()-1)).addpoint(353, 314);*/

    }
    
    public void addShape (Shape shape)
    {
        shapes.add(shape);
        repaint();
    }
    
    /*public void addLayer (Shape shape)
    {
        
        
    }*/
    
    public void deleteShape(Shape remove)
    {
        shapes.remove(remove);
    }
    
    public Shape select(int x , int y)
    {
        for (int i = shapes.size()-1 ; i >= 0 ; i--) {
           
           if(shapes.get(i).selected(x, y)){  return shapes.get(i);}
        }
        return null;
    }
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        Graphics2D graphSettings = (Graphics2D)g;

        graphSettings.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));   
        graphSettings.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphSettings.setStroke(new BasicStroke(2));
        int i =0;
        for (Shape shape: shapes) {
            /*System.out.println(shape.getShapeName()+ (i++)); 
            System.out.println(shape.getXinitial()+","+shape.getYinitial());
            System.out.println(shape.getxFinal()+","+shape.getyFinal()); */
            
            //graphSettings.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.40f));                
           // graphSettings.setPaint(shape.getStrokeColor());
            //graphSettings.setStroke(dashed);
            shape.draw(graphSettings);
        }
    }
}
