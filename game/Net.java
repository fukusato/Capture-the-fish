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
    public void act() 
    {
        
        Actor actor1 = getOneObjectAtOffset( 0, 0, dustA.class );
        if( actor1 != null ){
                getWorld().removeObject( actor1 );
        }  
        
        Actor actor2 = getOneObjectAtOffset( 0, 0, dustB.class );
        if( actor2 != null ){
                getWorld().removeObject( actor2 );
        }  
        
        Actor actor3 = getOneObjectAtOffset( 0, 0, dustC.class );
        if( actor3 != null ){
                getWorld().removeObject( actor3 );
        }  
        
        Actor actor4 = getOneObjectAtOffset( 0, 0, fishA.class );
        if( actor4 != null ){
                getWorld().removeObject( actor4 );
        }  
        
        Actor actor5 = getOneObjectAtOffset( 0, 0, fishB.class );
        if( actor5 != null ){
                getWorld().removeObject( actor5 );
        }  
    }    
}
