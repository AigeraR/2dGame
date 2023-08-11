import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static  JFrame frame = new JFrame();
    public static  JPanel panel = new JPanel();
    Image imageFon = new ImageIcon("images/fon.jpg").getImage();
    public static Sack sack = new Sack();
    Gold gold = new Gold();
    public static JLabel label = new JLabel("Score: 0");
    public static int score=0;

    public MainFrame() {
        frame.setLocation(50,200);
        frame.setSize(800,600);

        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imageFon,0,0,1300,700,null);
                g.drawImage(sack.getImage(),sack.getX(),sack.getY(),null);
                g.drawImage(gold.getImage(),gold.getX(),gold.getY(),90,60,null);
            }
        };
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        gold.move();



    }
}
