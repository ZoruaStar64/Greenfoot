import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
/**
 * Write a description of class GarpsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GarpsWorld extends World

{
    private GreenfootSound MainMusic;
    private Counter counter;
    private EndScore endScore;
    
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

    }

    public void started() {
        endScore = new EndScore();
        MainMusic.playLoop();
    }

    public void stopped() {
        int score;
        score = counter.getScore();
        endScore.setEndImage(score);
        addObject(endScore, getWidth() / 2, getHeight() / 2);

        MainMusic.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    protected void populateTheWorld()
    {
        int teller;      
        int regel, kolom;

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
        counter = new Counter();
        regel = getHeight() - counter.getImage().getHeight() / 2 - 2;
        kolom = counter.getImage().getWidth() / 2 + 1;
        addObject(counter, kolom, regel);
        setPaintOrder(Counter.class, Garp.class, Gnomus.class, Diamond.class, Bomb.class, Rock.class);

    }
}
