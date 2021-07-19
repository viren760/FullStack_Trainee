
public class MyException {

	public static void main(String[] args) {
		
		try {
			
			throw new OwnException("My New Exception ...");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

class OwnException extends Exception{
	OwnException(String msg){
		super(msg);
	}
}