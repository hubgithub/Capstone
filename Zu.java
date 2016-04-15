import java.awt.Point;

/**
 * Write a description of class Zu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zu
{
    /** description of instance variable x (add comment for each instance variable) */
    private int step;
    private String side;

    /**
     * Default constructor for objects of class Zu
     */
    public Zu(String side)
    {
        // initialise instance variables
        step = 1;
        this.side = side;
    }


    public boolean validMove(int x, int y, int x1, int y1)
    {
        if(x == x1 && y == y1)
        {
            return false;
        }
        else if(x != x1 && y != y1)
        {
            return false;
        }
        
        if((x > HB_JIE && x != x1 && side == "red")|| (x < BH_JIE && x != x1 && side == "black"))
        {
            return false;
        }
        
        if((y1 - y < 0 && side.equals("red")) || (y1 - y > 0 && side.equals("black")) )
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
    public int move(int x, int y,int x1, int y1)
    {
        

    }

}
