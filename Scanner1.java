import java.util.Scanner
// this imports the Scanner class

public class Scanner1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);/*now i can easily refer to the scanner; it will scan any user input*/
    //conversation part
    System.out.println("Hello, what's ur name?");
    String name1 = scanner.nextLine(); /*this makes a new variable which will be a string of a user input, meaning if you write a integer an error would occur*/
    System.out.println("What is ur favorite food?");
    String food1 = scanner.nextLine();
    System.out.println("What's ur favorite hobby?");
    String hobby1 = scanner.nextLine();
    System.out.println("What is your rating on this bot(plz trolling)");
    int rating1 = scanner.nextInt();
    //bot response altogether
    System.out.println("Hello " + name + ", your favorite food's " + food1 + ", your favor hobby is " + hobby1 + ", and you rate this bot: " + rating1 + " star/s");
  }
}
ashaz does this work tho
