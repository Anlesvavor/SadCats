/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadcats.modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author anlesvavor
 */
public class TextoSombra extends Texto{

    public TextoSombra() {
    }

    public TextoSombra(String texto, Color color, double rotacion) {
        super(texto, color, rotacion);
    }

    public TextoSombra(String texto, Color color, double rotacion, int tamano) {
        super(texto, color, rotacion, tamano);
    }
    
    
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);    
        for (int i = 0; i < 3; i++){
            grphcs.setColor(getColor());
            grphcs.drawString(getTexto(), 3 * i +12, 2*i + 12);
        }
        
    }
}
