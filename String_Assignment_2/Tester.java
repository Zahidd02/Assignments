package String_Assignment_2;

public class Tester {
    public static boolean checkPalindrome(String str){
        String reverse = "";

        for(int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse))
        return true;
        else
        return false;
	}
	
	public static void main(String args[]){
		String str = "Malayalam";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}   
}
