import java.util.Scanner;

public class WordCounter {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter a sentence: ");
 String input = sc.nextLine();
 
 int wordCount = countWords(input);
 
 System.out.println("Number of words: " + wordCount);
  sc.close();
 }
  public static int countWords(String input) {
 String[] words = input.split("\\s+");
 return words.length;
 }
}