import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gold {
    private int x=0,y=0;
    public Gold() {}
    private Image image = new ImageIcon("images/gold.png").getImage();

    void move(){
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(y>600) {
                    y=-10;
                    x=0+(int) (Math.random()*500);
                    MainFrame.score--;
                    if(MainFrame.score<=0){
                        MainFrame.score=0;
                    }
                    MainFrame.label.setText("Score: "+MainFrame.score);
                }else {
                    y += 2;
                    if(x>=MainFrame.sack.getX() && x<=MainFrame.sack.getX()+MainFrame.sack.getImage().getWidth(null)
                    && y>=MainFrame.sack.getY() && y<=MainFrame.sack.getY()+MainFrame.sack.getImage().getHeight(null)
                    ){
                        y=-10;
                        x=0+(int) (Math.random()*500);
                        MainFrame.score++;
                        MainFrame.label.setText("Score: " +MainFrame.score);
                    }
                }
                MainFrame.panel.repaint();
            }
        });
        timer.start();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Image getImage() {
        return image;
    }
}
