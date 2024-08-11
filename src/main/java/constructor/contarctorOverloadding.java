package constructor;

public class contarctorOverloadding {

	 int studentID;
		String firstName;
		String lastName;
		String phone;
		String email;
		
	
	
	
		public contarctorOverloadding(int studentID, String lastName, String phone) {
			super();
			
			this.studentID = studentID;
			this.lastName = lastName;
			this.phone = phone;
			
			System.out.println("studentId="+studentID+ ",lastname="+lastName+ ",phone="+phone);
			
			
			
			
		}

		public contarctorOverloadding(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			
			System.out.println("firstname="+firstName+",lastname="+lastName + ",email name="+email
					
					);
			
			
		}




		public contarctorOverloadding(int studentID, String firstName, String lastName, String phone, String email) {
			super();
			this.studentID = studentID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.email = email;
			
			System.out.println("studentID="+studentID+",firstName="+firstName
					+",lastName="+lastName+",phone="+phone+",email="+email
					);
		}

	public static void main(String[] args) {
		
		contarctorOverloadding salman =new contarctorOverloadding(12, "salman", "01742792825");
		salman.studentfee(1250, 45752);
		contarctorOverloadding arafath=new contarctorOverloadding("arafath", "ahmed", "shahriuarsalman39");
		arafath.studentfee(1542, 56454);
		contarctorOverloadding shahriar=new		contarctorOverloadding(1, "shahriar", "salman", "01472798569", "salmanfarshi687@gmail.com");
		shahriar.studentfee(1236, 5454);
	}

	
	public void studentfee(double seleniumFee, int admissionFee) {
		double totalPayment= seleniumFee   + admissionFee;
		System.out.println("Total payment is"+" "+totalPayment);
	}
	
}
