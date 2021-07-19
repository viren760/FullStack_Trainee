package Interface;

public class Computer implements Information {

	private int num=244;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void os() {
		System.out.println("computer has windows10 os");
	}

	@Override
	public void serialno() {
		System.out.println("Computer serialno : "+num);
		
	}
}
