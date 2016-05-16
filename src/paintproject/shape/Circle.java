package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Ellipse {
    protected int radius;

    public Circle(int xinitial , int yinitial , int xFinal, int yFinal , Color strokeColor , Color fillColor) {
        super(xinitial , yinitial , xFinal , yFinal , strokeColor , fillColor);       
        this.shapeName= "Circle";
        this.radius = (Math.abs(xFinal - xinitial))/2;       
    }

    @Override
    public void draw(Graphics2D g) {
        
        this.radius = (Math.abs(xFinal - xinitial))/2;
        this. width = (Math.abs(xFinal - xinitial));
        
        
        Ellipse2D temp;
        
        
       if(yFinal < yinitial && xFinal < xinitial)
        {
             temp = new Ellipse2D.Float(getxFinal(), getYinitial() - width , width, width);
             
             this.xFinal =  this.xinitial - width;
             this.yFinal =  this.yinitial - width;
      
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          temp = new Ellipse2D.Float(getxFinal(), getYinitial() , width, width);
          
          this.xFinal =  this.xinitial - width;
          this.yFinal =  this.yinitial + width;
          
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
          temp = new Ellipse2D.Float(getXinitial(), getYinitial() - width , width, width);
          
          this.xFinal =  this.xinitial + width;
          this.yFinal =  this.yinitial - width;
          
        }
        
        
        else
        {
            temp = new Ellipse2D.Float(getXinitial(), getYinitial(), width, width);
            
            this.xFinal =  this.xinitial + width;
            this.yFinal =  this.yinitial + width;
    
        }
        
        
        
        
        //Ellipse2D temp = new Ellipse2D.Float(getXinitial(), getYinitial(), 2*radius, 2*radius);
        
        
        if(!fillColor.equals(Color.WHITE))
        {
            g.setColor(getFillColor());
            g.fill(temp);
        }
        
        g.setColor(getStrokeColor());
        g.draw(temp);
       
    }

    public int getRadius() {
        return radius;
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
