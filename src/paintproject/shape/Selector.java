package paintproject.shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Selector extends Rectangle{

    
    final static float [] dash1 = { 10.0f };
    final static BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT , BasicStroke.JOIN_MITER , 10.0f , dash1 , 0.0f);
    
    public Selector(int xinitial, int yinitial, int xFinal, int yFinal) {
        super(xinitial, yinitial, xFinal, yFinal, Color.blue ,Color.white);
    }
    
    @Override
    public void draw(Graphics2D g) {
        
        
        
        this.width = Math.abs(xFinal - xinitial);
        this.height = Math.abs(yFinal - yinitial);
        
        
        Rectangle2D temp;
        Rectangle2D resize1;
        Rectangle2D resize2;
        Rectangle2D resize3;
        Rectangle2D resize4;
        Rectangle2D resize5;
        Rectangle2D resize6;
        Rectangle2D resize7;
        Rectangle2D resize8;
        
      
        
        
        
        
        if(yFinal < yinitial && xFinal < xinitial)
        {
             temp = new Rectangle2D.Float(getxFinal()-5, getyFinal()-5, getWidth()+10, getHeight()+10);
             
            resize1 = new Rectangle2D.Float(getxFinal()-15, getyFinal()-15, 10, 10);
            resize2 = new Rectangle2D.Float(getxFinal()+getWidth()/2-5, getyFinal()-15, 10, 10);
            resize3 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getyFinal()-15, 10, 10);
            resize4 = new Rectangle2D.Float(getxFinal()-15, getyFinal()+getHeight()/2-5, 10, 10);
            resize5 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getyFinal()+getHeight()/2-5, 10, 10);
            resize6 = new Rectangle2D.Float(getxFinal()-15, getyFinal()+getHeight()+5, 10, 10);
            resize7 = new Rectangle2D.Float(getxFinal()+getWidth()/2-5, getyFinal()+getHeight()+5, 10, 10);
            resize8 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getyFinal()+getHeight()+5, 10, 10);
      
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          temp = new Rectangle2D.Float(getxFinal()-5, getYinitial()-5, getWidth()+10, getHeight()+10);
          
            resize1 = new Rectangle2D.Float(getxFinal()-15, getYinitial()-15, 10, 10);
            resize2 = new Rectangle2D.Float(getxFinal()+getWidth()/2-5, getYinitial()-15, 10, 10);
            resize3 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getYinitial()-15, 10, 10);
            resize4 = new Rectangle2D.Float(getxFinal()-15, getYinitial()+getHeight()/2-5, 10, 10);
            resize5 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getYinitial()+getHeight()/2-5, 10, 10);
            resize6 = new Rectangle2D.Float(getxFinal()-15, getYinitial()+getHeight()+5, 10, 10);
            resize7 = new Rectangle2D.Float(getxFinal()+getWidth()/2-5, getYinitial()+getHeight()+5, 10, 10);
            resize8 = new Rectangle2D.Float(getxFinal()+getWidth()+5, getYinitial()+getHeight()+5, 10, 10);
          
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
          temp = new Rectangle2D.Float(getXinitial()-5, getyFinal()-5, getWidth()+10, getHeight()+10);
          
            resize1 = new Rectangle2D.Float(getXinitial()-15, getyFinal()-15, 10, 10);
            resize2 = new Rectangle2D.Float(getXinitial()+getWidth()/2-5, getyFinal()-15, 10, 10);
            resize3 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getyFinal()-15, 10, 10);
            resize4 = new Rectangle2D.Float(getXinitial()-15, getyFinal()+getHeight()/2-5, 10, 10);
            resize5 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getyFinal()+getHeight()/2-5, 10, 10);
            resize6 = new Rectangle2D.Float(getXinitial()-15, getyFinal()+getHeight()+5, 10, 10);
            resize7 = new Rectangle2D.Float(getXinitial()+getWidth()/2-5, getyFinal()+getHeight()+5, 10, 10);
            resize8 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getyFinal()+getHeight()+5, 10, 10);
          
          
        }
        
        
        else
        {
            temp = new Rectangle2D.Float(getXinitial()-5, getYinitial()-5, getWidth()+10, getHeight()+10);
            
    
            resize1 = new Rectangle2D.Float(getXinitial()-15, getYinitial()-15, 10, 10);
            resize2 = new Rectangle2D.Float(getXinitial()+getWidth()/2-5, getYinitial()-15, 10, 10);
            resize3 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getYinitial()-15, 10, 10);
            resize4 = new Rectangle2D.Float(getXinitial()-15, getYinitial()+getHeight()/2-5, 10, 10);
            resize5 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getYinitial()+getHeight()/2-5, 10, 10);
            resize6 = new Rectangle2D.Float(getXinitial()-15, getYinitial()+getHeight()+5, 10, 10);
            resize7 = new Rectangle2D.Float(getXinitial()+getWidth()/2-5, getYinitial()+getHeight()+5, 10, 10);
            resize8 = new Rectangle2D.Float(getXinitial()+getWidth()+5, getYinitial()+getHeight()+5, 10, 10);
        }
           
        
        
   
        
        
        g.setColor(getStrokeColor());
        g.draw(resize1);
        g.draw(resize2);
        g.draw(resize3);
        g.draw(resize4);
        g.draw(resize5);
        g.draw(resize6);
        g.draw(resize7);
        g.draw(resize8);
        
        g.setStroke(dashed);
        g.draw(temp);
        
       
         
        
 
        
    }
    
    public int resizeselected (int x , int y)
    {
        if(yFinal < yinitial && xFinal < xinitial)
        {
          
            if( x > getxFinal()-15 && y > getyFinal()-15 && x < getxFinal()-5 && y < getyFinal()-5) return 1;
            else if( x > getxFinal()+getWidth()/2-5 && y > getyFinal()-15 && x < getxFinal()+getWidth()/2+5 && y < getyFinal()-5) return 2;
            else if( x > getxFinal()+getWidth()+5 && y > getyFinal()-15 && x < getxFinal()+getWidth()+15 && y < getyFinal()-5) return 3;
            else if( x > getxFinal()-15 && y > getyFinal()+getHeight()/2-5 && x < getxFinal()-5 && y < getyFinal()+getHeight()/2+5) return 4;
            else if( x > getxFinal()+getWidth()+5&& y > getyFinal()+getHeight()/2-5 && x < getxFinal()+getWidth()+15&& y < getyFinal()+getHeight()/2+5) return 5;
            else if( x > getxFinal()-15 && y > getyFinal()+getHeight()+5 && x < getxFinal()-5&& y < getyFinal()+getHeight()+15) return 6;
            else if( x > getxFinal()+getWidth()/2-5 && y > getyFinal()+getHeight()+5 && x < getxFinal()+getWidth()/2+5&& y < getyFinal()+getHeight()+15) return 7;
            else if( x > getxFinal()+getWidth()+5 && y > getyFinal()+getHeight()+5 && x < getxFinal()+getWidth()+15&& y < getyFinal()+getHeight()+15) return 8;




                
            
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          if( x > getxFinal()-15 && y > getYinitial()-15 && x < getxFinal()-5 && y < getYinitial()-5) return 1;
            else if( x > getxFinal()+getWidth()/2-5 && y > getYinitial()-15 && x < getxFinal()+getWidth()/2+5 && y < getYinitial()-5) return 2;
            else if( x > getxFinal()+getWidth()+5 && y > getYinitial()-15 && x < getxFinal()+getWidth()+15 && y < getYinitial()-5) return 3;
            else if( x > getxFinal()-15 && y > getYinitial()+getHeight()/2-5 && x < getxFinal()-5 && y < getYinitial()+getHeight()/2+5) return 4;
            else if( x > getxFinal()+getWidth()+5&& y > getYinitial()+getHeight()/2-5 && x < getxFinal()+getWidth()+15&& y < getYinitial()+getHeight()/2+5) return 5;
            else if( x > getxFinal()-15 && y > getYinitial()+getHeight()+5 && x < getxFinal()-5&& y < getYinitial()+getHeight()+15) return 6;
            else if( x > getxFinal()+getWidth()/2-5 && y > getYinitial()+getHeight()+5 && x < getxFinal()+getWidth()/2+5&& y < getYinitial()+getHeight()+15) return 7;
            else if( x > getxFinal()+getWidth()+5 && y > getYinitial()+getHeight()+5 && x < getxFinal()+getWidth()+15&& y < getYinitial()+getHeight()+15) return 8;
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
            if( x > getXinitial()-15 && y > getyFinal()-15 &&  x <  getXinitial()-5 && y < getyFinal()-5) return 1;
            else if( x > getXinitial()+getWidth()/2-5 && y > getyFinal()-15 && x < getXinitial()+getWidth()/2+5 && y < getyFinal()-5) return 2;
            else if( x > getXinitial()+getWidth()+5 && y > getyFinal()-15 && x < getXinitial()+getWidth()+15 && y < getyFinal()-5) return 3;
            else if( x > getXinitial()-15 && y > getyFinal()+getHeight()/2-5 && x < getXinitial()-5 && y < getyFinal()+getHeight()/2+5) return 4;
            else if( x > getXinitial()+getWidth()+5&& y > getyFinal()+getHeight()/2-5 && x < getXinitial()+getWidth()+15&& y < getyFinal()+getHeight()/2+5) return 5;
            else if( x > getXinitial()-15 && y > getyFinal()+getHeight()+5 && x < getXinitial()-5&& y < getyFinal()+getHeight()+15) return 6;
            else if( x > getXinitial()+getWidth()/2-5 && y > getyFinal()+getHeight()+5 && x < getXinitial()+getWidth()/2+5&& y < getyFinal()+getHeight()+15) return 7;
            else if( x > getXinitial()+getWidth()+5 && y > getyFinal()+getHeight()+5 && x < getXinitial()+getWidth()+15&& y < getyFinal()+getHeight()+15) return 8;
          
        }
        
        
        else
        {

            
             if( x > getXinitial()-15 && y > getYinitial()-15 && x < getXinitial()-5 && y < getYinitial()-5) return 1;
            else if( x > getXinitial()+getWidth()/2-5 && y > getYinitial()-15 && x < getXinitial()+getWidth()/2+5 && y < getYinitial()-5) return 2;
            else if( x > getXinitial()+getWidth()+5 && y > getYinitial()-15 && x < getXinitial()+getWidth()+15 && y < getYinitial()-5) return 3;
            else if( x > getXinitial()-15 && y > getYinitial()+getHeight()/2-5 && x < getXinitial()-5 && y < getYinitial()+getHeight()/2+5) return 4;
            else if( x > getXinitial()+getWidth()+5&& y > getYinitial()+getHeight()/2-5 && x < getXinitial()+getWidth()+15&& y < getYinitial()+getHeight()/2+5) return 5;
            else if( x > getXinitial()-15 && y > getYinitial()+getHeight()+5 && x < getXinitial()-5&& y < getYinitial()+getHeight()+15) return 6;
            else if( x > getXinitial()+getWidth()/2-5 && y > getYinitial()+getHeight()+5 && x < getXinitial()+getWidth()/2+5&& y < getYinitial()+getHeight()+15) return 7;
            else if( x > getXinitial()+getWidth()+5 && y > getYinitial()+getHeight()+5 && x < getXinitial()+getWidth()+15&& y < getYinitial()+getHeight()+15) return 8;
             
        }
        return 0;
    }
    
    
}
