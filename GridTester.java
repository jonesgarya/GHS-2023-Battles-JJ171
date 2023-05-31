public class GridTester extends ConsoleProgram
{
    public void run()
    {
        Grid grid1 = new Grid();
        grid1.printStatus();
        
        grid1.markMiss(0,0);
        grid1.markMiss(1,1);
        grid1.markMiss(2,2);
        grid1.markMiss(7,7);
        grid1.markMiss(8,8);
        grid1.markMiss(9,9);
        grid1.markHit(1,8);
        grid1.markHit(2,8);
        
        grid1.printStatus();
    }
}
