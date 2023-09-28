
package pack1.pack2.pack3;
public class Calculator {
    public int multiply(int a, int b)
    {
        return a*b;
    }
    public float divide(int a, int b)
    {
        try
        {  
            if(b==0)
                throw new DividedByZeroException("Cannot dvided by zero");
            else
            {
            float c = (float)a/(float)b;
            return c;
            }
        }
        catch(DividedByZeroException e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
class DividedByZeroException extends Exception
{
    DividedByZeroException(String msg)
    {  
        super(msg);
    }  
}


