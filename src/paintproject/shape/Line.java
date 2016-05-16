package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


public class Line extends Shape{
    
public Line(int xinitial , int yinitial , int xFinal , int yFinal , Color strokeColor ) {
        super(xinitial , yinitial , xFinal , yFinal , strokeColor , Color.BLACK);       
        this.shapeName= "Line";
        
        this.xinitial = xinitial;
        this.yinitial = yinitial;

        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

Line2D temp ;


@Override
     public void draw(Graphics2D g) {

        
        
          temp = new Line2D.Float(getXinitial(), getYinitial(), getxFinal(), getyFinal());
         
        g.setColor(getFillColor());
        g.fill(temp);
        
        g.setColor(getStrokeColor());
        g.draw(temp);

        
    }

    @Override
    public boolean selected(int x, int y) {
       if (temp.contains(new Point(x, y)))return true;
       return false;
    }
    
}
