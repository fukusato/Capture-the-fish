import greenfoot.*;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int time = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 800, 1); 
    }
<<<<<<< HEAD
    public void act(){
        int x = (int)(Math.random()*500);
        int y = (int)(Math.random()*100);
        int obj = (int)(Math.random()*6);
        int yy = 800 - y;
        showText( String.valueOf(time), 200, 50 );
        if(time == 5){
         if(obj == 0)addObject( new fishA(), x, y );
         if(obj == 1)addObject( new fishB(), x, y );
         if(obj == 2)addObject( new dustA(), x, y );
         if(obj == 3)addObject( new dustB(), x, y );
         if(obj == 4)addObject( new dustC(), x, y );
         time = 0;
        }
        time++;

=======
    for(int i=0;i<3;i++){
         int xmax = 400;
         int xmin = 100;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustB(),x , y );
    }
    for(int i=0;i<3;i++){
         int xmax = 400;
         int xmin = 100;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustC(),x , y );
    }
        showText( "HOGE", 100, 50 );      
>>>>>>> fb94b98afe0ec7de012827ae4c9b3439b74079ae
    }
}
