import greenfoot.*;

/**
 * Write a description of class Net here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Net extends Actor
{
    /**
     * Act - do whatever the Net wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int fish;
    public Net()
    {
        fish=0;
    }
    public void act() 
    {
       move();
       cat(); // Add your action code here.
    }
    public void cat() 
    {
       
    }

    
       public void move() 
    {
        // Add your action code here.
int x = getX();
int y = getY();
if( Greenfoot.isKeyDown( "left" ) ){
   setLocation( x-1,y );
   move(-2);
}
if( Greenfoot.isKeyDown( "right" ) ){
   setLocation( x+1,y );

   move(2);
}
}
}