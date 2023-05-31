public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    private boolean shipStatus;
    private int status;
    
    public Location()
    {
        shipStatus = false;
        status = UNGUESSED;
    }
    
    public boolean checkHit()
    {
        return status == HIT;
    }
    
    public boolean checkMiss()
    {
        return status == MISSED;
    }
    
    public boolean isUnguessed()
    {
        return status == UNGUESSED;
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
        return shipStatus;
    }
    
    public void setShip(boolean val)
    {
        shipStatus = val;
    }
    
    public void setStatus(int status)
    {
        if(status == UNGUESSED || status == HIT || status ==MISSED)
        {
            this.status = status;
        }
    }
    
    public int getStatus()
    {
        return status;
    }
}
