package Protector;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.Random;

public class Mons3 extends img{     
    Mons3(String str){
        super(str);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] a = {1,2,3,4,5};  
                int rd = new Random().nextInt(a.length);
                if(a[rd] == 1){
                    y = 300;
                }
                else if(a[rd] == 2){
                    y = 360;
                }
                else if(a[rd] == 3){
                    y = 420;
                }
                else if(a[rd] == 4){ 
                    y = 480;
                }
                else y = 535;
		while(true){
                    x -= 6;
                    if(x <= -500){ 
			img = null;
			runner = null;
                    }
                    try{
			runner.sleep(10);
                    }catch(InterruptedException e){}
                }
            }
    });

    @Override
   public Image getImage(){
            return img;
	}
	
    @Override
	public int getX(){
            return x;
	}
    @Override
	public int getY(){
            return y;
	}
    @Override
	public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,180,30));
	}
}

