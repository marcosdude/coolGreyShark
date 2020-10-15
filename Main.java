import java.util.Scanner;

public class Main {

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);//delacring an object

    System.out.println("What is the current wind speed in MPH?");
    int wind = scan.nextInt(); // asking user for an MPH

    String sharkName = "Advan";
    int sharkWidth = 4;
    int sharkHeight = 4;
    int sharkLength = 15;
    String color = "grey";
    String sharkDiet = "vegan";
    String sharkPersonality = "cool";
    boolean sharkSeesFish = true;
    boolean weatherConditionsAreGood = true;
    // attributes, shark characteristics, and other variables

    if (wind < 7 && weatherConditionsAreGood) {
      System.out.println("Advan will swim 10 feet underwater because the surface won't be choppy.");
    } else if (wind > 7) {
      System.out.println("Advan will swim 30 feet underwater because the surface will be choppy.");
    }
  }
}