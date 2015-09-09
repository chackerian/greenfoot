import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();
    }
    
    // Speed presets
          double speed = 0;
          double acceleration = 0.1;
          
    // Image sprites
    
    
    // Rocket
    
    GreenfootImage accelRocket = new GreenfootImage( "/Users/rex/Desktop/Greenfoot/rocket_accel.png" );
    
    // Enemy Rockets
    
    
    
    public void movement()
    {
 
        // ISSUE - Speed stays at accelerated speed when retry
        
        // TASK - ADD wobble effect on movement
        
        // Only Move if up arrow key is pressed
        if ( Greenfoot.isKeyDown("up") ) {
            setImage(accelRocket);
            Greenfoot.playSound( "/Users/rex/Desktop/Greenfoot/sound_accel.m4a" ); 
            // Accelerate until max speed is reached.
            
        // TASK - Make speed fluctuate mininamally by 1 at random 1/10 chance intervals
            if ( Greenfoot.getRandomNumber(10) > 1 ) {

           speed += acceleration;
           move((int)speed);
           
           if ( speed > 4 ) {
            speed = 6;
            }
          
        }
        
        else {
            
       speed += acceleration;
           move((int)speed);
           
           if ( speed > 4 ) {
            speed = 5;
            }
        
       }
        
        
        if ( Greenfoot.isKeyDown("right") ) {
            turn(4);
            
        }
        

        // Will be used exclusively for docking on planets
        if ( Greenfoot.isKeyDown("down") ) {
       
        }
        
        if ( Greenfoot.isKeyDown("left") ) {
             turn(-4);
        }
            
        }
        
        else {
               speed = 0;
               setImage("/Users/rex/Desktop/Greenfoot/rocket.png");
        }
        
    }
}
