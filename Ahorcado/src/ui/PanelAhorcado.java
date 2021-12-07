package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Francisco Javier Araujo Mendoza
 */
public class PanelAhorcado extends JPanel {
    private int fallos;
    private int tam;

    public PanelAhorcado(int vidas, JPanel padre) {
        this.fallos = vidas;
        
        int w = padre.getSize().width;
        int h = padre.getSize().height;
        tam = w < h ? w : h;
        this.setSize(tam, tam);
        this.repaint();
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage bufImg;
        Image img;
        try {
            bufImg = ImageIO.read(this.getClass().getResourceAsStream("../recursos/ahorcado" + fallos + ".png"));
            img = bufImg.getScaledInstance(tam, tam, Image.SCALE_REPLICATE);
            g.drawImage(img, 0, 0, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
