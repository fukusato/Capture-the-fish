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
        cat();// Add your action code here.
    }
    public void cat()
    {
    
    }
    
       public void move() 
    {
        // Add your action code here.
             if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
}
if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(4);
}
/*if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(4);
}
if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(4);
}*/
}
}