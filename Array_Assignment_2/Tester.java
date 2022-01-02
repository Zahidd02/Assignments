package Array_Assignment_2;

public class Tester {
    public static double[] findDetails(double[] salary) {
        double sum = 0;
        double average = 0;
        int counterGreaterThan = 0;
        int counterLesserThan = 0;
        double[] tempDetails = new double[3];
        for(int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        average = sum/salary.length;

        for(int i = 0; i < salary.length; i++) {
            if(salary[i] > average)
                counterGreaterThan++;

            else if(salary[i] < average)
            counterLesserThan++;
        }

        tempDetails[0] = average;
        tempDetails[1] = counterGreaterThan;
        tempDetails[2] = counterLesserThan;
        return tempDetails;
    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
