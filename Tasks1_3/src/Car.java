public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    Driver driver;


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }



    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }


    @Override
    public String toString() {
        return "Car{" +
                "make: " + make + '\'' +
                ".model: " + model +"("+year+

                "), bodyStyle: " + bodyStyle;
    }
}

