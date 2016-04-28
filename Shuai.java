import java.awt.Point;

/**
 * Write a description of class Shuai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuai extends Chess_pieces
{


    /**
     * Default constructor for objects of class Shuai
     */
    public Shuai(String side,Point location,String type)
    {
        super(side,location,type);
        
    }
    
    public boolean valid_move(Point next_loc)
    {
        if(Math.abs(next_loc.getX()- this.location.getX())+Math.abs(next_loc.getY()-this.location.getY()) != 1)
        {
            return false;
        }
        
        return true;
        
    }



}
