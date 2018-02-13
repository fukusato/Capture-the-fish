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
    private int spd=2;
    private int rtime=0;
    private int frag=0;
  
        
    public void time(){
        rtime++;
         if(rtime==200){
                spd=2;
                frag=0;
                rtime=0;
            
        }
    }

    public void cat()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, fishA.class );
        Actor actor2 = getOneObjectAtOffset( 0, 0, fishB.class );
        Actor actor3 = getOneObjectAtOffset( 0, 0, dustA.class );
        Actor actor4 = getOneObjectAtOffset( 0, 0, dustB.class );
        Actor actor5 = getOneObjectAtOffset( 0, 0, dustC.class );
        Actor actor6 = getOneObjectAtOffset( 0, 0, item1.class );
        
        

        int x = getX();
        int y = getY();
        //int rtime=0;
        int spd2=10;
        if( actor6 != null ){
            getWorld().removeObject( actor6 );
            spd=spd2;
            frag=1;
        }
        
        
        if(frag==1){
            time();
            getWorld().showText( "Speed up!", 300, 150 );
            //if(frag<500)rtime+=1;
            

        }
        //frag=0;
        
        
   
        
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
           move(-spd);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
        
           move(spd);
        }
        
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


