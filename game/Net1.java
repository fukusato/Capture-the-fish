import greenfoot.*;

/**
 * Write a description of class Net1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Net1 extends Net
{
    /**
     * Act - do whatever the Net1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
    }
    if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(4);
    }
    Actor actor = getOneObjectAtOffset( 0, 0, Fish.class );
    if( actor != null ){
        getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
    }
    }    
}
