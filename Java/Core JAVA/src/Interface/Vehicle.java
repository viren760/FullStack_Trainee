package Interface;

public class Vehicle implements Information {
	private int no=2324;

	
	
public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	
	public void driving()
	{
		System.out.println("vehcile has a driving option ");
	}
	
	public void serialno(){
		System.out.println("Vehicle serialno is "+no);
	}

}
