package String_Assignment_3;

public class Tester {
    public static String reverseEachWord(String str){
	    String[] splitStr = str.split(" ");
        String revWord = "";
        for(int i = 0; i < splitStr.length; i++){
            for(int j = splitStr[i].length()-1; j >= 0 ; j--) {
                revWord += splitStr[i].charAt(j);
            } 
            revWord += " ";
        }
        return revWord;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
	} 
}
