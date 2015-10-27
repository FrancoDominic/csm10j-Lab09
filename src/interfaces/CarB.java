
package interfaces;

public class CarB implements Drivable 
{
    private boolean on;
    
    @Override
    public void Start()
    {
        System.out.println("Starting vehicle");
        on = true;
    }

    @Override
    public void Drive()
    {
        if (on)
        {
            System.out.println("Driving vehicle");
        }
        
        else if (!on)
        {
            System.out.println("Start the vehicle first");
        }
    }
}
