package Cloning;
class Cat{
	int j;
	
	Cat(int j){
		this.j=j;
	}
}

class Dog implements Cloneable{
	int i;
	Cat c;
	
	Dog(Cat c , int i){
		this.c=c;
		this.i=i;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}


public class ShallowCloning {

	public static void main(String[] args)throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d =new Dog(c,10);
		
		Dog d2 = (Dog) d.clone();
		System.out.println("Before the cloning : "+d.i+"........"+d.c.j);
		d2.i=30;
		d2.c.j=40;
		
		System.out.println("After the cloning : "+d.i+"........"+d.c.j);
		
	}

}
