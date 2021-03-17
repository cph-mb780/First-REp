public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("VW", "Touran", 2019, "Minibus");
        Driver driver1 = new Driver("Mads", 41);

        car1.setDriver(driver1);
        System.out.println(car1.toString());
        System.out.println(car1.getDriver().toString());

        Car car2 = new Car("Ford", "S-Max", 2011, "miniSUV");
        car2.setDriver(driver1);
        System.out.println(car2.toString());
        System.out.println(car2.getDriver().toString());


    }
}
