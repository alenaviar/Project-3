/* Homework 9 by Aaron Mills
	To calculate Grades */


// Preprocessor directive
import java.io.*;
         
public class DriverHW9
{

public static void main(String [] args) throws IOException
	{
		HW9 app;
		app = new HW9();
		app.appMain();
	}
}  // end class DriverHW9 
         
class HW9 
{
 		BufferedReader stdin;        

		// Instance (global) data declarations 
        //  Outputs
		float stuId;		// Student Identification Number
		float totStud;		// Number of students enrolled
		float totHrs;		// Sum of hours completed by all student
		float highGpa;		// Highest GPA obtained in term
		double highId; 		// ID of student with highest GPA
		float avgHrs;		// Number of hours / Number of students
        //  Inputs
        String numString;
		String term;	 	// semester student is enrolled in
		String id; 		// ID code representing each individual student
		Float gpa; 		// individual grade point average for each student
		Float hrs;		// hours completed by each student
       //   Working Storage
		int count; 		// student counter
		Float totGpa;		//total hours completed divided by total students

	void appMain() throws IOException
	{
				stdin = new BufferedReader (new InputStreamReader (System.in));
		outHeader();	
		reportInit();
		processstudent();
		calcAvg();
		reportout();
	}
	void outHeader()
	{
		System.out.println( "***************************");
		System.out.println("Homework 9");
		System.out.println("by Aaron");
		System.out.println("End program by inputting -1 as student ID");
		System.out.println("***************************");
	}
	void initMain() 
	{
		count = 0;
		totStud = 0;
		totHrs = 0;
		highGpa = 0;
		highId = 0;
	}

	void reportInit()
	{
		totStud = totHrs = highGpa = 0;
	}

	 void processstudent() throws IOException
	 {
	 	while (stuId != -1)
	 	{
		System.out.println("\n Enter Term:");
		term = stdin.readLine();
	
		System.out.println("\nEnter the student ID code:");
		numString = stdin.readLine();
		stuId = Integer.parseInt(numString);
	
		System.out.println("\nEnter the student’s GPA: ");
		numString = stdin.readLine();
		gpa = Float.parseFloat(numString);

		System.out.println("\nEnter hours completed by student:");
		numString = stdin.readLine();
		hrs = Float.parseFloat(numString);
		
		updateCtrsAccums();
		stuDataOut();
		updatehiGpa();
		}
	}
	void updateCtrsAccums()
		{
			totStud = totStud +1;
			totHrs = totHrs + hrs;
		

		}

	void updatehiGpa()
		{ 
			if (gpa > highGpa)
			highGpa = gpa;
			highId = stuId;
		}
	
	void stuDataOut()
	{
		System.out.println(" Student ID" + stuId);
		System.out.println("Student Updated GPA is" + gpa + "and updated hours complete are" + hrs + ".");
	}
		void calcAvg()
		{
	 	avgHrs = (totHrs) / (totStud);
		}	
		void reportout()
		{
		System.out.println("\nThe term is " + term);
		System.out.println(("\nTotal student hours = " + totHrs));
		System.out.println("\nThe high GPA is" + highGpa + "   Obtained by " + highId);
		System.out.println("\nThe average hours for the term is " + avgHrs);
	}
}



