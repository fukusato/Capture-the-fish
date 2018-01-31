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
        Actor actor3 = getOneObjectAtOffset( 0, 0, Item.class );

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
    }
    }    

