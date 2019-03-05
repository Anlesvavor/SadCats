/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadcats.modelos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/**
 *
 * @author anlesvavor
 */
public class Texto extends Componente {

    private String texto;
    private Color color;
    private double rotacion;
    private float tamano;

    public Texto() {
        setSize(500, 80);
    }

    public Texto(String texto, Color color, double rotacion) {
        setSize(500, 80);
        this.texto = texto;
        this.color = color;
        this.rotacion = rotacion;
    }

    public Texto(String texto, Color color, double rotacion, float tamano) {
        setSize(500, 80);

        this.texto = texto;
        this.color = color;
        this.rotacion = rotacion;
        this.tamano = tamano;
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g = (Graphics2D) grphcs;
        g.setColor(color);
        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * tamano);
        g.setFont(newFont);
        g.rotate(Math.toRadians(rotacion));
        g.drawString(texto, 0, getHeight()/2);
    }

    @Override
    public String toString() {
        return "Texto{" + "texto=" + texto + ", color=" + color + ", rotacion=" + rotacion + ", tamano=" + tamano + '}';
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

}
