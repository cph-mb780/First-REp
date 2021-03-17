import java.util.Arrays;
class DogKennel {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring("woodiesnoopie", 0);
        myDog.setOffSpring("woodiesfido", 1);

        // print alle hvalpe
        String[] myOff = myDog.getOffSpring();
        for (String myD : myOff) {
            System.out.println(myD);
        }
        System.out.println(Arrays.toString(myOff));
        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);
    }
}

