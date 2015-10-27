
package polymorphism;

public class ConvertibleA extends CarA
{
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
