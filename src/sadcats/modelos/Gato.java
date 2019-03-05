/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadcats.modelos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author anlesvavor
 */
public class Gato extends Componente{
    public Gato() {
        setSize(480,360);
    }

    /**
     *
     * @param tipo 1,2,3
     */
    public Gato(Integer tipo) {
        this.tipo = tipo;
        setSize(480,360);
    }

    Integer tipo;
    
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        ImageIcon icono = new ImageIcon(getClass().getResource("../imagenes/gato"+tipo+".jpg"));
        Image image = icono.getImage();
        grphcs.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
    
}
