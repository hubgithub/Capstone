import java.awt.Point;
import java.lang.NullPointerException;

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
    public Zu(String side,String type,String filename,Chess_pieces[][] array,int x, int y,Point[][] location)
    {
        super(side,type,filename,array,x,y,location);

    }


    public boolean valid_move(int col, int row) throws NullPointerException
    {

        
        if(Math.abs(col - coL)+Math.abs(row - roW) != 1)
        {
            if(side.equals("red"))
            {
                if((roW - row) < 0)
                {
                    return false;
                }
                else if((roW > border) && (coL != col))
                {
                    return false;
                }

            }
            else
            {
                if((roW - row) > 0)
                {
                    return false;
                    
                }
                else if((roW < border) && (coL != col))
                {
                    return false;
                }
                
            }
            
        }
        
        try{
        
            if(array[row][col] == null)
            {
                return true;
            }
        
            else if(array[row][col].getSide().equals(array[roW][coL].getSide()))
            {
                return false;

            
            }
            
        }
        catch(NullPointerException e){}
        return true;
    }
    
    public boolean check_take(int col,int row)
    {
        if(valid_move(col,row))
        {
            return true;
        }
        
        return false;
        
        
    }
    
    

}
