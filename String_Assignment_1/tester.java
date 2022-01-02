package String_Assignment_1;

public class tester {
    public static String moveSpecialCharacters(String str){
		String regex = "[a-z 0-9 A-Z]";
		String x = "";
		String y = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.valueOf(str.charAt(i)).matches(regex))
			x += str.charAt(i);
			else
			y += str.charAt(i);
		}
        return y + x;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
		//String str2 = "zAhId";
	    System.out.println(moveSpecialCharacters(str));
	} 
}
