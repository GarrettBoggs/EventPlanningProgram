import java.io.Console;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Random randomGenerator = new Random();
    boolean isChips, isDrinks, willNotExit;
    String randomChoice = "", inputBand = "";
    int inputGuests = 0;

    do {
      inputBand = "";
      while(!(randomChoice.equals("pick")) && !(randomChoice.equals("random")))
      {
        System.out.println("Do you want to pick your preferences? Or do you want to randomize? Enter either: pick or random)");
        randomChoice = console.readLine();
        System.out.println(randomChoice);
      }

      if(randomChoice.equals("pick")) {
        System.out.println("Enter in the number of guests!");
        inputGuests = Integer.parseInt(console.readLine());

        System.out.println("Do you want to buy Chips? y or n?");
        if(console.readLine().toLowerCase().equals("y"))
          isChips = true;
        else
          isChips = false;

        System.out.println("Do you want to by Drinks? y or n?");
        if(console.readLine().toLowerCase().equals("y"))
          isDrinks = true;
        else
          isDrinks = false;

      while(!(inputBand.equals("pros")) && !(inputBand.equals("kids")) && !(inputBand.equals("me")))
        {
          System.out.println("For music, do you want to hire professionals, high school kids, or just go for it yourself? Type any of the following: pros, kids, me");
          inputBand = console.readLine();
        }
      }
      else {
        inputGuests = randomGenerator.nextInt(100);
        isChips = randomGenerator.nextBoolean();
        isDrinks = randomGenerator.nextBoolean();
        int bandPick = randomGenerator.nextInt(3);
        if(bandPick == 0)
          inputBand = "pros";
        else if(bandPick == 1)
          inputBand = "kids";
        else
          inputBand = "me";
      }

      Event theParty = new Event(isChips,isDrinks,inputGuests,inputBand);

      System.out.println("You invited " + theParty.getPeople() + " people which will cost you one dollar per person. The total cost is $" + theParty.getPeople());
      if(theParty.getChips())
        System.out.println("Your chips will cost: $5");
      else
        System.out.println("You did not buy chips!");

      if(theParty.getDrinks())
        System.out.println("Your drinks will cost: $10");
      else
        System.out.println("You did not buy drinks!");

      if(theParty.getBand().equals("pros")) {
        System.out.println("You decided to hire the pros! That move costed you $40!");
      }
      else if(theParty.getBand().equals("kids")) {
        System.out.println("You decided to hire the kids! That move costed you $10!");
      }
      else {
        System.out.println("You are the performer! That takes some guts! But you saved money!");
      }
      System.out.println("Your party is going to cost: $" + theParty.getCost());
      System.out.println("Is this price ok with you? Type yes to confirm! Any other input will allow you to change party options.");
      if(console.readLine().toLowerCase().equals("yes"))
        willNotExit = false;
      else
        willNotExit = true;
    } while(willNotExit);
    System.out.println("Enjoy the party!!!");
  }
}
