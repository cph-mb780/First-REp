public class Person implements Human{

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}
