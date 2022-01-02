package String_Exercise_1;

public class Tester {
    public static String removeWhiteSpaces(String str){
		String x = str.replaceAll(" ", "");
        return x;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
    
}
