package car.example.autowireByConstructor;

public class Car {
    private Specification specification;

    //Need to have a constructor to use autowire by constructor
    public Car(Specification specification) {
        this.specification = specification;
    }

    //    public void setSpecification(Specification specification) {
//        this.specification = specification;
//    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
