import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GarpsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GarpsWorld extends World
{

    /**
     * Constructor for objects of class GarpsWorld.
     * 
     */
    public GarpsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Garp garp = new Garp();
        addObject(garp,311,176);

        Gnomus gnomus = new Gnomus();
        addObject(gnomus,329,425);
        Gnomus gnomus2 = new Gnomus();
        addObject(gnomus2,596,75);
        Gnomus gnomus3 = new Gnomus();
        addObject(gnomus3,594,431);
        Gnomus gnomus4 = new Gnomus();
        addObject(gnomus4,72,67);
        Gnomus gnomus5 = new Gnomus();
        addObject(gnomus5,73,421);
        Gnomus gnomus6 = new Gnomus();
        addObject(gnomus6,328,63);
        garp.setLocation(341,241);
        Garp garp2 = new Garp();
        addObject(garp2,430,244);
        Garp garp3 = new Garp();
        addObject(garp3,519,244);
        Garp garp4 = new Garp();
        addObject(garp4,247,235);
        Garp garp5 = new Garp();
        addObject(garp5,149,287);
        garp4.setLocation(240,175);
        garp2.setLocation(435,175);
        garp3.setLocation(518,284);
        Garp garp6 = new Garp();
        addObject(garp6,433,251);
    }
}
