package car.example.autowireByName;

public class Specification {
    private String company;
    private String model;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
