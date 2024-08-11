package method;

public class ParametarizedMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametarizedMathod pm=new ParametarizedMathod();
		pm.clientname();
		pm.fullname("sa", "Shahsssssriar");
		pm.fullname("humayera", "juthy");
		
	}

	public String fullname(String firstname,String lastname  ) {
		String fullname= firstname+" "+lastname;
		System.out.println("my name is"+ " " + fullname);
		return fullname;
		
	}
		
	
	public String clientname() {
		String firstname="salman";
		String lastname="shahriar";
		String fullname= firstname+" "+lastname;
		System.out.println("client full name is"+ " " +fullname);
		return fullname;
	}

}
