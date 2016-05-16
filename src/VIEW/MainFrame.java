package VIEW;

import com.sun.xml.internal.stream.buffer.XMLStreamBuffer;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import paintproject.shape.*;

public class MainFrame extends javax.swing.JFrame {

    Color strokeColor = Color.BLACK, fillColor = Color.WHITE;

    public MainFrame() {
        
        Toolkit tk =Toolkit.getDefaultToolkit();
		
		Dimension dim =tk.getScreenSize();
		
		int xpos  = (dim.width/4); 
		int ypos  = (dim.height/4) ;
		
		this.setLocation(xpos, ypos);
        initComponents();
        Line.setSelected(true);
        KeyTypedEvent();
        

    }

    @Override
    public void add(Component cmpnt, Object o) {
        super.add(cmpnt, o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component add(Component cmpnt) {
        return super.add(cmpnt); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    
    public  void KeyTypedEvent()
    {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
       
    
        
    }   
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        ControlPanel = new javax.swing.JPanel();
        Line = new javax.swing.JButton();
        Redo = new javax.swing.JButton();
        Undo = new javax.swing.JButton();
        FillButton = new javax.swing.JButton();
        StrokeColor = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        LoadBuuton = new javax.swing.JButton();
        Pencil = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        Rectangle = new javax.swing.JButton();
        Circle = new javax.swing.JButton();
        Triangle = new javax.swing.JButton();
        Rubber = new javax.swing.JButton();
        Ellipse = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        Fill = new javax.swing.JButton();
        DrawingCanvas = new VIEW.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Save = new javax.swing.JMenu();
        JSON = new javax.swing.JMenu();
        XML = new javax.swing.JMenu();
        LOAD = new javax.swing.JMenu();
        Edit = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Line.setText("Line");
        Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineActionPerformed(evt);
            }
        });

