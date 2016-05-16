package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class Square extends Rectangle {
    protected int sideLength;

    public Square(int xinitial , int yinitial , int xFinal , int yFinal , Color strokeColor , Color fillColor) {
        super(xinitial , yinitial , xFinal , yFinal , strokeColor , fillColor);       
        this.shapeName= "Square";
        this.sideLength = Math.abs(xFinal - xinitial);;
    }

     public void draw(Graphics2D g) {
       
         this.sideLength = Math.abs(xFinal - xinitial);
         
         
          Rectangle2D temp;
        
        
        if(yFinal < yinitial && xFinal < xinitial)
        {
             temp = new Rectangle2D.Float(getxFinal(), getYinitial() - getSideLength() , getSideLength(), getSideLength());
             
             this.xFinal =  this.xinitial - getSideLength();
             this.yFinal =  this.yinitial - getSideLength();
             
      
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          temp = new Rectangle2D.Float(getxFinal(), getYinitial() , getSideLength(), getSideLength());
          
          this.xFinal =  this.xinitial - getSideLength();
          this.yFinal =  this.yinitial + getSideLength();
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
          temp = new Rectangle2D.Float(getXinitial(), getYinitial() - getSideLength(), getSideLength(), getSideLength());
          
          this.xFinal =  this.xinitial + getSideLength();
          this.yFinal =  this.yinitial - getSideLength();
        }
        
        
        else
        {
            temp = new Rectangle2D.Float(getXinitial(), getYinitial(), getSideLength(), getSideLength());
            
            this.xFinal =  this.xinitial + getSideLength();
            this.yFinal =  this.yinitial + getSideLength();
    
        }
        
         
         
       
         
         
        // Rectangle2D temp = new Rectangle2D.Float(getXinitial(), getYinitial(), sideLength, sideLength);
        
        if(!fillColor.equals(Color.WHITE))
        {
            g.setColor(getFillColor());
            g.fill(temp);
        }
        
        g.setColor(getStrokeColor());
        g.draw(temp);

        
    }

    public int getSideLength() {
        return sideLength;
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
