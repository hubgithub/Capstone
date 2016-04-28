import java.awt.Point;

/**
 * Write a description of class Zu here.
 * 
 * @author (Heng Li) 
 * @version (4-20-2016)
 */
public class Zu extends Chess_pieces
{
    

    /**
     * Default constructor for objects of class Zu
     */
    public Zu(String side,Point location,String type)
    {
        super(side,location,type);

    }


    public boolean valid_move(Point next_loc)
    {
        if(Math.abs(next_loc.getX()- this.location.getX())+Math.abs(next_loc.getY()-this.location.getY()) != 1)
        {
            if(side.equals("red"))
            {
                if((this.location.getY() - next_loc.getY()) < 0)
                {
                    return false;
                }
                else if((this.location.getY() > border) && (this.location.getX() != next_loc.getX()))
                {
                    return false;
                }

            }
            else
            {
                if((this.location.getY() - next_loc.getY()) > 0)
                {
                    return false;
                    
                }
                else if((this.location.getY() < border) && (this.location.getX() != next_loc.getX()))
                {
                    return false;
                }
                
            }
            
        }
        
        return true;
        
        
    }
    
    
//     public void move(Point next_loc)
//     {
//         this.location = next_loc;
// 
//     }

}
