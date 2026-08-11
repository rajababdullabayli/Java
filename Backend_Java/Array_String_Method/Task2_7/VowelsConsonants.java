package Task2_7;

public class VowelsConsonants {
    public void countVowelsConsonants(String str){
        String vowels = "a,e,i,o,u";
        String consonants ="b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z";
        int vowelsCount = 0;
        int consonantsCount = 0;
        for(char ch : str.toCharArray()){
            if (vowels.indexOf(ch) != -1){
                vowelsCount++;
            }
            else if(consonants.indexOf(ch) != -1){
                consonantsCount++;
            }
        }
        System.out.println("Vowels: "+vowelsCount);
        System.out.println("Consonants: "+consonantsCount);
    }
}
