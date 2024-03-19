import javax.swing.JOptionPane;

public class ComputeLoan {

	public static void main(String[] args) {
		String annualInterestRateString=JOptionPane.showInputDialog(
				"Enter yearly interest rate, for example 8.25");
		
		//convert string to double
		double annualInterestRate=Double.parseDouble(annualInterestRateString);
		
		//obtain monthly interest rate
		double monthlyInterestRate=annualInterestRate/1200;
		
		//enter number of years
		String numberOfYearsString=JOptionPane.showInputDialog(
				"Enter number of years as an integer, \nfor example 5:");
		
		//convert string to int
		int numberOfYears=Integer.parseInt(numberOfYearsString);
		
		//Enter loan amount
		String loanString=JOptionPane.showInputDialog(
				"Enter loan amount, for example 120000.95");
		
		//convert string to double
		double loanAmount=Double.parseDouble(loanString);
		
		//calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				-1/Math.pow(1+monthlyInterestRate,numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears *12;
		
		//format to keep two digits after the decimal point
		monthlyPayment = (int)(monthlyPayment*100)/100.0;
		totalPayment=(int)(totalPayment*100)/100.0;
		
		//display results
		String output="The monthly payment is" + monthlyPayment+"\nThe total payment is" + totalPayment;
		JOptionPane.showMessageDialog(null, output);

	}

}
