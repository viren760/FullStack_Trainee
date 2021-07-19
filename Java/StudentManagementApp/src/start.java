import java.io.InputStreamReader;

import com.Student_manage.Student;
import com.Student_manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;

public class start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Student Management");
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to Exit App");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//ADD STUDENTS
				System.out.println("Enter user name :");
				String name = br.readLine();
				
				System.out.println("Enter user Phone :");
				String phone = br.readLine();
				
				System.out.println("Enter user City :");
				String city = br.readLine();
				
				Student st =  new Student (name, phone, city);
			boolean answer =StudentDao.insertStudentToDB(st);
			
			if(answer) {
			   System.out.println("sucessfull added ....");	
			}else {
				 System.out.println("failed to added try again later ....");
			}
			
				System.out.println(st);
				
			}else if(c==2) {
				//DELETE STUDENTS	
				
				System.out.println("Enter student ID to delete :");
				int userID= Integer.parseInt(br.readLine());
			boolean ans=StudentDao.deleteStudent(userID);
			
			if(ans) {
				System.out.println("Sucessfull Deleted");
			}else {
				System.out.println("Failed to delete");
			}
				
			
			}else if(c==3){
				//DISPLAY STUDENTS		
				StudentDao.showAll();
				
			}else if(c==4){
                //EXIT				
	          
				break;
			}else {
				
			}
		}
		
		System.out.println("Thank you for visiting my site");
		System.out.println("See you soon bye bye ..");

	}

}
