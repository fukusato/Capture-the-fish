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
    public void act() 
    {
        // Add your action code here.
        if(getY() == 799)getWorld().removeObject( this );
        setRotation(90);
        move(1);// Add your action code here.
    }    
}