        Redo.setText("Redo");
        Redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });

        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });

        FillButton.setText("Fill Color");
        FillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillButtonActionPerformed(evt);
            }
        });

        StrokeColor.setText("StrokeColor");
        StrokeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrokeColorActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        LoadBuuton.setText("Load");
        LoadBuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBuutonActionPerformed(evt);
            }
        });

        Pencil.setText("Pencil");
        Pencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PencilActionPerformed(evt);
            }
        });

        Square.setText("Square");
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });

        Rectangle.setText("Rectangle");
        Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleActionPerformed(evt);
            }
        });

        Circle.setText("Circle");
        Circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleActionPerformed(evt);
            }
        });

        Triangle.setText("Triangle");
        Triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleActionPerformed(evt);
            }
        });

        Rubber.setText("Rubber");
        Rubber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubberActionPerformed(evt);
            }
        });

        Ellipse.setText("Ellipse");
        Ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllipseActionPerformed(evt);
            }
        });

        Select.setText("Select");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        Fill.setText("Fill");
        Fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Pencil, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Rubber, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoadBuuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FillButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StrokeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(Redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Line, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pencil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Square, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rubber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillButton)
                    .addComponent(StrokeColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Redo)
                    .addComponent(Undo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Select, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Fill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(SaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadBuuton)
                .addGap(21, 21, 21))
        );

        getContentPane().add(ControlPanel, java.awt.BorderLayout.LINE_END);

        DrawingCanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DrawingCanvas.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                DrawingCanvasMouseWheelMoved(evt);
            }
        });
        DrawingCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DrawingCanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DrawingCanvasMouseReleased(evt);
            }
        });
        DrawingCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DrawingCanvasMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout DrawingCanvasLayout = new javax.swing.GroupLayout(DrawingCanvas);
        DrawingCanvas.setLayout(DrawingCanvasLayout);
        DrawingCanvasLayout.setHorizontalGroup(
            DrawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        DrawingCanvasLayout.setVerticalGroup(
            DrawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        getContentPane().add(DrawingCanvas, java.awt.BorderLayout.CENTER);

        File.setText("File");

        Save.setText("Save");

        JSON.setText("JSON");
        JSON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Save.add(JSON);

        XML.setText("XML");
        Save.add(XML);

        File.add(Save);

        LOAD.setText("Load");
        File.add(LOAD);

        jMenuBar1.add(File);

        Edit.setText("Edit");
        jMenuBar1.add(Edit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillButtonActionPerformed
        fillColor = JColorChooser.showDialog(null, "Pick a Stroke", Color.BLACK);

    }//GEN-LAST:event_FillButtonActionPerformed

    private void StrokeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrokeColorActionPerformed
        strokeColor = JColorChooser.showDialog(null, "Pick a Stroke", Color.BLACK);
    }//GEN-LAST:event_StrokeColorActionPerformed

    private void DrawingCanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingCanvasMouseReleased

        xf = evt.getX();
        yf = evt.getY();
        
        flag = 0;
        if(Select.isSelected())
        {
            if(remove != null && ((Selector)selector).resizeselected(xi, yi) == 0)
            {
            /*temp.setStartPoint(xf + deltaxintial , yf + deltayintial);
            temp.setEndPoint(xf + deltaxfinal, yf + deltayfinal);
            
            selector.setStartPoint(xf + deltaxintial , yf + deltayintial);
            selector.setEndPoint(xf + deltaxfinal, yf + deltayfinal);*/
            temp.setFillColor(tempColor);
       
            repaint();
            }
            
        }
            
            
        
        else
        {
        if (Pencil.isSelected()) {
            ((Pencil) temp).addpoint(xf, yf);
        } else if (Rubber.isSelected()) {
            ((Rubber) temp).addpoint(xf, yf);
        } else {
            temp.setEndPoint(xf, yf);
        }
       

        //DrawingCanvas.shapes.remove(trace);
        repaint();
        }
        //System.out.println("xf" + xf + "\nyf" + yf);
        


    }//GEN-LAST:event_DrawingCanvasMouseReleased
    
    private void DrawingCanvasMouseDragged(java.awt.event.MouseEvent evt) {
        
        
        
        
        xf = evt.getX();
        yf = evt.getY();
        
       
        
        if(selector!= null && flag != 0)
        {
            
            
            
            if(flag == 1)
            {
               selector.setStartPoint(xf, yf);
               temp.setStartPoint(xf+5,yf+5);
               repaint();
            }
            else if (flag == 2)
            {
               selector.setStartPoint(xf-((Selector)selector).getWidth()/2, yf);
               temp.setStartPoint(xf+5-((Selector)selector).getWidth()/2-5,yf+5);
               repaint();
            }
            
            else if (flag == 3)
            {
                /*System.out.println(","+selector.getYinitial());
                System.out.println(selector.getxFinal());
                System.out.println(xf+","+yf);*/

                
               selector.setStartPoint(xf ,selector.getYinitial());
               selector.setEndPoint(selector.getxFinal(), yf );
               
               temp.setStartPoint(xf+5 ,temp.getYinitial());
               temp.setEndPoint(temp.getxFinal(), yf-5 );

               repaint();
            }
            
            else if (flag == 4)
            {
               selector.setStartPoint(xf , yf-((Selector)selector).getHeight()/2);
               
               temp.setStartPoint(xf+5 ,yf-((Selector)selector).getHeight()/2);
               
               repaint();
            }
            
            else if (flag == 5)
            {
                selector.setEndPoint(xf , yf+((Selector)selector).getHeight()/2);
               
               temp.setEndPoint(xf-5 ,yf+((Selector)selector).getHeight()/2);
               
               repaint();
            }
            
            
            else if (flag == 6)
            {
               selector.setStartPoint( selector.getXinitial(),yf);
               selector.setEndPoint(xf, selector.getyFinal());
               
               temp.setStartPoint( temp.getXinitial(),  yf-5 );
               temp.setEndPoint(xf+5 , temp.getyFinal());

               repaint();
            }
            
            else if (flag == 7)
            {
               selector.setEndPoint(xf+((Selector)selector).getWidth() / 2, yf );
               temp.setEndPoint(xf + ((Selector)selector).getWidth()/2-5 - 5, yf-5);
               repaint();
            }
            
            else if (flag == 8)
            {
               selector.setEndPoint(xf, yf);
               temp.setEndPoint(xf-5,yf-5);
               repaint();
            }
            
        }
                
        else
        {
        
        if(Select.isSelected())
        {

            
            if(remove != null && ((Selector)selector).resizeselected(xi, yi) == 0)
            {
            
              
            temp.setStartPoint(xf + deltaxintial , yf + deltayintial);
            temp.setEndPoint(xf + deltaxfinal, yf + deltayfinal);
                
            selector.setStartPoint(xf + deltaxintial , yf + deltayintial);
            selector.setEndPoint(xf + deltaxfinal, yf + deltayfinal);
           
            
            repaint();
            }

        }
            
            
        
        else
        {

        if (Pencil.isSelected()) {
            ((Pencil) temp).addpoint(xf, yf);
        } else if (Rubber.isSelected()) {
            ((Rubber) temp).addpoint(xf, yf);
        } else {
            temp.setEndPoint(xf, yf);
        }
        repaint();
        }
                }

    }
    int deltaxintial , deltayintial , deltaxfinal , deltayfinal;
    Color tempColor; 
    Shape selector;
    Shape remove ;
    int flag=0;
    
    private void DrawingCanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingCanvasMousePressed

        
        xi = evt.getX();
        yi = evt.getY();
        
        if(selector !=  null && ((Selector)selector).resizeselected(xi, yi) != 0) //selector !=  null && ((Selector)selector).resizeselected(xi, yi) != 0) 
        {
            
            if (((Selector)selector).resizeselected(xi, yi) == 1)flag = 1;
            else if (((Selector)selector).resizeselected(xi, yi) == 2)flag = 2;
            else if (((Selector)selector).resizeselected(xi, yi) == 3)flag = 3;
            else if (((Selector)selector).resizeselected(xi, yi) == 4)flag = 4;
            else if (((Selector)selector).resizeselected(xi, yi) == 5)flag = 5;
            else if (((Selector)selector).resizeselected(xi, yi) == 6)flag = 6;
            else if (((Selector)selector).resizeselected(xi, yi) == 7)flag = 7;
            else if (((Selector)selector).resizeselected(xi, yi) == 8)flag = 8;
            
            
           
        }
        else

        {
            if (selector != null)
         DrawingCanvas.deleteShape(selector);
         selector = null;
         repaint();


         
        if(Select.isSelected())
        {
            remove = DrawingCanvas.select(xi, yi);
           
                        
            if(remove != null)
            {
            //DrawingCanvas.UndoRedoTemp.add(remove);
            temp = remove;
            selector = new Selector(0, 0, 0, 0);
            
            
            DrawingCanvas.deleteShape(remove);
            tempColor = temp.getFillColor();
            temp.setFillColor(Color.yellow);
            
            DrawingCanvas.addShape(temp);
            DrawingCanvas.addShape(selector);
            
            
            deltaxintial = temp.getXinitial() - xi;
            deltayintial = temp.getYinitial() - yi;
            
            deltaxfinal = temp.getxFinal() - xi;
            deltayfinal = temp.getyFinal() - yi;
            
            temp.setStartPoint(xi + deltaxintial , yi + deltayintial);
            temp.setEndPoint(xi + deltaxfinal, yi + deltayfinal);
            
            selector.setStartPoint(xi + deltaxintial , yi + deltayintial);
            selector.setEndPoint(xi + deltaxfinal, yi + deltayfinal);

            repaint();
            }
            //else JOptionPane.showMessageDialog(null, "Select Something First :D");

        }
            
            
        
        else
        {
        
        if (Line.isSelected()) {
            temp = new Line(0, 0, 0, 0, strokeColor);
        } else if (Rectangle.isSelected()) {
            temp = new Rectangle(0, 0, 0, 0, strokeColor, fillColor);
        } else if (Square.isSelected()) {
            temp = new Square(0, 0, 0, 0, strokeColor, fillColor);
        } else if (Ellipse.isSelected()) {
            temp = new Ellipse(0, 0, 0, 0, strokeColor, fillColor);
        } else if (Circle.isSelected()) {
            temp = new Circle(0, 0, 0, 0, strokeColor, fillColor);
        } else if (Triangle.isSelected()) {
            temp = new Triangle(0, 0, 0, 0, strokeColor, fillColor);
        } else if (Pencil.isSelected()) {
            temp = new Pencil(0, 0, strokeColor);
        } else if (Rubber.isSelected()) {
            temp = new Rubber(0, 0);
        }

        
        
        
        temp.setStartPoint(xi, yi);
        temp.setEndPoint(xi, yi);
        DrawingCanvas.shapes.add(temp);
        repaint();
        
         }
        }
    }//GEN-LAST:event_DrawingCanvasMousePressed

    private void LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineActionPerformed

        Line.setSelected(true);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);

    }//GEN-LAST:event_LineActionPerformed

    private void RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(true);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);

    }//GEN-LAST:event_RectangleActionPerformed

    private void EllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllipseActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(true);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);

    }//GEN-LAST:event_EllipseActionPerformed

    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(true);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);

    }//GEN-LAST:event_TriangleActionPerformed

    private void RubberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubberActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(true);
        Select.setSelected(false);
        
    }//GEN-LAST:event_RubberActionPerformed

    private void CircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(true);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);


    }//GEN-LAST:event_CircleActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(true);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(false);
        Rubber.setSelected(false);
        Select.setSelected(false);


    }//GEN-LAST:event_SquareActionPerformed

    private void PencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PencilActionPerformed

        Line.setSelected(false);
        Rectangle.setSelected(false);
        Square.setSelected(false);
        Ellipse.setSelected(false);
        Circle.setSelected(false);
        Triangle.setSelected(false);
        Pencil.setSelected(true);
        Rubber.setSelected(false);
        Select.setSelected(false);

    }//GEN-LAST:event_PencilActionPerformed
    /**/
    
    
    
    
    
    
    
    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        
        if (!DrawingCanvas.shapes.isEmpty()) {

            DrawingCanvas.UndoRedoTemp.add(DrawingCanvas.shapes.get(DrawingCanvas.shapes.size() - 1));
            DrawingCanvas.shapes.remove(DrawingCanvas.shapes.size() - 1);
            
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "DRAW Something To UNDO it :P");
        }
        
        

        repaint();
    }//GEN-LAST:event_UndoActionPerformed

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoActionPerformed
        
        
        if(!DrawingCanvas.UndoRedoTemp.isEmpty())
        {
         DrawingCanvas.shapes.add(DrawingCanvas.UndoRedoTemp.get(DrawingCanvas.UndoRedoTemp.size() - 1));
         DrawingCanvas.UndoRedoTemp.remove(DrawingCanvas.UndoRedoTemp.size() - 1);
        }
        else{
         JOptionPane.showMessageDialog(null, "UNDO Something To REDO it :P");

        }
      
        repaint();
        
    }//GEN-LAST:event_RedoActionPerformed
