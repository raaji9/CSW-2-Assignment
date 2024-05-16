package Assignment3;

import java.util.Hashtable;
import java.util.Map;

public class q10MostOccurringWords {
    public static void main(String[] args) {
        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        String[] words = inputString.toLowerCase().split("\\s+");

        Hashtable<String, Integer> wordFrequency = new Hashtable<>();

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
            }
        }
        
        System.out.println("Most Occurring Words:");

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + " - Frequency: " + entry.getValue());
            }
        }
    }
}
