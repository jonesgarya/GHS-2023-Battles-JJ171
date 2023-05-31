public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private static final int NUM_OF_SHIPS = 5;
    private Ship[] ships;
    private Grid own;
    private Grid enemy;
    
    public Player()
    {
        own = new Grid();
        enemy = new Grid();
        ships = new Ship[NUM_OF_SHIPS];
        for(int i = 0; i < NUM_OF_SHIPS; i++)
        {
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
    }
    
    public void printMyShips()
    {
        own.printShips();
    }
    
    public void printOpponentGuesses()
    {
        enemy.printStatus();
    }
    
    public void printMyGuesses()
    {
        own.printStatus();
    }
    
    
    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        s.setLocation(row, col);
        s.setDirection(direction);
        own.addShip(s);
    }
    
    public void recordOpponentGuesses(int row, int col)
    {
        if(own.hasShip(row, col))
        {
            enemy.markHit(row, col);
        }
        
        else
        {
            enemy.markMiss(row, col);
        }
    }
}
