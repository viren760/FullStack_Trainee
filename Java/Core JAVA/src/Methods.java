class SeeHowMethodWorks{

	int  month = 3;
	
	
 // void is null soo it doesnot return any value ..	
	void  talk(String text) {
		System.out.println(text);
	}

// int method can return value ....
	int MyBirthday() {
		System.out.println("How Many Months is left for my Birthday :");
		int Birthday = 12 - month;
		return Birthday;
		
	}
	
	void Time(int hour, int minutes, double sec) {
		
	  System.out.println("My birthday is "+hour+" Hours and "+minutes+" minutes and "+sec+" second .");	
	}
}


public class Methods { 

	public static void main(String[] args) {
		
		SeeHowMethodWorks s = new SeeHowMethodWorks();
		
		s.talk("Hello I'm Virender");
		String say = "I'm From Uttrakhand";
		s.talk(say);
		s.month=3;
		int bday = s.MyBirthday();
		System.out.println(bday+" Months left");
        s.Time(5, 35, 4.57);
	}

}
