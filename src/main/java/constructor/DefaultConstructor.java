package constructor;

public class DefaultConstructor {
	static String dataBase="TEP_Student";
    int studentID;
	String firstName;
	String lastName;
	String phone;
	String email;
	

	

	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
dc.studentInfo(0, dataBase, dataBase, dataBase, dataBase);

	}


		public void studentInfo  ( 
				int studentID,
		String firstName,
		String lastName,
		String phone,
		String email)		{
			System.out.println(
					" , dataBase "	+dataBase+
					" , studentID "+studentID +	
					" , firstName "+firstName +
					" , lastName " +lastName+
					" , phone "   +phone +
					" , email "  +email
						);
				
			
			
		}
			
		

	

}
