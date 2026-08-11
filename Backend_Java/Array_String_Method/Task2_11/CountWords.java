package Task2_11;

public class CountWords {
    public int countWords(String sentence){
        int countWord = 0;
        for(String word : sentence.split(" ")){
            if(!word.equals("")){
                countWord++;
            }
        }
        return countWord;
    }
}
