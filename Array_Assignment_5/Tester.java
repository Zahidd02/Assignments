package Array_Assignment_5;

public class Tester {
    public static int increment = 0; 
    public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		
        if(num1 < num2) {
            for(int i = num1; i <= num2; i++){
                int temp = i;
                int sum = 0;
                while(temp > 0){
                    sum += temp % 10;
                    temp /= 10;
                }
                if(i % 5 == 0 && sum % 3 == 0) {
                    numbers[increment] = i;
                    increment++;
                    if(increment == 6)
					break;
                }
            }
        }
	    return numbers;
	}

	public static void main(String[] args) {
		int num1 = -10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
