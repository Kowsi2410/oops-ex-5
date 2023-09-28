
package mainpackage;


import mypackage.MyClass;
import subpackage.SubClass;

public class Mainpackage {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        SubClass subObject = new SubClass();
        
        // Access protected property and method from MyClass through SubClass
        subObject.accessProtectedPropertyAndMethod();
        
        // Attempt to access default property and method from MyClass (this will result in a compilation error)
        // int value = myObject.defaultProperty; // Uncommenting this line will cause an error
        // myObject.defaultMethod(); // Uncommenting this line will cause an error
    }
}
