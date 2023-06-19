package HW11;

import java.util.HashMap;

public class HW11SecondTAsk {
    public static void main(String[] args) {

        String text = "The weather is warm today but tomorrow the weather will change";
        String[] words = text.split("\\s+");

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        calculateFrequency(words, uniqueWords);
        printUniqueWords(uniqueWords);

    }

    public static void calculateFrequency(String[] words, HashMap<String, Integer> uniqueWords) {
        for (String word : words) {
            if (uniqueWords.containsKey(word)) {
                int frequency = uniqueWords.get(word);
                uniqueWords.put(word, frequency + 1);
            } else {
                uniqueWords.put(word, 1);
            }
        }
    }

    public static void printUniqueWords(HashMap<String, Integer> uniqueWords) {
        for (Object word : uniqueWords.keySet()) {
            int frequency = uniqueWords.get(word);
            System.out.println(word + ": " + frequency);
        }
    }
}
