package Exercise;

public class Third {
    //A simple code to print the amount of the letters and the words in a given string

    public static void main(String[] args) {
        String a = "Where I'm from there is no sun, our hometown is in the dark";
        int sumOfTheLetters = a.replaceAll("[^a-zA-Z]","").length();
        int totalWords = a.trim().split(" ").length;
        System.out.println("Total words = "+totalWords);
        System.out.println("Total letters = "+sumOfTheLetters);
    }
}
