import java.awt.Point;

/**
 * sub class of Chess_pieces
 * 
 * @author (Heng Li) 
 * @version (4-21-2016)
 */
public class Jiu extends Chess_pieces
{
    /** description of instance variable x (add comment for each instance variable) */
    
    

    /**
     * Default constructor for objects of class Jiu
     */
    public Jiu(String side,Point location)
    {
        super(side,location);

    }

    /**
     * valid_move return true if valid, false otherwise
     */
    public boolean valid_move(Point next_loc)
    {
        if((this.location.getX() == next_loc.getX()&&this.location.getY()!= next_loc.getY())||(this.location.getY()==next_loc.getY() || this.location.getX() != next_loc.getX()))
        {
            return true;
        }
        return false;
    }
    
    /**
     * change the location to the next_loc
     */
    public void move(Point next_loc)
    {
        this.location = next_loc;
        
    }

}
