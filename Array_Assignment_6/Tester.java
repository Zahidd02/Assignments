package Array_Assignment_6;

public class Tester {   
    public static int findTotalCount(int[] numbers) {
		int counter = 0;
        for(int i = 0; i < numbers.length-1; i++)
        if(numbers[i+1] == numbers[i]) {
            counter++;
        }
        return counter;
	}

	public static void main(String[] args) {
		int[] numbers = { 5,6,6,6,12,1,1,0,0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	} 
}
