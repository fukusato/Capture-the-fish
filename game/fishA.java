import greenfoot.*;

/**
 * Write a description of class FishA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fishA extends Fish
{
    /**
     * Act - do whatever the FishA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    public void act() 
    {
        if(getY() == 799)getWorld().removeObject( this );
        if( Greenfoot.isKeyDown( "q" ) )speed = 10;
        setRotation(90);
        move(speed);// Add your action code here   

    int y1=0;
    //for(int i=0;y==800;i++){
        y1=getY();
        getWorld().showText("y="+y1, 100, 200);
    //}
        if(y1==799){
            getWorld().removeObject( this );
    
    }
}
}
