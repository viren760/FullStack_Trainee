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
	
	Dog(Cat c, int i){
		this.c=c;
		this.i=i;
	}
	
	public Object clone()throws CloneNotSupportedException {
		 Cat c1= new Cat (c.j);
		 Dog d= new Dog(c1,i);
		return d;
	}
}


public class DeepCloning {

	public static void main(String[] args)throws CloneNotSupportedException {
		
		Cat c = new Cat(20);
		Dog d1 = new Dog(c,10);
		System.out.println("Before the cloning : "+d1.i+"........"+d1.c.j);

		Dog d2 = (Dog) d1.clone();
		
		d2.i=30;
		d2.c.j=40;
		
		System.out.println("After the cloning : "+d2.i+"........"+d2.c.j);
		
	}

}
