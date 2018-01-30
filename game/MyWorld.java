import greenfoot.*;

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
    private int rtime;
    public void act()
    {
        rtime--;
        showText("rtime="+rtime, 100, 50);
        if( rtime== 0 ){
            showText("time up",200, 50);
            Greenfoot.stop();
        }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(500, 800, 1);
        rtime=1000;
        addObject( new Net1(), 250, 700 );
        //addObject( new fishA(), 200, 50 );
        for(int i=0;i<3;i++){
         int xmax = 400;
         int xmin = 100;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new fishA(),x , y );
    }
    for(int i=0;i<3;i++){
         int xmax = 400;
         int xmin = 100;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new fishB(),x , y );
    }    
    for(int i=0;i<3;i++){
         int xmax = 400;
         int xmin = 100;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustA(),x , y );
    }
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
    }
}
