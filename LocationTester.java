public class LocationTester extends ConsoleProgram
{
    public void run()
    {
    // This code tests the methods of the Location class
    
    Location loc = new Location();
    
    // Unguessed
    System.out.println("UNGUESSED LOCATION");
    System.out.println("Hit? " + loc.checkHit());
    System.out.println("Miss? " + loc.checkMiss());
    System.out.println("Unguessed? " + loc.isUnguessed());
    System.out.println("Ship? " + loc.hasShip());
    System.out.println("Status: " + loc.getStatus());
    System.out.println();
    
    // Miss
    loc.markMiss();
    System.out.println("MISSED LOCATION");
    System.out.println("Hit? " + loc.checkHit());
    System.out.println("Miss? " + loc.checkMiss());
    System.out.println("Unguessed? " + loc.isUnguessed());
    System.out.println("Ship? " + loc.hasShip());
    System.out.println("Status: " + loc.getStatus());
    System.out.println();
    
    // Hit with ship
    Location hit = new Location();
    hit.markHit();
    }
}
