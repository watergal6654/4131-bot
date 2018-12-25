public class contactInfo {

   public static String person(String name) {
  //    return name;

      if (name.equalsIgnoreCase(" doug")) {
         return ("2532981710");
      } else if (name.equalsIgnoreCase(" helen")) {
         return ("2067340015");
      } else if (name.equalsIgnoreCase(" rob")) {
         return ("6613416174");
      } else if (name.equalsIgnoreCase(" eileen")) {
         return ("6612257465");
      } else {
         return ("Sorry, I don't have this person's number in my code yet, dm me!");
      }
   }
}


/* some pseudocode and planning
have a method called like getinfo or something which is a command you can use
and then find the word after that and see if it matches a word in my array
of contacts, and if it does then return the value of that array... is that how this works??
 */
