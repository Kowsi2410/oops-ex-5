
package mypackage;

public class MyClass {
 
    protected int protectedProperty = 42;
    int defaultProperty = 10; // Default (package-private) property

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
    
    void defaultMethod() {
        System.out.println("Default method called");
    }
}

