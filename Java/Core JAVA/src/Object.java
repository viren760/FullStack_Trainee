
class Employee{
	int emp_id;
	String emp_name;
	String emp_address;
	String emp_profile;
	
	void Details() {
		System.out.println("======= Hey you are under Method =======");
		System.out.println("My Name is "+emp_name+".\n I have Id no "+emp_id+".\n My address is "+emp_address+".\n My profile is "+emp_profile);
	}
	
	void FavLanguage(String language1, String language2, String language3){
		System.out.println("===========My Fav Language are============");
		System.out.print(language1+"\n"+language2+"\n"+language3);
	}
}

public class Object {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
	
		emp.emp_id=3113;
		emp.emp_name="Virender Singh Negi";
		emp.emp_address="D-9444, Dabua Colony , N.I.T Faridabad";
		emp.emp_profile="Software Engineer";
		emp.Details();
		
		emp.FavLanguage("JAVA", "REACT.JS", "NODE.JS");

	}

}
