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

        }
        


    public void cat()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, fishA.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, fishB.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, dustA.class );
        Actor actor4 = getOneObjectAtOffset( 0, 0, dustB.class );
        Actor actor5 = getOneObjectAtOffset( 0, 0, dustC.class );

        if( actor != null ){
            getWorld().removeObject( actor );
            fish=fish+3;
            getWorld().showText("Score="+fish,200, 100);

        }

        if( actor2 != null ){
            getWorld().removeObject( actor2 );
            fish=fish+10;
            getWorld().showText("Score="+fish,200, 100);

        }
        if( actor3 != null ){
            getWorld().removeObject( actor3 );
            fish--;
            getWorld().showText("Score="+fish,200, 100);

        }
        if( actor4 != null ){
            getWorld().removeObject( actor4 );
            fish=fish-4;
            getWorld().showText("Score="+fish,200, 100);

        }
        if( actor5 != null ){
            getWorld().removeObject( actor5 );
            fish=fish-3;
            getWorld().showText("Score="+fish,200, 100);

        }


    }
}
