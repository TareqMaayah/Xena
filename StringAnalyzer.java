import java.util.Scanner;
public class StringAnalyzer {

    public static void main(String[] args){
        // The following is for testing purposes
        System.out.println("............ String Analyzer ............");
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a string:");
        String userString = userInput.nextLine();  // Read user input
        StringAnalyzer MyStringAnalyzer = new StringAnalyzer(userString);
        MyStringAnalyzer.spitTheUpperCaseLetters();
        MyStringAnalyzer.spitEverySecondLetter();
        MyStringAnalyzer.spitTheStringReplacingVowelsWithUnderscore();
        MyStringAnalyzer.countTheNumberOfVowels();
        MyStringAnalyzer.showPositionsOfAllVowels();
    }
    // helper method - checks if passed char is a vowel. Returns "true" if yes and "false" if not
    private boolean isVowel(char checkChar){
        String vowelsString = "aeiouAEIOU";
        if("aeiouAEIOU".indexOf(checkChar) != -1){
            return true;
        }
        else return false;
    }
    
    private String TheString;
    
    public StringAnalyzer(String InputString){
        TheString = InputString;
         
    }
   
    public void spitTheUpperCaseLetters(){
        System.out.print("\nThe string \"" + TheString + "\" contains the following upper case letters: ");
        int count = 0; // This count is used to proprely place commas after eash upper case character printed or to print "None" if that is the case.
        for (int i=0; i < TheString.length(); i++){
            if(Character.isUpperCase(TheString.charAt(i))){
              if (count > 0){
                  System.out.print(",");
              }
              count++;
              System.out.print(TheString.charAt(i));
          }
        }
        if (count == 0){
            System.out.println("None.");
        }
        else{
            System.out.println("");
        }   
        return;
    }   
    
    public void spitEverySecondLetter(){
        System.out.print("\nThe following is every second letter of the string \"" + TheString + "\":");
        int count = 0; // This count is used to proprely place commas after each character printed
        for (int i=0; i < TheString.length(); i++){
          if (i%2 ==0){
              if (count > 0){
                  System.out.print(",");
              }
              count++;
              System.out.print(" " + TheString.charAt(i));
          }
        }
        System.out.println("");
        return;
     }  
    
    public void spitTheStringReplacingVowelsWithUnderscore(){
        String stringToPrint = "";
        for (int i=0; i < TheString.length(); i++){
          if (isVowel(TheString.charAt(i))){
              stringToPrint = stringToPrint + "_";
          }
          else{
              stringToPrint = stringToPrint + TheString.charAt(i);
          }
        }
        System.out.print("\nThe following is the string \"" + TheString + "\" with vowels replaced with underscore: ");
        System.out.println(stringToPrint);
        return;
     } 
    
    public void countTheNumberOfVowels(){
        System.out.print("\nFor the string \"" + TheString + "\", the number of vowels is: ");
        int counter = 0;
        for (int i=0; i < TheString.length(); i++){
          if (isVowel(TheString.charAt(i))){
              counter++;
          }
        }
        System.out.println(counter);
        return;
       }  
       
    public void showPositionsOfAllVowels(){
        System.out.println("\nFor the string \"" + TheString + "\", following are the vowels contained in the string and their respective locations starting from 0: ");
        for (int i=0; i < TheString.length(); i++){
          if (isVowel(TheString.charAt(i))){
              System.out.println("The vowel " + TheString.charAt(i) + " is at position " + i);
          }
        }
        return;
       }  
   
 
}