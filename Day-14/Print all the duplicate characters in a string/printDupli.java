import java.util.*;

public class printDupli {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        printDuplicateCharacters(S);
    }

    public static void printDuplicateCharacters(String S) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : S.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }
    }
}