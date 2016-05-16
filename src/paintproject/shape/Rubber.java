package paintproject.shape;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;


public class Rubber extends Shape{
    
    ArrayList<Integer> xpoints = new ArrayList<>();
    ArrayList<Integer> ypoints = new ArrayList<>();
    public Rubber(int xinitial , int yinitial ) {
        super(xinitial , yinitial , 0 , 0 , Color.WHITE , Color.WHITE);       
        this.shapeName= "Pencil";
        xFinal = xinitial;
        yFinal = yinitial;
        
        

    }

    public void addpoint(int xinitial , int yinitial){ 
        xpoints.add(xinitial);
        ypoints.add(yinitial);
        
   
        
        
        
    }
    
     public void draw(Graphics2D g) {

         
         Line2D temp;
        if(xpoints.size() > 2){
        for(int i = 0 ; i < xpoints.size()-1 ; i++)
        {
            
             temp = new Line2D.Float(xpoints.get(i), ypoints.get(i), xpoints.get(i+1), ypoints.get(i+1));
              
         
        
             g.setColor(getStrokeColor());
             g.draw(temp);
        
        }

        
    }
     }

    @Override
    public boolean selected(int x, int y) {
        return false;
    }
}
