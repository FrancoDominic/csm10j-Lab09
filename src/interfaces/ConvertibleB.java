
package interfaces;

public class ConvertibleB implements Drivable
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
    
    private boolean up = true;
    
    public void PutTopUp()
    {
        if (!up)
        {
            System.out.println("Putting top up");
            up = true;
        }
        
        else if (up)
        {
            System.out.println("Top is already up");
        }
    }
    
    public void PutTopDown()
    {
        if (up)
        {
            System.out.println("Putting top down");
            up = false;
        }
        
        else if (!up)
        {
            System.out.println("Top is already down");
        }
    }
}
