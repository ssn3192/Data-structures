import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
         int i,n;
         
         System.out.println("Enter the number of elements");
         
         n= s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the number to be sorted");
               
        for(i=0;i<n;i++)
        {
      	  a[i]= s.nextInt();
        }
		
        System.out.println("Enter the number to be searched");
    		
        int searchelement= s.nextInt();
	
            for(i=0;i<n;i++)
            {
            	if(a[i]==searchelement)
            	{
            		System.out.println("The location of the searched number is" +(i+1));
            	    break;
            	}
            	
            }
             
            if(i==n)
            {
            	
          	System.out.println("Wrong number..!!!Number is not present in the list");
            	
            }
        
		
	}

}
