public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int typableWords = 0;

        for (String word : words) {
            if (canTypeWord(word, brokenLetters)) {
                typableWords++;
            }
        }

        return typableWords;
    }

    private boolean canTypeWord(String word, String brokenLetters) {
        for (int i = 0; i < brokenLetters.length(); i++) {
            if (word.indexOf(brokenLetters.charAt(i)) != -1) {
                return false;
            }
        }
        return true;
    }
}
