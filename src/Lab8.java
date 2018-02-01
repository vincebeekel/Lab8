import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numAtBat = 0;
		int[] atBat = new int[numAtBat];
		int sumAtBat = 0;
		int resultAtBat;
		int slugSum = 0;
		double batAvg;
		double slugPercent;
		String yesNO;

		System.out.println("Welcome to Batting Average Calculator!");
		do {
		System.out.println("Enter number of time you were at bat:  ");
		numAtBat = scan.nextInt();

		for (int i = 0; i < numAtBat; i++) {
			System.out.println("Enter Result of At-Bat for " + (i + 1) + " at bat." 
					+ "\n Enter 0 = out, 1 = single, 2 = double, 3 = triple, 4 = homerun");
			resultAtBat = scan.nextInt();
			
			switch(resultAtBat) {
			
			case 1:
				sumAtBat += 1;
				slugSum += 1;
			break;

			case 2:
				sumAtBat += 1;
				slugSum += 2;
			break;
			
			case 3:
				sumAtBat += 1;
				slugSum += 3;
			break;
			
			case 4:
				sumAtBat += 1;
				slugSum += 4;
			break;
			
			}

		}
		
		batAvg = (double) sumAtBat /(double) numAtBat;
		slugPercent = (double) slugSum / (double) numAtBat;
		
		NumberFormat formatter = new DecimalFormat("#.####");
		String batAvgStr = formatter.format(batAvg);
		String slugPercentStr = formatter.format(slugPercent);
		
		System.out.println("Batting average: " + (batAvgStr));
		System.out.println("Slugging Percentage: " + slugPercentStr);
		
		System.out.println("Want to try another batter? Type yes /no ");
		yesNO = scan.next();

		}while(yesNO.equals("yes"));
	}

}
