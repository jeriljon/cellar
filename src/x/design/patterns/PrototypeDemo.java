package x.design.patterns;

/**
 * Prototype Design pattern is used when the creation of an object directly is costly or complex, for example, when it requires a lot of resources or time, like an object that comes from a database or API, or when it requires a significant amount of data to be initialized.
 * Instead of creating a new instance of an object, the prototype pattern copies or clones an existing instance, which acts as a prototype.
 * This pattern uses a prototypical instance, which is cloned to produce new objects.
 * The pattern is implemented by a clone() method, which is part of the Cloneable interface in Java, making the actual cloning process standard and consistent across classes.
 */

public class PrototypeDemo {
    public static void main(String[] args) {
        Car originalCar = new Car("Ford", "Mustang");
        Car clonedCar = null;

        try {
            // Cloning the originalCar
            clonedCar = (Car) originalCar.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(originalCar); // Outputs: Car [make=Ford, model=Mustang]
        System.out.println(clonedCar);   // Outputs: Car [make=Ford, model=Mustang]

        // Modifying the clone's properties does not affect the original
        if (clonedCar != null) {
            clonedCar.setMake("Chevrolet");
            clonedCar.setModel("Camaro");
        }

        System.out.println(originalCar); // Outputs: Car [make=Ford, model=Mustang]
        System.out.println(clonedCar);   // Outputs: Car [make=Chevrolet, model=Camaro]
    }
}

// Making this class cloneable by implementing the Cloneable interface
class Car implements Cloneable {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Implementing the clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + "]";
    }
}

