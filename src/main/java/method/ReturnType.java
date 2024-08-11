package method;

public class ReturnType {

	public static void main(String[] args) {
		ReturnType rt=new ReturnType();
		
		int moreMoney= 15000;
		double currentBalance=rt.checkingAccount();
		double latestBalance=currentBalance+moreMoney;
	 System.out.println("My latestBalance is"+" "+ latestBalance);
	}
		 public Double checkingAccount() {
		        
		    double balance=22000.00;
			int deposit=8000;
			double currentBalance=balance+deposit;
			System.out.println("checking ac balance "+currentBalance);
			return currentBalance;
			
	}

}
