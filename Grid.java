public class Grid
{
    private Location[][] grid = new Location[NUM_ROWS][NUM_COLS];
    
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    public static final String ROW_NAMES[] = {"A","B","C","D","E","F","G","H","I","J"};
    
    public Grid()
    {
        for(int i = 0; i < NUM_ROWS; i++)
        {
            for(int j = 0; j < NUM_COLS; j++)
            {
                grid[i][j] = new Location();
            }
        }
    }
    
    public void markHit(int row, int col)
    {
        grid[row][col].markHit();
    }
    
    public void markMiss(int row, int col)
    {
        grid[row][col].markMiss();
    }
    
    public void setStatus(int row, int col, int status)
    {
        grid[row][col].setStatus(status);
    }
    
    public int getStatus(int row, int col)
    {
        return grid[row][col].getStatus();
    }
    
    public boolean alreadyGuessed(int row, int col)
    {
        return !grid[row][col].isUnguessed();
    }
    
    public void setShip(int row, int col, boolean val)
    {
        grid[row][col].setShip(val);
    }
    
    public boolean hasShip(int row, int col)
    {
        return grid[row][col].hasShip();
    }
    
    public Location get(int row, int col)
    {
        return grid[row][col];
    }
    
    public int numRows()
    {
        return NUM_ROWS;
    }
    
    public int numCols()
    {
        return NUM_COLS;
    }
    
    public void printShips()
    {
        System.out.println("  1 2 3 4 5 6 7 8 9 10 ");
        for(int i = 0; i < NUM_ROWS; i++)
        {
            System.out.print(ROW_NAMES[i] + " ");
            for(int j = 0; j < NUM_COLS; j++)
            {
                if(hasShip(i,j))
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    
    public void printStatus() 
    {
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
        System.out.print("");
        for (int i = 0; i < NUM_COLS; i++) 
        {
            if (i != 9) 
            {
            System.out.print((i + 1) + " ");
            }
            else
            {
                System.out.print(i + 1);
            }
        }    
        System.out.println("");
    
        for (int i = 0; i < NUM_ROWS; i++) 
        {
            System.out.print(alpha[i] + " ");
            for (int j = 0; j < NUM_COLS; j++) 
            {
                if (grid[i][j].checkHit()) 
                {
                    System.out.print("X ");
                }
                else if (grid[i][j].checkMiss()) 
                {
                    System.out.print("O ");
                }
                else 
                {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }
    
    public void addShip(Ship s) 
    {
        int length = s.getLength();
        int dir = s.getDirection();
        int row = s.getRow();
        int col = s.getCol();
        
        if (dir == 1) 
        {
            for (int i = row; i < (s.getLength() + row); i++) 
            {
                setShip(i, col, true);
            }
        }
        else 
        {
            for (int j = col; j < (s.getLength() + col); j++) 
            {
                setShip(row, j, true);
            }
        }
    }
}
