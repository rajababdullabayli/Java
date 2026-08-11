package Task2_8;

public class RemoveSpaces {
    public String removeSpaces(String text){
        String newText ="";
        for (char ch : text.trim().toCharArray()){
            if(ch != ' '){
                newText+=ch;
            }
        }
        return newText;
    }
}
