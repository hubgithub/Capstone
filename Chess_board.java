
/**
 * Chess_board, contains all Chess_pieces
 * Red is Up
 * Black is down
 * @author (Heng Li ) 
 * @version (4-21-2016)
 */
public class Chess_board
{

    private Chess_pieces[][] pieces = new Chess_pieces[10][9];

    /**
     * set the initial postion of all pieces
     */
    public Chess_board()
    {
        
        

    }
    
    /**
     * Check if game ends
     */
    public boolean gameEnds()
    {
        Chess_pieces[] one = new Chess_pieces[2];
        int index = 0;
        for(int i = 0; i < 10; i++)
        {
            for(int x = 0; x < 9; x++)
            {
                if(pieces[i][x] != null && pieces[i][x].getType().equals("Shuai"))
                {
                    one[index] = pieces[i][x];
                    index++;
                }
            }
        }
        
        if(one[1] == null)
        {
            return true;
        }
        
        return false;
    }
    
}
