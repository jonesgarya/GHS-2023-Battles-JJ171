public class Ship
{
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    private int row = UNSET;
    private int col = UNSET;
    private int length = UNSET;
    private int direction = UNSET;
    
    public boolean isLocationSet()
    {
        if(row == UNSET || col == UNSET)
        {
            return false;
        }
        return true;
    }
    
    public boolean isDirectionSet()
    {
        if(direction == UNSET)
        {
            return false;
        }
        return true;
    }
    
    public void setLocation(int r, int c)
    {
        row = r;
        col = c;
    }
    
    public void setDirection(int d)
    {
        direction = d;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getCol()
    {
        return col;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
    private String directionToString()
    {
        if(direction == HORIZONTAL)
        {
            return "horizontal";
        }
        if(direction == VERTICAL)
        {
            return "vertical";
        }
        return "unset direction";
    }
    
    private String locationToString()
    {
        if(isDirectionSet())
        {
            return "(" + row + ", " + col + ")";
        }
        return "(unset location)";
    }
    
    public String toString()
    {
        return directionToString() + " ship of length " + length + " at " + "(" + locationToString() + ")";
    }
}
