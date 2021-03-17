public class Driver {


    private String name;
    private int age;

    Driver (String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
    @Override
    public String toString() {
        return "is driven by "+ name;
    }
}
