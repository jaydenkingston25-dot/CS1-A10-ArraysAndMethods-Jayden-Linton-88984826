import java.util.Scanner;

public class ArraysAndMethods {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 System.out.print("Enter the total number of scores: ");
        
        
        int size = input.nextInt();
        int[] scores = new int[size];
        
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        
        
        System.out.print("Scores: ");
     print(scores);
        
        
        double sum = getSum(scores);
        System.out.println("Sum: " + sum);
        
        
       double avg = getAvg(scores);
        System.out.println("Average: " + avg);
        
        
       String grade = getGradeByAVG(avg);
        System.out.println("Grade: " + grade);
        
        
         int max = findMaxGrade(scores);
        System.out.println("Highest Score: " + max);
 
        
        
        input.close();
    }

 public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    

        public static double getSum(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static double getAvg(int[] array) {
        return getSum(array) / array.length;
    }
 
    
     public static String getGradeByAVG(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    
    public static int findMaxGrade(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    
}
