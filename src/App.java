import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
    //Create some variables to define your `firstName`, `lastName`, `age`, `amount`
    // Then, print these variables.
    String firstName = "Fatmah";
    String lastName = "AlHamad";
    int age =22;
    int amount = 45;
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(age);
    System.out.println(amount);

    //Create another variable called married which it's value is either true or false.
    boolean married = false;
    System.out.println(married);

    //Use System.out.println to achieve this output in the console:
    //The amount is 20KD
    //Would you like to Deposit or Withdraw the amount?
        double amount2 = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.println("The amount is " + amount2 + "KD");
        System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

    //Create a new variable called amount of type int:
    //And achieve this output in the console: 5 plus 5 makes 10
    int amount3 = 5;
    System.out.println(amount3 + " plus " + amount3 +" makes " +(amount3+amount3));

    //Using string methods achieve this output:
    // My name is  JOHN and my last name length is 3
    String fullName = "John doe";
    System.out.println(fullName);
        String[] name = fullName.split(" ");
        String first = name[0].toUpperCase();
        String last = name[1];
        int lastNameLength = last.length();
        System.out.println("My name is " + first + " and my last name length is " + lastNameLength);

    //Using the same docs, look for a method that checks if the last name:
    // doe starts with the letter d.
    boolean startsWithD = last.startsWith("d");
    System.out.println("Last name starts with d? "+ startsWithD);
    }


}
