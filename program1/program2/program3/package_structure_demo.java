
package package_structure_demo;
import java.util.*;
import pack1.*;
import pack1.pack2.*;
import pack1.pack2.pack3.*;
public class package_structure_demo 
{   
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        MathOperations math = new MathOperations();
        StringOperations str = new StringOperations();
        Calculator cal = new Calculator();
        System.out.print("Enter 2 integers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Addition:"+ math.add(a,b));
        System.out.println("Subtraction:"+ math.subtract(a,b));
        System.out.println("Multiplication:"+ cal.multiply(a,b));
        System.out.println("Division:"+ cal.divide(a,b));
        System.out.print("Enter 2 Strings:");
        String str1 = obj.next();
        String str2 = obj.next();
        System.out.println("Concatenation:"+ str.concatenate(str1,str2));
        System.out.println("After Reversing string1:"+ str.reverse(str1));
        System.out.println("After Reversing string2:"+ str.reverse(str2));
    }
}
