

import java.util.ArrayList;


class DrinksMenu{


  public static void main(String[] args) {




   /*
   Vi beder om brugerens alder
   */

      TextUI ui = new TextUI();
     int age = ui.promptNumeric("Hvor gammel er du?");



    /*
    Vi vil nu sammensætte en drinksmenu der afhænger af brugerens alder
    Vi placerer valgmulighederne i en liste - så kan den genbruges et andet sted i systemet.
    */


      ArrayList<String> options = new ArrayList<>();

      if (age >= 18) {
          options.add("Gin&Tonic");
          options.add("Martini");
          options.add("Gin&Hass");

      } else {
          options.add("Milk");
          options.add("Juice");
          options.add("Saftevand");

      }
      options.add("vand");


    /*
     Vi viser listen til brugeren
     */

      ui.displayList(options, "MENU: ", true);

    /*
    Vi spørger om antal af drinks, så vi ved mange gange vi skal prompte i while loopet længere nede.
    Hvert valg placerer vi i en liste, så vi kan udskrive bestillingen til sidst.
    */

      // TODO 4: anvend TextUI's promptNumeric metode, i stedet for disse to linjer

      int numberOfDrinks = ui.promptNumeric("Hvor mange drinks vil du bestille?") ;  //Give brugere et sted at placere sit svar og vente på svaret



      //TODO 5: Reducer 6 linjer til 1 linje ved at anvende TextUI metoden promptChoice() i stedet for
      ArrayList<String> choices = ui.promptChoice(options, numberOfDrinks, "tast et tal for at vælge");



      /*
      Vi viser brugerens bestilling
      */
      //TODO 6: Genbrug TextUI metoden displayList(choices) i stedet for

      ui.displayList(choices, "Du har bestilt flg.:", false);



      // todo: Validering af at det der er blevet lagt ind i choices rent faktisk findes i menuen - som det er nu kan man bestille hvad somhelst.


  }

}