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
    private int fish=0;
    public void cat() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, Fish.class );
         Actor actor2 = getOneObjectAtOffset( 0, 0, Dust.class );
        // Add your action code here
        if( actor != null ){
            getWorld().removeObject( actor );
            fish++;
            getWorld().showText("Score="+fish,200, 100);
    
    }
    
    if( actor2 != null ){
            getWorld().removeObject( actor2 );
            fish--;
            getWorld().showText("Score="+fish,200, 100);
    
    }
    /*    if( Greenfoot.isKeyDown( "right" ) ){
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
