import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CardClick extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1, b2, b3, b4;
    Container c;

    CardClick(){
        c = getContentPane();
        card = new CardLayout();
        c.setLayout(card);        
        

        b1 = new JButton("on your mark");
        b2 = new JButton("Get set");
        b3 = new JButton("Go");
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("x",b1);
        c.add("y",b2);
        c.add("z",b3);

    }
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
    public static void main(String[] args){
        CardClick c1 = new CardClick();
        
        c1.setSize(300,400);
        c1.setVisible(true);

    }
}
