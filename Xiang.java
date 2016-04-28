import java.awt.Point;

/**
 * Xiang extends Chess_pieces
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Xiang extends Chess_pieces
{


    /**
     * Default constructor for objects of class Xiang
     */
    public Xiang(String side,Point location,String type)
    {
        super(side,location,type);

    }
    
    
    public boolean valid_move(Point next_loc)
    {
        if((Math.abs(this.location.getX()-next_loc.getX())==2)&&(Math.abs(this.location.getY()-next_loc.getY())==2))
        {
            return true;
        }
        return false;
        
    }


}
