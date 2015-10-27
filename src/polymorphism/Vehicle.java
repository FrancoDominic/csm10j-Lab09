
package polymorphism;

public abstract class Vehicle
{
    private boolean on;
    
    public void Start()
    {
        System.out.println("Starting vehicle");
        on = true;
    }
    
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


