package quiz1;

import java.util.Scanner;

public class Football {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter passing attempts:");
		double Att = input.nextDouble();
		
		System.out.println("Enter percentage of completions:");
		double Comp = input.nextDouble();
		
		System.out.println("Enter number of yards:");
		int Yds = input.nextInt();
		
		System.out.println("Enter number of touchdown passes:");
		int TD = input.nextInt();
		
		System.out.println("Enter number of interceptions:");
		int INT = input.nextInt();
	
	double a = (((Comp/Att) - .3)*5);
		if (a > 2.375){
	      a = 2.375;
	    }
	    else if(a < 0){
	      a = 0;
	    }	
	double b = (((Yds/Att)-3)*.25);
		if (b > 2.375){
	      b = 2.375;
	    }
	    else if(b < 0){
	      b = 0;
	    }	
	double c = ((TD/Att)*20);
		if (c > 2.375){
	      c = 2.375;
	    }
	    else if(c < 0){
	      c = 0;
	    }	
	double d = 2.375 - ((INT/Att)*25);
		if (d > 2.375){
	      d = 2.375;
	    }
	    else if(d < 0){
	      d = 0;
	    }	
	
	double Passer_Rating = ((a+b+c+d)/6)*100; 
		
		System.out.println(Passer_Rating);
		
	}
}