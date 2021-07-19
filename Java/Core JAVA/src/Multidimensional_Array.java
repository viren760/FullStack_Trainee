
public class Multidimensional_Array {

	public static void main(String[] args) {
		
 //		first array box							0			1				2	           first loop for this ...
		int [] [] multidimensionalArray = {{20,40,100},{30,45,300,47},{100,255,36,49}};
//      Second array box                     0  1  2	0   1  2  3     0  1   2   3        Second loop for this ...
		
		
		System.out.println("=============Multidimensional Array============");
		System.out.println(multidimensionalArray[2][3]);
   
		System.out.println("=============For Loop for Multidimensional Array============");
		for(int i=0; i<multidimensionalArray.length; i++) {
			for(int items=0; items<multidimensionalArray[i].length; items++) {
				System.out.print(multidimensionalArray[i][items]+"\t");
			}
			System.out.println();
		}
		
	}

}
