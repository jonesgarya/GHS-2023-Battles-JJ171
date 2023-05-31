public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    private boolean shipHere = false;
    private int status = UNGUESSED;
    
    public boolean checkHit()
    {
        if(status == HIT)
        {
            return true;
        }
        return false;
    }
    
    public boolean checkMiss()
    {
        if(status == MISSED)
        {
            return true;
        }
        return false;
    }
    
    public boolean isUnguessed()
    {
        if(status == UNGUESSED)
        {
            return true;
        }
        return false;
    }
    
    public void markHit()
    {
        status = HIT;
    }
    
    public void markMiss()
    {
        status = MISSED;
    }
    
    public boolean hasShip()
    {
        return shipHere;
    }
    
    public void setShip(boolean val)
    {
        shipHere = val;
    }
    
    public void setStatus(int TheStatus)
    {
        status = TheStatus;
    }
    
    public int getStatus()
    {
        return status;
    }
}
