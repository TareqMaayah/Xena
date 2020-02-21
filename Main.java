import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   // The following is for testing purposes
        System.out.println("............ String Analyzer ............");
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userString = userInput.nextLine();  // Read user input
        StringAnalyzer MyStringAnalyzer = new StringAnalyzer(userString);
        MyStringAnalyzer.spitTheUpperCaseLetters();
        MyStringAnalyzer.spitEverySecondLetter();
        MyStringAnalyzer.spitTheStringReplacingVowelsWithUnderscore();
        MyStringAnalyzer.countTheNumberOfVowels();
        MyStringAnalyzer.showPositionsOfAllVowels();
  }
}