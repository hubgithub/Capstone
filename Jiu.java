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
    public Jiu(String side,String type,String filename,Chess_pieces[][] array, int coL, int roW,Point[][] location)
    {
        super(side,type,filename,array,coL,roW,location);

    }

    /**
     * valid_move return true if valid, false otherwise
     */
    public boolean valid_move(int col, int row)
    {
        if(col == coL && row == roW)
        {
            return true;
        }
        
        if(coL != col && row == roW)
        {
            
            for(int i = coL+1; i <= col; i++)
            {
                if(array[row][i] != null)
                {
                    return false;
                }
                
            }
        }
        else if(roW != row && coL == col)
        {
            for(int i = roW + 1; i < row; i++)
            {
                if(array[i][col] != null)
                {
                    return false;
                }
            }
            
        }
        else
        {
            return false;
        }
        
        if(array[row][col] == null)
        {
            return true;
        }
        
        if(array[row][col].getSide().equals(side))
        {
            return false;
        }        
        return true;
    }
    
    public boolean check_take(int col, int row)
    {
        if(col == coL && row == roW)
        {
            return false;
        }        
        
        
        return valid_move(col,row);

        
    }
    


}

//         if(array[row][col].getSide().equals(side))
//         {
//             return false;
//         }
//         
//         if(coL != col && row == roW)
//         {
//             
//             for(int i = coL+1; i <= col; i++)
//             {
//                 if(array[row][i] != null)
//                 {
//                     return false;
//                 }
//                 
//             }
//         }
//         else if(roW != row && coL == col)
//         {
//             for(int i = roW + 1; i <= row; i++)
//             {
//                 if(array[i][col] != null)
//                 {
//                     return false;
//                 }
//             }
//             
//         }
//         else
//         {
//             return false;
//         }
//         
//         return true;        
//         
//         