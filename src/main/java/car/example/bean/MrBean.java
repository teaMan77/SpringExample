package car.example.bean;

public class MrBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "MrBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
