import java.awt.Point;

/**
 * extends Chess_pieces
 * 
 * @author (Heng Li) 
 * @version (4-20-2016)
 */
public class Pao extends Chess_pieces
{


    /**
     * Default constructor for objects of class Pao
     */
    public Pao(String side,Point location)
    {
        super(side,location);

    }
    
    public boolean valid_move(Point next_loc)
    {
        return true;
        
    }



}
