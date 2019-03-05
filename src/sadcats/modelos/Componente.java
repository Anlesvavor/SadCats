/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadcats.modelos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 *
 * @author anlesvavor
 */
public class Componente extends JComponent implements MouseListener, MouseMotionListener{
    
    public Componente() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int tx = me.getX() - xi;
        int ty = me.getY() - yi;
        setLocation(getX() + tx, getY() + ty);
    }
    
    int xi, yi;
    
    @Override
    public void mousePressed(MouseEvent me) {
        xi = me.getX();
        yi = me.getY();
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }
    
}
