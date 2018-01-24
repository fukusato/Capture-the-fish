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
<<<<<<< HEAD
        super(500, 800, 1);
        rtime=1000;
        //addObject( new fishA(), 200, 50 );
        //addObject( new fishA(), 200, 50 );
        for(int i=0;i<5;i++){
         int xmax = 600;
         int xmin = 0;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new fishA(),x , y );
    }
    for(int i=0;i<5;i++){
         int xmax = 600;
         int xmin = 0;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new fishB(),x , y );
    }    
    for(int i=0;i<5;i++){
         int xmax = 600;
         int xmin = 0;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustA(),x , y );
    }
    for(int i=0;i<5;i++){
         int xmax = 600;
         int xmin = 0;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustB(),x , y );
    }
    for(int i=0;i<5;i++){
         int xmax = 600;
         int xmin = 0;
         int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
         
         int ymax = 400;
         int ymin = 0;
         int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
         
         addObject( new dustC(),x , y );
    }    
=======
        super(500, 800, 1); 
        showText( "HOGE", 100, 50 );
        addObject( new fishA(), 200, 50 );        
>>>>>>> 1399b55509ac8c53116a8e8fba1dab01617e4a81
    }
}
