public class Dog {
    private String name;
    private String owner;
    private boolean isHungry;
    private String [] offSpring;

    public Dog(String name, boolean isHungry)
    {
        this.name = name;
        this.owner = owner;
        this.isHungry = true;
        offSpring = new String[1];
    }

    public String feedDog()
    {
        if(isHungry)
        {
            isHungry = false;
            return "Munch Munch";


        } else {
            return "Sorry, " + this.name + " is not hungry.";
        }
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public String getOwner()
    {
        return this.owner;
    }

    public void setOffSpring(String name, int number)
    {
        offSpring[number] = name;

    }

    public String[] getOffSpring()
    {
        return offSpring;
    }



}
