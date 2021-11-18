package Protector;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Menu extends JPanel{
    private ImageIcon bg = new ImageIcon(this.getClass().getResource("/Image/Hbg.png"));
    private ImageIcon tp = new ImageIcon(this.getClass().getResource("/Image/tp.png"));
    private ImageIcon ez = new ImageIcon(this.getClass().getResource("/Image/Eazy.png"));
    private ImageIcon nm = new ImageIcon(this.getClass().getResource("/Image/Normal.png"));
    private ImageIcon h = new ImageIcon(this.getClass().getResource("/Image/Hard.png"));
    public JButton ch1 = new JButton(ez);
    public JButton ch2 = new JButton(nm);
    public JButton ch3 = new JButton(h);
    Menu(){
        setLayout(null);
        add(ch1);
        ch1.setBounds(300, 250, 400, 85);
        add(ch2);
        ch2.setBounds(300, 400, 400, 85);
        add(ch3);
        ch3.setBounds(300, 550, 400, 85);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,1000,800,this);
        g.drawImage(tp.getImage(),200,100,this);
        g.setColor(Color.BLACK);
    }
}

