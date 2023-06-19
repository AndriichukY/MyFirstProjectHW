package HW11;

import java.util.HashSet;

public class HW11FirstTask {
    public static void main(String[] args) {
        String text = "The weather is warm today but tomorrow the weather will change";
        String[] words = text.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();

        toLoverCaseMethode(words, uniqueWords);
        getUniqueWords(uniqueWords);

    }

    public static void toLoverCaseMethode(String[] words , HashSet uniqueWords) {
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            uniqueWords.add(lowercaseWord);
        }
    }

    public static void getUniqueWords(HashSet uniqueWords) {
        for (Object uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
