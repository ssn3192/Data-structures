import java.util.*;
import java.util.Scanner.*;

public class reverseword {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
       System.out.println("enter a string");
       
       String word=sc.nextLine();
       
      String wordcut[]= word.split(" ");
	//	String s[]= "Hello world".split(" ");
		int len= wordcut.length;
		int i;
	//	System.out.println(len);
				
		String resultword= "";
		for(i=len-1;i>=0;i--){
			
			resultword= resultword+ wordcut[i]+" ";
		}

		System.out.println(resultword);
	}

}
