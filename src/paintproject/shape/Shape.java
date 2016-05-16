/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintproject.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Shape {

    protected int xinitial;
    protected int yinitial;
    protected int xFinal;
    protected int yFinal;

    protected String shapeName;
    protected Color strokeColor;
    protected Color fillColor;

    public Shape(int xinitial, int yinitial, int xFinal, int yFinal, Color strokeColor, Color fillColor) {

        this.xinitial = Math.min(xinitial, xFinal);
        this.yinitial = Math.min(yinitial, yFinal);

        this.xFinal = Math.max(xinitial, xFinal);
        this.yFinal = Math.max(yinitial, yFinal);

        this.strokeColor = strokeColor;
        this.fillColor = fillColor;

    }

    public void setStartPoint(int xinitial, int yinitial) {
        this.xinitial = xinitial;
        this.yinitial = yinitial;
        //correct();
    }

    public void setEndPoint(int xFinal, int yFinal) {
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        //correct(this.xinitial,this.yinitial,this.xFinal,this.yFinal);
    }
    
    private void correct (int xinitial, int yinitial, int xFinal, int yFinal){
        
       
        
        this.xinitial = Math.min(xinitial, xFinal);
        this.yinitial = Math.min(yinitial, yFinal);

        this.xFinal = Math.max(xinitial, xFinal);
        this.yFinal = Math.max(yinitial, yFinal);
        
    
    }

    public abstract void draw(Graphics2D g);
    public abstract boolean selected ( int x , int y);

    public int getXinitial() {
        return xinitial;
    }

    public int getYinitial() {
        return yinitial;
    }

    public int getxFinal() {
        return xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public String getShapeName() {
        return shapeName;
    }

}
