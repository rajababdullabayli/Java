package Task2_12;

public class ReverseEachWords {
    public String reverseEachWord(String sentence) {

        String newSentence="";

        for (String word : sentence.split(" ")) {
            int wordCharCount = 0;
            String newWord = "";
            while (wordCharCount != word.length()) {
                newWord = word.charAt(wordCharCount)+newWord;
                wordCharCount++;
            }
            newSentence += newWord+" ";
        }
        return newSentence;
    }
}
