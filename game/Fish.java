import greenfoot.*;

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int fish;
    public void Fish()
    {
        fish=0;
    }
    public void act() 
    {
        // Add your action code here.
        fish++;
        getWorld().showText("score="+fish, 300, 50);
    }    
}
