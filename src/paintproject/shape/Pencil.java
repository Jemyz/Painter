package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;


public class Pencil extends Shape{
    
    ArrayList<Integer> xpoints = new ArrayList<>();
    ArrayList<Integer> ypoints = new ArrayList<>();
    public Pencil(int xinitial , int yinitial , Color strokeColor ) {
        super(xinitial , yinitial , 0 , 0 , strokeColor , Color.BLACK);       
        this.shapeName= "Pencil";
        
        xFinal = xinitial;
        yFinal = yinitial;
        
        

    }

    public void addpoint(int xinitial , int yinitial){ 
        xpoints.add(xinitial);
        ypoints.add(yinitial);
    }
    
    
    
    
     public void draw(Graphics2D g) {

      
        Line2D temp ;
        int maxX=0,maxY=0,smallX=10000,smallY=10000;
        if(xpoints.size() > 2){
        for(int i = 0 ; i < xpoints.size()-1 ; i++)
        {
            
            if(maxX < xpoints.get(i))maxX= xpoints.get(i);
            if(maxY < ypoints.get(i))maxY = ypoints.get(i);
            
            if(smallX >  xpoints.get(i)) smallX =  xpoints.get(i);
            if(smallY > ypoints.get(i))smallY = ypoints.get(i);
            
            
             temp = new Line2D.Float(xpoints.get(i), ypoints.get(i), xpoints.get(i+1), ypoints.get(i+1));
              
         
        
             g.setColor(getStrokeColor());
             g.draw(temp);
        
        }
        

     }
        this.xFinal = maxX;
        this.yFinal = maxY;
        this.xinitial = smallX;
        this.yinitial = smallY;
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

    public void change (int xdelta , int ydelta)
    {
         for(int i = 0 ; i < xpoints.size()-1 ; i++)
        {
            
            xpoints.add(i, xpoints.get(i)+xdelta);
            ypoints.add(i, ypoints.get(i)+ydelta);
            
        }
        

     
    }
}
