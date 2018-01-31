import greenfoot.*;

/**
 * Write a description of class FishB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fishB extends Fish
{
    /**
     * Act - do whatever the FishB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    public void act() 
    {
        if( Greenfoot.isKeyDown( "q" ) )speed = 10;
        // Add your action code here.
        if(getY() == 799)getWorld().removeObject( this );
        setRotation(90);
        move(speed);// Add your action code here.
    }    
}
