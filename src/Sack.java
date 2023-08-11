import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Sack implements KeyListener {
    private int x=300,y=400;

    public Sack() {
        MainFrame.frame.addKeyListener(this);
    }

    private Image image = new ImageIcon("images/sack.png").getImage();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT) x-=10;
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) x+=10;

        MainFrame.panel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
