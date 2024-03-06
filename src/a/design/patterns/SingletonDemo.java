package a.design.patterns;

public class SingletonDemo {

    public static void main(String[] args) {

        // Getting Singleton instance
        Singleton firstInstance = Singleton.getInstance();

        // Use Singleton Instance to call methods or access fields
        // For Demo, print instance to see its hashcode
        System.out.println("Singleton instance hashcode" + firstInstance.hashCode());

        // Attempt to get another instance to demonstrate it is the same instance
        Singleton secondInstance = Singleton.getInstance();
        System.out.println("Attempt to get secondInstance hashcode: " + secondInstance.hashCode());

        // Comparing both instances to confirm they are the same
        if (firstInstance == secondInstance) {
            System.out.println("Both instances are same .. !");
        } else {
            System.out.println("Both instances are not same");
        }
    }
}

/**
 * Singleton Pattern: To create only one instance of the object
 * private constructor and static synchronized accessor method
 */
class Singleton {
    // static variable that holds one and only instance
    private static Singleton instance;
    // private constructor so that no other class can instantiate it
    private Singleton() {}

    // static method to create only one instance
    // synchronized accessor method to ensure only one thread can access at a time
    // An optimization over synchronizing the entire method is to use double-checked locking.
    // It minimizes the performance impact by only synchronizing the critical section of the code.
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }



}
