/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
/**
 *
 * @author Valéria
 */
public class MyJButton extends JButton {

    /**
     * @return the over
     */
    public boolean isOver() {
        return over;
    }

    /**
     * @param over the over to set
     */
    public void setOver(boolean over) {
        this.over = over;
    }

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
        setBackground(cor);
    }

    /**
     * @return the corHover
     */
    public Color getCorHover() {
        return corHover;
    }

    /**
     * @param corHover the corHover to set
     */
    public void setCorHover(Color corHover) {
        this.corHover = corHover;
    }

    /**
     * @return the corSelected
     */
    public Color getCorSelected() {
        return corSelected;
    }

    /**
     * @param corSelected the corSelected to set
     */
    public void setCorSelected(Color corSelected) {
        this.corSelected = corSelected;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyJButton(){
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setCor(new Color(0,196,204));
        corHover = Color.WHITE;
        corSelected = Color.BLUE;
        //corBorda = new Color(90,90,90);
        setContentAreaFilled(false);
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent botao){
                setBackground(corHover);
                over = true;
            }
            
            @Override
            public void mouseExited(MouseEvent botao){
                setBackground(cor);
                over = false;
            }
            
            @Override
           public void mousePressed(MouseEvent botao){
                setBackground(corSelected);
           }
           
           @Override
           public void mouseReleased(MouseEvent botao){
               if(over){
                    setBackground(corHover);
               }
               else{
                   setBackground(cor);
               }
           }
    });
        
    }
    
    private boolean over;
    private Color cor,corHover,corSelected;
    private int radius =0;
    
    @Override
    protected void paintComponent(Graphics grafico){
        Graphics2D  grafico2 = (Graphics2D) grafico;
        grafico2.setRenderingHint(RenderingHints.KEY_ANTIALIASING ,RenderingHints.VALUE_ANTIALIAS_ON);
        grafico2.setColor(cor);
        grafico2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        grafico2.setColor(getBackground());
        grafico2.fillRoundRect(1,1,getWidth()-2,getHeight()-2,radius,radius);
        
        super.paintComponent(grafico);
    }
}
