package constructor;

public class UserDefineConstructor {

	 static String DatabaseName = "LU";
	int studentID;
	String firstName;
	String lastname;
	String phone;
	String email;
	String address;
	
	

	public UserDefineConstructor(int studentID, 
			String firstName, 
			String lastname, 
			String phone, 
			String email,
			String address) 
	{
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		
		
		System.out.println("StudentId="+" "+studentID+","+
				"firstname="+" "+firstName +","+
				"Lastname="+" "+lastname+","+
				"Phone="+" "+phone+","+
				"Email="+" "+email+","+
				"Address="+" "+address+","
				);
		
	}



	public static void main(String[] args) {
		institutename();
		System.out.println("my database name"+ DatabaseName);
		
		UserDefineConstructor faruq= new UserDefineConstructor(1, "asdf", "fasd", "fdsaf", "fad", "rerfe");
				faruq.studentInfo(445855, 52275272);
				faruq.studentInfo(154, 6565);
	
	UserDefineConstructor uc =new UserDefineConstructor(4, "fasdf", "dsfgfdg", "fsdfre", "fweerrt", "fsere");
	uc.studentInfo(8574894, 654654);
	uc.studentInfo(0, 0);
	}

	//UserDefineConstructor  salman = new UserDefineConstructor(4, "fasdf", "dsfgfdg", "fsdfre", "fweerrt", "fsere");
	
		
		public void studentInfo (double admissionfee, double classFee) {
			System.out.println ( "Money need to be paid" +" " + admissionfee +" "+ classFee) ;
		}
		public static void institutename() {
			String institutename= "LU";
		System.out.println("my school anme is " + institutename );
		}
	}


