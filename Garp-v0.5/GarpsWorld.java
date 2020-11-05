import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GarpsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GarpsWorld extends World

{
    private GreenfootSound MainMusic;

    /**
     * Constructor for objects of class GarpsWorld.
     * 
     */
    public GarpsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        populateTheWorld();
        MainMusic = new GreenfootSound("Paper Game.mp3");

        prepare();
    }

    public void started() {
        MainMusic.playLoop();
    }

    public void stopped() {
        MainMusic.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    protected void populateTheWorld()
    {
        int teller;

        
        addObject(new Garp(), 350, 250);
        addObject(new Gnomus(), Greenfoot.getRandomNumber(670) + 15,
            Greenfoot.getRandomNumber(470) + 15); 
        for(teller = 0; teller < 10; teller++) {
            addObject(new Diamond(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(500));
        }
        for(teller = 0; teller < 6; teller++) {
            addObject(new Rock(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(500));
        }
        for(teller = 0; teller < 4; teller++) {
            addObject(new Bomb(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(500));
        }

        setPaintOrder(Garp.class, Gnomus.class, Diamond.class, Bomb.class, Rock.class);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
