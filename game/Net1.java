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
<<<<<<< HEAD
    
    public void cat() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, Fish.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, Dust.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, Item.class );

        // Add your action code here
=======

        }
        


    public void cat()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, fishA.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, fishB.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, dustA.class );
        Actor actor4 = getOneObjectAtOffset( 0, 0, dustB.class );
        Actor actor5 = getOneObjectAtOffset( 0, 0, dustC.class );

>>>>>>> 4a0f5b885de12bb00d319209485bd3ace0b20fe9
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

        if( actor3 != null ){
            getWorld().removeObject( actor3 );
            
            for(int time=0;time<100;time++){
                
                   if( Greenfoot.isKeyDown( "left" ) ){
                       
                       move(-2);
                    }
                    if( Greenfoot.isKeyDown( "right" ) ){
                       
                    
                       move(2);
                    }
                   
               
            }
            
            getWorld().showText("アイテムget",300, 100);

        

        }
<<<<<<< HEAD
    }
    }    
=======
>>>>>>> 4a0f5b885de12bb00d319209485bd3ace0b20fe9


    }
}
