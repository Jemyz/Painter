package paintproject.shape;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape{
    
    protected int width;
    protected int height; 
    
 public Ellipse(int xinitial , int yinitial , int xFinal, int yFinal , Color strokeColor , Color fillColor) {
        super(xinitial , yinitial , xFinal , yFinal , strokeColor , fillColor);       
        this.shapeName= "Ellipse";
        this.width = Math.abs(xFinal - xinitial);
        this.height = Math.abs(yFinal - yinitial);
    }

    @Override
    public void draw(Graphics2D g) {
        
        this.width = Math.abs(xFinal - xinitial);
        this.height = Math.abs(yFinal - yinitial);
        
        
         Ellipse2D temp;
        
        
        if(yFinal < yinitial && xFinal < xinitial)
        {
             temp = new Ellipse2D.Float(getxFinal(), getyFinal(), width, height);
      
        }
        
        else if(yFinal > yinitial && xFinal < xinitial)
        {
            
          temp = new Ellipse2D.Float(getxFinal(), getYinitial(), width, height);
          
          
        }
        
        else if(yFinal < yinitial && xFinal > xinitial)
        {
            
          temp = new Ellipse2D.Float(getXinitial(), getyFinal(), width, height);
          
          
        }
        
        
        else
        {
            temp = new Ellipse2D.Float(getXinitial(), getYinitial(), width, height);
    
        }
        
        
        //Ellipse2D temp = new Ellipse2D.Float(getXinitial(), getYinitial(), width, height);
       
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
