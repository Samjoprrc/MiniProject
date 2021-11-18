package Protector;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Game extends JFrame implements ActionListener{
    Menu m = new Menu();
    Hardmode Hd = new Hardmode();
    Eazymode Ez = new Eazymode();
    Normalmode Nm = new Normalmode();
    
    public Game(){
        Hinvoke();
    }    
    public final void Hdinvoke(){   
        Hd = new Hardmode();
        Hd.Bpause.addActionListener(this);
        Hd.Bresume.addActionListener(this);
        Hd.Breplay.addActionListener(this);
        Hd.Bhome.addActionListener(this);
    }
    public final void Ezinvoke(){
        Ez = new Eazymode();
        Ez.Bpause.addActionListener(this);
        Ez.Bresume.addActionListener(this);
        Ez.Breplay.addActionListener(this);
        Ez.Bhome.addActionListener(this);
    }
    public final void Nminvoke(){
        Nm = new Normalmode();
        Nm.Bpause.addActionListener(this);
        Nm.Bresume.addActionListener(this);
        Nm.Breplay.addActionListener(this);
        Nm.Bhome.addActionListener(this);
    }
    public final void Hinvoke(){
        m = new Menu();
        this.setSize(1000, 800);        
        this.add(m);
        m.ch1.addActionListener(this);
        m.ch2.addActionListener(this);
        m.ch3.addActionListener(this);
        Hd.Bpause.addActionListener(this);
        Hd.Bresume.addActionListener(this);
        Hd.Breplay.addActionListener(this);
        Hd.Bhome.addActionListener(this);
        Ez.Bpause.addActionListener(this);
        Ez.Bresume.addActionListener(this);
        Ez.Breplay.addActionListener(this);
        Ez.Bhome.addActionListener(this);
        Nm.Bpause.addActionListener(this);
        Nm.Bresume.addActionListener(this);
        Nm.Breplay.addActionListener(this);
        Nm.Bhome.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //5 Lanes
        if(e.getSource()==m.ch1){
            this.setLocationRelativeTo(null);
            this.remove(m);
            this.setSize(1280,720);
            this.add(Hd);
            Hd.requestFocusInWindow();
            Hd.times = 0;
        }
        else if(e.getSource()==Hd.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Hd);
            Hd.requestFocusInWindow();
            Hd.actor.suspend(); //stop monster
            Hd.t.suspend();
            Hd.Mon1.suspend();
            Hd.Mon2.suspend();
            Hd.Mon3.suspend();
            Hd.Mon4.suspend();
            Hd.time.suspend();
        }
        else if(e.getSource()==Hd.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Hd);
            Hd.requestFocusInWindow();
            Hd.actor.resume(); 
            Hd.t.resume();
            Hd.Mon1.resume();
            Hd.Mon2.resume();
            Hd.Mon3.resume();
            Hd.Mon4.resume();
            Hd.time.resume();
        }
        else if(e.getSource() == Hd.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(Hd);
            Hd = new Hardmode();
            Hdinvoke();
            this.add(Hd);
            Hd.requestFocusInWindow();
            Hd.times = 0;           
        }
        else if(e.getSource() == Hd.Bhome){
            this.remove(Hd);           
            Hinvoke();
            Hdinvoke();            
        }
        //4 Lanes
        else if(e.getSource()==m.ch2){
            this.setLocationRelativeTo(null);
            this.remove(m);
            this.setSize(1280,720);
            this.add(Ez);
            Ez.requestFocusInWindow();
            Ez.times = 0;
        }
        else if(e.getSource()==Ez.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Ez);
            Ez.requestFocusInWindow();
            Ez.actor.suspend();
            Ez.t.suspend();
            Ez.Mon1.suspend();
            Ez.Mon2.suspend();
            Ez.Mon3.suspend();
            Ez.Mon4.suspend();
            Ez.time.suspend();
        }
        else if(e.getSource()==Ez.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Ez);
            Ez.requestFocusInWindow();
            Ez.actor.resume();
            Ez.t.resume();
            Ez.Mon1.resume();
            Ez.Mon2.resume();
            Ez.Mon3.resume();
            Ez.Mon4.resume();
            Ez.time.resume();
        }
        else if(e.getSource() == Ez.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(Ez);
            Ez = new Eazymode();
            Ezinvoke();
            this.add(Ez);
            Ez.requestFocusInWindow();
            Ez.times = 0;           
        }
        else if(e.getSource() == Ez.Bhome){
            this.remove(Ez);           
            Hinvoke();
            Ezinvoke();            
        }
        //3 Lanes
        else if(e.getSource()==m.ch3){
            this.setLocationRelativeTo(null);
            this.remove(m);
            this.setSize(1280,720);
            this.add(Nm);
            Nm.requestFocusInWindow();
            Nm.times = 0;
        }
        else if(e.getSource()==Nm.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Nm);
            Nm.requestFocusInWindow();
            Nm.actor.suspend();
            Nm.t.suspend();
            Nm.Mon1.suspend();
            Nm.Mon2.suspend();
            Nm.Mon3.suspend();
            Nm.Mon4.suspend();
            Nm.time.suspend();
        }
        else if(e.getSource()==Nm.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(Nm);
            Nm.requestFocusInWindow();
            Nm.actor.resume();
            Nm.t.resume();
            Nm.Mon1.resume();
            Nm.Mon2.resume();
            Nm.Mon3.resume();
            Nm.Mon4.resume();
            Nm.time.resume();
        }
        else if(e.getSource() == Nm.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(Nm);
            Nm = new Normalmode();
            Nminvoke();
            this.add(Nm);
            Nm.requestFocusInWindow();
            Nm.times = 0;           
        }
        else if(e.getSource() == Nm.Bhome){
            this.remove(Nm);           
            Hinvoke();
            Nminvoke();            
        }
        this.validate();
        this.repaint();
    }
    
   public static void main(String[] args){
        JFrame jf = new Game();
        jf.setSize(1000,800);
        jf.setTitle("The Protector");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
   }

}
