package Task2_9;

public class Numeric {
    public boolean isNumeric(String text) {
        int numericCount = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                numericCount++;
            }
        }
        if (numericCount == text.length()){
            return true;

        }
        else {
            return false;
        }
    }
}