/*
    private void DrawingCanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingCanvasMouseDragged
       xf = evt.getX();
        yf = evt.getY();

        if (Pencil.isSelected()) {
            ((Pencil) temp).addpoint(xf, yf);
        } else if (Rubber.isSelected()) {
            ((Rubber) temp).addpoint(xf, yf);
        } else {
            temp.setEndPoint(xf, yf);
        }
        repaint();
    }//GEN-LAST:event_DrawingCanvasMouseDragged
*/
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        
        Select.setSelected(true);
    }//GEN-LAST:event_SelectActionPerformed

    private void DrawingCanvasMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_DrawingCanvasMouseWheelMoved
        
        
        if(Select.isSelected() && selector != null)
        {
            temp.setEndPoint(temp.getxFinal()+5*evt.getWheelRotation(), temp.getyFinal()+5*evt.getWheelRotation());
            selector.setEndPoint(selector.getxFinal()+5*evt.getWheelRotation(), selector.getyFinal()+5*evt.getWheelRotation());
            
        }
        
        repaint();
        
                
    }//GEN-LAST:event_DrawingCanvasMouseWheelMoved

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        
          JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(SaveButton) == JFileChooser.APPROVE_OPTION) {
            XStream xstream = new XStream(new StaxDriver());
            String xml = xstream.toXML(DrawingCanvas.shapes);
            try {
                PrintWriter printWriter = new PrintWriter(fileChooser.getSelectedFile());
                printWriter.append(xml);
                printWriter.close();
            } catch (FileNotFoundException ex) {
            
                
            }
        }
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBuutonActionPerformed
       
        JFileChooser fileLoader = new JFileChooser();
        if (fileLoader.showOpenDialog(LoadBuuton) == JFileChooser.APPROVE_OPTION) {
            XStream xstream = new XStream(new StaxDriver());
            ArrayList<Shape> shape = new ArrayList<>();
            shape = (ArrayList<Shape>) (xstream.fromXML(fileLoader.getSelectedFile()));
            for (int i = 0; i < shape.size(); i++) {
                DrawingCanvas.shapes.add(shape.get(i));
                repaint();
            }
        }
        
    }//GEN-LAST:event_LoadBuutonActionPerformed

    private void FillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillActionPerformed
       
        if(Select.isSelected()&& temp != null)
        {
            /*DrawingCanvas.shapes.get(DrawingCanvas.shapes.size()-2)*/temp.setFillColor(fillColor);
            repaint();
        }
    }//GEN-LAST:event_FillActionPerformed


    
    
    
    
    
    
    
    
    private class MyDispatcher implements KeyEventDispatcher {
       
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_TYPED) {
           
                if(e.getKeyChar() == 'd' && Select.isSelected())
                {
                    DrawingCanvas.UndoRedoTemp.add(temp);
                    DrawingCanvas.deleteShape(temp);
                    DrawingCanvas.deleteShape(selector);
                    repaint();
                }
               
            }
         
            return false;
        }

        
        
    }

    
    
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    

    /*public class paint extends JPanel{

     public  paint(float xg , float yg)
     {
     // Class used to define the shapes to be drawn
     Graphics g = DrawingPanel.getGraphics();
     Graphics2D graphSettings = (Graphics2D)g;

     // Antialiasing cleans up the jagged lines and defines rendering rules
     Rectangle2D.Float x = new Rectangle2D.Float(xg, yg, 100 , 50);         
     graphSettings.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
     RenderingHints.VALUE_ANTIALIAS_ON);
                        
     graphSettings.setColor(fillColor);
     graphSettings.fill(x);
                        
     graphSettings.setColor(strokeColor);
     //graphSettings.drawRect((int)xg, (int)yg, 100 , 50);
     graphSettings.draw(x);
                        

    
     }
     }
    
     */
    int xi, xf, yi, yf;
    Shape temp;
    Shape trace;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Circle;
    private javax.swing.JPanel ControlPanel;
    private VIEW.Canvas DrawingCanvas;
    private javax.swing.JMenu Edit;
    private javax.swing.JButton Ellipse;
    private javax.swing.JMenu File;
    private javax.swing.JButton Fill;
    private javax.swing.JButton FillButton;
    private javax.swing.JMenu JSON;
    private javax.swing.JMenu LOAD;
    private javax.swing.JButton Line;
    private javax.swing.JButton LoadBuuton;
    private javax.swing.JButton Pencil;
    private javax.swing.JButton Rectangle;
    private javax.swing.JButton Redo;
    private javax.swing.JButton Rubber;
    private javax.swing.JMenu Save;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton Select;
    private javax.swing.JButton Square;
    private javax.swing.JButton StrokeColor;
    private javax.swing.JButton Triangle;
    private javax.swing.JButton Undo;
    private javax.swing.JMenu XML;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
