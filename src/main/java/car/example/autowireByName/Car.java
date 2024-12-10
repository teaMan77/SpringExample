package car.example.autowireByName;

public class Car {
    //the name of the Object here should match with the bean created for Specification class in the xml file
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
