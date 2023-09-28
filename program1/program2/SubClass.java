
package subpackage;
import mypackage.MyClass;

public class SubClass extends MyClass {
    public void accessProtectedPropertyAndMethod() {
        // Access protected property from the superclass
        int value = protectedProperty;
        System.out.println("Protected property value: " + value);
        
        // Call protected method from the superclass
        protectedMethod();
    }

    public void accessDefaultPropertyAndMethod() {
        // Attempt to access the default property (this will result in a compilation error)
        // int value = defaultProperty; // Uncommenting this line will cause an error
        
        // Attempt to call the default method (this will result in a compilation error)
        // defaultMethod(); // Uncommenting this line will cause an error
    }
}
