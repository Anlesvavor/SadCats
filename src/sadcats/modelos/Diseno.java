/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadcats.modelos;

import sadcats.modelos.Componente;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author anlesvavor
 */
public class Diseno extends JLayeredPane {
    void guardar(File selectedFile) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(selectedFile));
        int n = getComponentCount();
        salida.writeInt(n);
        for (Component component : getComponents()) {
            salida.writeObject(component);
        }
        salida.close();
    }
    
    void abrir(File selectedFile) throws IOException, ClassNotFoundException{
        ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream(selectedFile));
        int n = entrada.readInt();
        removeAll();
        for(int i = 0; i < n; i++) {
            Componente componente = (Componente) entrada.readObject();
            add(componente);
        }
        repaint();
        entrada.close();
    }
}
