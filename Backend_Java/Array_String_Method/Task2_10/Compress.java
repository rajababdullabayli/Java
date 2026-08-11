package Task2_10;

public class Compress {
    public String compress(String text) {

        int countChar = 1;
        String newText = "";
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                countChar++;
            }
            else {
                newText += text.charAt(i)+""+countChar;
                countChar = 1;
            }
        }

        newText += text.charAt(text.length()-1)+""+countChar;

        if (text.length()>=newText.length()) {
            return newText;
        }
        else {
            return text;
        }
    }
}
