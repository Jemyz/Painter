package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.*;


public class Triangle extends Shape{
    
    private int XvertixA , YvertixA , XvertixB , YvertixB , XvertixC , YvertixC; 
    public Triangle(int xinitial , int yinitial , int xFinal, int yFinal , Color strokeColor , Color fillColor) {
        super(xinitial , yinitial , xFinal , yFinal , strokeColor , fillColor);       
        this.shapeName= "Triangle";
        this.xinitial = xinitial;
        this.yinitial = yinitial;

        this.xFinal = xFinal;
        this.yFinal = yFinal;
        
  
        if(yFinal < yinitial && xFinal > xinitial)
        {
            
            XvertixA = xinitial;
            YvertixA = yinitial/2 + yFinal/2;
            
            XvertixB = xFinal;
            YvertixB = yinitial;
            
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
            XvertixA = xinitial;
            YvertixA = yinitial/2 + yFinal/2;
            
            XvertixB = xFinal;
            YvertixB = yinitial;
            
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        else
        {
            XvertixA = xinitial/2 + xFinal/2;
            YvertixA = yinitial;
        
            XvertixB = xinitial;
            YvertixB = yFinal;
        
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        
        
    }
    
    
        
    
        

    @Override
    public void draw(Graphics2D g) {
       
        
        
  
        if(yFinal < yinitial && xFinal > xinitial)
        {
            
            XvertixA = xinitial;
            YvertixA = yinitial/2 + yFinal/2;
            
            XvertixB = xFinal;
            YvertixB = yinitial;
            
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
            XvertixA = xinitial;
            YvertixA = yinitial/2 + yFinal/2;
            
            XvertixB = xFinal;
            YvertixB = yinitial;
            
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        else
        {
            XvertixA = xinitial/2 + xFinal/2;
            YvertixA = yinitial;
        
            XvertixB = xinitial;
            YvertixB = yFinal;
        
            XvertixC = xFinal;
            YvertixC = yFinal;
        }
        
    
        
        int []xpoints = {XvertixA , XvertixB , XvertixC};
        int []ypoints = {YvertixA , YvertixB , YvertixC};
        
        Polygon temp = new Polygon(xpoints, ypoints, 3);
        
        if(!fillColor.equals(Color.WHITE))
        {
            g.setColor(getFillColor());
            g.fill(temp);
        }
        
        g.setColor(getStrokeColor());
        g.draw(temp);
        

        
    }
    
    
     @Override
    public boolean selected(int x, int y) {
        
        if(yFinal < yinitial && xFinal < xinitial)
        {
          
            if( x < xinitial && y < yinitial && x > xFinal && y > yFinal)return true;
            
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          if( x < xinitial && y > yinitial && x > xFinal && y < yFinal)return true;
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
          if( x > xinitial && y < yinitial && x < xFinal && y > yFinal)return true;
          
        }
        
        
        else
        {

            if( x > xinitial && y > yinitial && x < xFinal && y < yFinal)return true;
             
        }
        
        return false;
        
    }
    
}
