package Assignment3;
import java.util.*;

public class q12MostOccurringWords {
	public static void main(String[] args) {
		String inputString = "This is a test string to test the functionality of the algorithm. Test strings are useful for testing purposes.";
        List<String> mostOccurringWords = findMostOccurringWords(inputString);
        System.out.println("Most occurring word(s): " + mostOccurringWords);
    }

    public static List<String> findMostOccurringWords(String inputString) {
        Map<String, Integer> wordFreq = new HashMap<>();

        String[] words = inputString.split("\\s+");

        for (String word : words) {
            if (!wordFreq.containsKey(word)) {
                wordFreq.put(word, 1);
            }
            else {
                wordFreq.put(word, wordFreq.get(word) + 1);
            }
        }

        int maxFrequency = 0;
        List<String> mostOccurringWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            int frequency = entry.getValue();
            String word = entry.getKey();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostOccurringWords.clear();
                mostOccurringWords.add(word);
            }
            else if (frequency == maxFrequency) {
                mostOccurringWords.add(word);
            }
        }

        return mostOccurringWords;
    }
}