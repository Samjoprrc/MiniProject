package Protector;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Eazymode extends JPanel{
    private final ImageIcon Eazy = new ImageIcon(this.getClass().getResource("/Image/Eazymode.jpg"));
    private final ImageIcon gover = new ImageIcon(this.getClass().getResource("/Image/LoseBg.png"));
    private final ImageIcon goverim = new ImageIcon(this.getClass().getResource("/Image/Lose.png"));
    private final ImageIcon pause = new ImageIcon(this.getClass().getResource("/Image/pause.png"));
    private final ImageIcon resume = new ImageIcon(this.getClass().getResource("/Image/resume.png"));
    private final ImageIcon replay = new ImageIcon(this.getClass().getResource("/Image/replay.png"));
    private final ImageIcon home = new ImageIcon(this.getClass().getResource("/Image/home.png"));
    
    Earth earth = new Earth();
    ArrayList<Monster1> monster = new ArrayList<>();
    
    Menu m = new Menu();
    public JButton Bpause = new JButton(pause);
    public JButton Bresume = new JButton(resume);
    public JButton Breplay = new JButton(replay);
    public JButton Bhome = new JButton(home);
    int times = 0;
    int crash = 1;
    boolean timestart = false;
    boolean letgo = true;
    
    Thread time = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(10);
                }catch(Exception e){ }
                if(timestart == true){
                    repaint();
                }
            }
        }
    });
    
    Thread actor = new Thread(new Runnable(){
            public void run(){
		while(true){
                	try{
                            Thread.sleep(1);
			}catch(Exception e){}
                            repaint();
		}
            }
	});
    
    Thread Mon1 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(letgo == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*2500));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*5000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*6000));
                        }
                        else Thread.sleep((long)(Math.random()*7000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(letgo == true){
                        monster.add(new Monster1("Monster1"));
                    }
            }
        }
    });
    
    Thread Mon2 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(letgo == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*2500));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*5000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*6000));
                        }
                        else Thread.sleep((long)(Math.random()*7000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(letgo == true){
                        monster.add(new Monster1("Monster2"));
                    }
            }
        }
    });
    
    Thread Mon3 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                     if(letgo == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*2500));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*5000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*6000));
                        }
                        else Thread.sleep((long)(Math.random()*7000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(letgo == true){
                        monster.add(new Monster1("Monster3"));
                    }
            }
        }
    });
    
    Thread Mon4 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                     if(letgo == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*2500));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*5000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*6000));
                        }
                        else Thread.sleep((long)(Math.random()*7000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(letgo == true){
                        monster.add(new Monster1("Monster4"));
                    }
            }
        }
    });
    
    Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                        times = times + 1;
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
    
    Eazymode(){
        this.setFocusable(true);
	this.setLayout(null);
        Bpause.setBounds(1200, 20, 50, 50);
        this.add(Bpause);
        Bresume.setBounds(1200, 80, 50, 50);
        this.add(Bresume);
        this.add(Breplay);
        this.add(Bhome);
        Breplay.setBounds(600, 600, 200, 100);
        Bhome.setBounds(1100, 600, 200, 100);
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int a = e.getKeyCode();
                if(a==KeyEvent.VK_UP){
                    earth.y -= 60;
                }
                else if(a==KeyEvent.VK_DOWN){
                    earth.y += 60;
                }
                else if(a==KeyEvent.VK_RIGHT){
                    earth.x += 20;
                }
                else if(a==KeyEvent.VK_LEFT){
                    earth.x -= 20;
                }
            }
        });
        actor.start();
        time.start();
        t.start();
        Mon1.start();
        Mon2.start();
        Mon3.start();
        Mon4.start();
    }
    public void paintComponent(Graphics g){
        if(crash == 1){
            this.remove(Breplay);
            this.remove(Bhome);
            int i;
            g.drawImage(Eazy.getImage(),0,0,1280,690,this);            
            for(i=0;i<monster.size();i++){
                g.drawImage(monster.get(i).getImage(), monster.get(i).getX(), monster.get(i).getY(),100,100 , this);
            }
            g.drawImage(earth.earth.getImage(), earth.x, earth.y,120,120, this);

            if(earth.x<=0){
                earth.x = 0;
            }
            if(earth.x >= 1060){
                earth.x = 1060;
            }
            if(earth.y >= 535){
                earth.y = 535;
            }
            if(earth.y <= 300){
                earth.y = 300;
            }
            
            for(i=0;i<monster.size();i++){
                if(Intersect(earth.getbound(),monster.get(i).getbound())){
                    crash = 0;
                }
            }
            
            g.setColor(Color.BLACK);
            g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
            g.drawString("TIME : "+times, 30, 30);
    }
        else if(crash == 0){
            t.stop();
            this.remove(Bpause);
            this.remove(Bresume);
            g.drawImage(gover.getImage(), 0, 0, 1280, 720, this);
            g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,50));
            g.drawString("SCORE : "+times, 500, 300);
            g.drawImage(goverim.getImage(), 350, 100, this);
            this.add(Breplay);
            this.add(Bhome);
            Breplay.setBounds(700, 400, 200, 100);
            Bhome.setBounds(400, 400, 200, 100);
        }
    }
       

    public boolean Intersect(Rectangle2D a, Rectangle2D b){
	return (a.intersects(b));
    }

}

class Main extends JFrame{
    Main(){
        add(new Eazymode());
    }
    public static void main(String[] args){
        JFrame jf = new Main();
        jf.setSize(1280,720);
        jf.setTitle("THE PROTECTOR");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    } 
}
