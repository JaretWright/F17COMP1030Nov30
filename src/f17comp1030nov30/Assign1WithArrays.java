package f17comp1030nov30;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Assign1WithArrays {
    public static void main(String[] args)
    {
        int numOfCourses;
        Scanner kb = new Scanner(System.in);
        
        do{
            System.out.print("How many courses will be entered: ");
            numOfCourses = kb.nextInt();
        } while (numOfCourses < 1);
        
        //old way to store the grades
        int grade1, grade2, grade3, grade4, grade5;
        
        //new, improved and super cool way of storing grades
        int[] grades = new int[numOfCourses];
        
        for (int i = 0; i<grades.length; i++)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Enter the grade for course %d: ", i+1);
            grades[i] = keyboard.nextInt();
        }
        
        displayGrades(grades);
        double avg = getAverage(grades);
        System.out.printf("The average grade is %.1f%%, which is a letter grade of"
                + " %s %n", avg, getLetterGrade(avg));
    }
    
    public static void displayGrades(int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            System.out.printf("The grade in course %d was %d, which is "
                    + "a letter grade of %s%n", i+1, array[i], getLetterGrade(array[i]));
        }
    }
    
    public static String getLetterGrade(double grade)
    {
        if (grade >=80)
            return "A";
        else if (grade >=70)
            return "B";
        else if (grade >=60)
            return "C";
        else if (grade >=50)
            return "D";
        else
            return "F";
    }
    
    public static double getAverage(int[] array)
    {
        double total=0;
        for (int i=0; i<array.length; i++)
        {
            total = total + array[i];
        }
        return total/array.length;
    }
}
