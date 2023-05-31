public class Ship
{
    private int row;
    private int col;
    private int length;
    private int direction;
    
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int length)
    {
        this.length = length;
        this.row = UNSET;
        this.col = UNSET;
        this.direction = UNSET;
    }
    
    public boolean isLocationSet()
    {
        if(row == UNSET || col == UNSET)
        {
        return false;
        }
        else 
        {
        return true;
        }
    }
    
    public boolean isDirectionSet()
    {
        if(direction == UNSET)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public int getCol()
    {
        return this.col;
    }
    
    public int getLength()
    {
        return this.length;
    }
    
    public int getDirection()
    {
        return this.direction;
    }
    
    private String directionToString()
    {
        if(getDirection() == -1)
        {
            return "unset direction";
        }
        else if(getDirection() == 0)
        {
            return "horizontal";
        }
        else
        {
            return "vertical";
        }
    }
    
    private String locationToString()
    {
        if(getRow() == -1 || getCol() == -1)
        {
            return "unset location";
        }
        return "(" + getRow() + ", " + getCol() + ")";
    }
    
    public String toString()
    {
        return directionToString() + " ship of length " + length + " at " + "(" + locationToString() + ")";
    }
    
    
}
