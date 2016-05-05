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
       
        
        /////////////////////////////////////////////////////////////////////////
       pieces[0][0] = new Jiu("red","Jiu","",new Chess_pieces[10][9],0,0);
       pieces[0][1] = new Ma("red","Ma","",new Chess_pieces[10][9],1,0);
       pieces[0][2] = new Xiang("red","Xiang","",new Chess_pieces[10][9],2,0);
       pieces[0][3] = new Shi("red","Shi","",new Chess_pieces[10][9],3,0);
       pieces[0][4] = new Shuai("red","Shuai","",new Chess_pieces[10][9],4,0);
       pieces[0][5] = new Shi("red","Shi","",new Chess_pieces[10][9],5,0);
       pieces[0][6] = new Xiang("red","Xiang","",new Chess_pieces[10][9],6,0);
       pieces[0][7] = new Ma("red","Ma","",new Chess_pieces[10][9],7,0);
       pieces[0][8] = new Jiu("red","Jiu","",new Chess_pieces[10][9],8,0);

       
       pieces[2][1] = new Pao("red","Pao","",new Chess_pieces[10][9],1,2);
       pieces[2][7] = new Pao("red","Pao","",new Chess_pieces[10][9],7,2);
       
       pieces[3][0] = new Zu("red","Zu","",new Chess_pieces[10][9],0,3);
       pieces[3][2] = new Zu("red","Zu","",new Chess_pieces[10][9],2,3);
       pieces[3][4] = new Zu("red","Zu","",new Chess_pieces[10][9],4,3);
       pieces[3][6] = new Zu("red","Zu","",new Chess_pieces[10][9],6,3);
       pieces[3][8] = new Zu("red","Zu","",new Chess_pieces[10][9],8,3);
       
       
       //楚河                                                             汉界
       
       pieces[6][0] = new Zu("Black","Zu","",new Chess_pieces[10][9],0,6);
       pieces[6][2] = new Zu("Black","Zu","",new Chess_pieces[10][9],2,6);
       pieces[6][4] = new Zu("Black","Zu","",new Chess_pieces[10][9],4,6);
       pieces[6][6] = new Zu("Black","Zu","",new Chess_pieces[10][9],6,6);
       pieces[6][8] = new Zu("Black","Zu","",new Chess_pieces[10][9],8,6);
       
       pieces[7][1] = new Pao("Black","Pao","",new Chess_pieces[10][9],1,7);
       pieces[7][7] = new Pao("Black","Pao","",new Chess_pieces[10][9],7,7);
       
       
       pieces[9][0] = new Jiu("Black","Jiu","",new Chess_pieces[10][9],0,9);
       pieces[9][1] = new Ma("Black","Ma","",new Chess_pieces[10][9],1,9);
       pieces[9][2] = new Xiang("Black","Xiang","",new Chess_pieces[10][9],2,9);
       pieces[9][3] = new Shi("Black","Shi","",new Chess_pieces[10][9],3,9);
       pieces[9][4] = new Shuai("Black","Shuai","",new Chess_pieces[10][9],4,9);
       pieces[9][5] = new Shi("Black","Shi","",new Chess_pieces[10][9],5,9);
       pieces[9][6] = new Xiang("Black","Xiang","",new Chess_pieces[10][9],6,9);
       pieces[9][7] = new Ma("Black","Ma","",new Chess_pieces[10][9],7,9);
       pieces[9][8] = new Jiu("Black","Jiu","",new Chess_pieces[10][9],8,9);
       /////////////////////////////////////////////////////////////////////////////
       
       
       for(int i = 0; i < pieces.length;i++)
       {
           for(int x = 0; x < pieces[0].length;x++)
           {
               if(pieces[i][x] != null)
               {
                   pieces[i][x].setArray(pieces);
               }
           }
       }
       
       
       
            
            
            
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
    
    
    
    public Chess_pieces[][] getPieces()
    {
        return pieces;
    }
    
    
    public Point[][] getPoints()
    {
        return location;
    }
    
}
