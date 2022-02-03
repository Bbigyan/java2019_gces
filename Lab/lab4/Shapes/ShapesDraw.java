
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
public class ShapesDraw extends JFrame{
    ShapesDraw(){
        setSize(1000,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.drawOval(50,50,60,60);
        g.setColor(Color.PINK);
        g.fillOval(50,50,60,60);
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{190,120,110}, new int[]{190,200,110} ,3);
        g.setColor(Color.ORANGE);
        g.fillOval(300,350,100,60);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[]{90,160,200,160,90,50}, new int[]{200,220,270,350,350,270},6);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{90,160,200,160,90}, new int[]{400,400,470,550,550},5);
    }
    public static void main(String[] args) {
        new ShapesDraw();
    }
}
