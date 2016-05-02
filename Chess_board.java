import java.awt.Point;

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
    private Point[][] location = new Point[10][9];

    /**
     * set the initial postion of all pieces
     */
    public Chess_board()
    {
       
        
       pieces[0] = 
       {
           new Chess_pieces("red","Jiu","",new Chess_pieces[10][9],0,0),
           new Chess_pieces("red","Ma","",new Chess_pieces[10][9],1,0),
           new Chess_pieces("red","Xiang","",new Chess_pieces[10][9],2,0),
           new Chess_pieces("red","Shi","",new Chess_pieces[10][9],3,0),
           new Chess_pieces("red","Shuai","",new Chess_pieces[10][9],4,0),
           new Chess_pieces("red","Shi","",new Chess_pieces[10][9],5,0),
           new Chess_pieces("red","Xiang","",new Chess_pieces[10][9],6,0),
           new Chess_pieces("red","Ma","",new Chess_pieces[10][9],7,0),
           new Chess_pieces("red","Jiu","",new Chess_pieces[10][9],8,0)

       }
       
       pieces[2][1] = new Chess_pieces("red","Pao","",new Chess_pieces[10][9],1,2);
       pieces[2][7] = new Chess_pieces("red","Pao","",new Chess_pieces[10][9],7,2);
            
            
            
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
    
    public String whoWon()
    {
        
        String winner = "";
        
        if(gameEnds())
        {
            for(int i = 0; i < 10; i++)
            {
                for(int x = 0; x < 9; x++)
                {
                    if(pieces[i][x] != null && pieces[i][x].getType().equals("Shuai"))
                    {
                        winner = pieces[i][x].getSide();

                    }
                }
            }
            
            
        }
        else
        {
            winner = "None";
            
        }
        
        return winner;
        
    }
    
}
