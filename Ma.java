import java.awt.Point;

/**
 * Ma class, extends Chess_pieces
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ma extends Chess_pieces
{
    
    

    /**
     * 
     */
    public Ma(String side,Point location,String type)
    {
        super(side,location,type);

    }
    
    public boolean valid_move(Point next_loc)
    {
        if( (Math.abs(this.location.getX()-next_loc.getX())==1 && Math.abs(this.location.getY()- next_loc.getY())==2) || (Math.abs(this.location.getX()-next_loc.getX())==2 && Math.abs(this.location.getY()- next_loc.getY())==1))
        {
            return true;
        }
        return false;
        
    }

}
