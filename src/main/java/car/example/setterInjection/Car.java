package car.example.setterInjection;

public class Car {
    private Specification specification;

    //This is where the setter injection happens
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
