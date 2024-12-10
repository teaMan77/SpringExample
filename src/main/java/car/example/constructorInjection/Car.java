package car.example.constructorInjection;

public class Car {
    private Specification specification;

    //This is where the constructor injection happens
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
