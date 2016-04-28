import java.awt.Point;

/**
 * Write a description of class Shi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shi extends Chess_pieces
{


    /**
     * Default constructor for objects of class Shi
     */
    public Shi(String side,Point location,String type)
    {
        super(side,location,type);
        
    }
    
    public boolean valid_move(Point next_loc)
    {
        if(Math.abs(this.location.getX()-next_loc.getX())==1 && Math.abs(this.location.getY()-next_loc.getY())==1)
        {
            return true;
        }
        
        return false;
        
    }



}
