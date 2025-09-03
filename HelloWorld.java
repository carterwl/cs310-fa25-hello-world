/**

 * 
 * @author Carter Leary
 */
public class HelloWorld {

    public static void main(String[] args) {
        // Create objects
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        // Print hello
        System.out.println("Hello, World!");

        // Call some methods from Class1 and Class2
        c1.f1();
        c1.f2();
        c2.f1();
        c2.f3();

        // Call HelloWorld’s own method
        new HelloWorld().f1();
    }

    public void f1() {
        System.out.println("HelloWorld → f1() method running");
    }
}
