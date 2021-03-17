import java.util.Scanner;

public class UI {

    private int maxDeltagere = 6;
    private int startBalance = 30000;

    public void createAccounts(){
        String input = "";
        System.out.println("Skrive navne på spillerne");
        System.out.println("Tast Q for quit");
        //int input = Integer.parseInt(getUserInput("Skriv navnet på første spiller: "));
        //for(int i = 0; i< input; i++){

       // }
    while(!input.toLowerCase().equals("q"))
    {
        input = getUserInput("Skriv navnet på første spiller: ");
        BankAccount tmp = new BankAccount(startBalance);
        Main.accounts.add(tmp);
        assignPlayer(tmp);
        if(Main.accounts.size() == maxDeltagere)
        {

        }
    }
    }
    public static void assignPlayer(BankAccount account){
        String input = getUserInput("Skriv kontoejers navn: ");
        account.setOwner(input);

    }

    public static String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
