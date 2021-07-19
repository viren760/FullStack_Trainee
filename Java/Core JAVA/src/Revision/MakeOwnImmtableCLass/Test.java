package Revision.MakeOwnImmtableCLass;

public class Test {
	private int i;
	
	Test(int i){
		this.i=i;
	}
	

	public Test modify(int i)
	{
		if(this.i==i) {
			return this;
		}
		else {
			return new Test(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(10);
		Test t2 = t.modify(100);
		Test t3 = t.modify(10);
		
		System.out.println(t==t2); // false 
		System.out.println(t==t3); // true
	}

}
