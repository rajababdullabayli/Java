package Task2_21;

public class CeaserEncode {
    public String caesarEncode(String text, int shift) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String newText = "";

        for (char ch : text.toCharArray()){
            int capIdx = capitalLetters.indexOf(ch);
            int lowIdx = lowerLetters.indexOf(ch);
            if(capIdx != -1) {
                newText+=capitalLetters.charAt(shift+capIdx);
            }else if(lowIdx != -1){
                newText+=lowerLetters.charAt(shift+lowIdx);
            }
        }
        return newText ;
    }
}
