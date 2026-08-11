package Task2_13;

public class FirstNonRepeatingChar {
    public char firstNonRepeatingChar(String text) {
        //swiss
        for (char ch : text.toCharArray()){
            int charCount = 0;
            int repeatingChar = 0;
            while (charCount<text.length()){
                if(ch == text.charAt(charCount)){
                    repeatingChar++;
                }
                charCount++;
            }
            if(repeatingChar == 1){
                return ch;
            }
        }
        return '-';
    }
}
