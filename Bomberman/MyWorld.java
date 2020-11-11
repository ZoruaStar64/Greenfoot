import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound MainMusic;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 650, 1); 
        prepare();
        Wall();
        Pillars();
        BreakableBlockRows();
        MainMusic = new GreenfootSound("04 Level 1.mp3");
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
    private void prepare()
    {
        BlueBomber blueBomber = new BlueBomber();
        addObject(blueBomber,75,75);
        RedBomber redBomber = new RedBomber();
        addObject(redBomber,675,575);

        setPaintOrder(BlueBomber.class, RedBomber.class, UnbreakableBlock.class);
    }

    public void Wall() {
        int teller;
        int x = 0;
        // Horizontale muren
        for (teller= 0; teller <= 14; teller++) {
            x = 0 + (50 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,25 + (x),25);
        }
        for (teller= 0; teller <= 14; teller++) {
            x = 0 + (50 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,25 + (x),625);
        }
        int y = 0;
        // Verticale muren
        for (teller= 0; teller <= 10; teller++) {
            y = 0 + (50 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,25 ,75 + (y));
        }
        for (teller= 0; teller <= 10; teller++) {
            y = 0 + (50 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,725 ,75 + (y));
        }
    }
    public void Pillars() {
        int teller;
        int x = 0;
        // Row 1
         for (teller= 0; teller <= 5; teller++) {
            x = 0 + (100 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,125 + (x),125);
        }
        // Row 2
         for (teller= 0; teller <= 5; teller++) {
            x = 0 + (100 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,125 + (x),225);
        }
        // Row 3
         for (teller= 0; teller <= 5; teller++) {
            x = 0 + (100 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,125 + (x),325);
        }
        // Row 4
         for (teller= 0; teller <= 5; teller++) {
            x = 0 + (100 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,125 + (x),425);
        }
        // Row 5
         for (teller= 0; teller <= 5; teller++) {
            x = 0 + (100 * teller);
            UnbreakableBlock unbreakableBlock = new UnbreakableBlock();
            addObject(unbreakableBlock,125 + (x),525);
        }
    }
    public void BreakableBlockRows() {
        int teller;
        int y = 0;
        // Row 1
          for (teller= 0; teller <= 6; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,75 ,175 + (y));
        }
        // Row 2
          for (teller= 0; teller <= 3; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,125 ,175 + (y));
        }
        // Row 3
           for (teller= 0; teller <= 10; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,175 ,75 + (y));
        }
        // Row 4
           for (teller= 0; teller <= 2; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,225 ,275 + (y));
        }
        // Row 5 1/2
           for (teller= 0; teller <= 2; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,275 ,75 + (y));
        }
        // Row 5 2/2
            for (teller= 0; teller <= 6; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,275 ,275 + (y));
        }
        // Row 6
             for (teller= 0; teller <= 6; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,325 ,75 + (y));
        }
        // Row 7 1/2
            for (teller= 0; teller <= 2; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,375 ,125 + (y));
        }
        // Row 7 2/2
              for (teller= 0; teller <= 2; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,375 ,325 + (y));
        }
        // Row 8
            for (teller= 0; teller <= 6; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,425 ,75 + (y));
        }
        // Row 9
          for (teller= 0; teller <= 10; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,475 ,75 + (y));
        }
        // Row 10
                 for (teller= 0; teller <= 3; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,525 ,75 + (y));
        }
        // Row 11 1/3
               for (teller= 0; teller <= 1; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,575 ,75 + (y));
        }
        // Row 11 2/3
              for (teller= 0; teller <= 3; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,575 ,175 + (y));
        }
        // Row 11 3/3
                  for (teller= 0; teller <= 1; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,575 ,525 + (y));
        }
        // Row 12
                     for (teller= 0; teller <= 3; teller++) {
            y = 0 + (100 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,625 ,175 + (y));
        }
        // Row 13
          for (teller= 0; teller <= 6; teller++) {
            y = 0 + (50 * teller);
            BreakableBlock breakableBlock = new BreakableBlock();
            addObject(breakableBlock,675 ,175 + (y));
        }
    }
}
