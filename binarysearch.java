import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
        int i,n;
        
        System.out.println("Enter the number of elements");
        
        n= s.nextInt();
       int a[]= new int[n];
       System.out.println("Enter the numbers:");
              
       for(i=0;i<n;i++)
       {
     	  a[i]= s.nextInt();
       }
		
       // Enter the element which you want to search
       
       System.out.println("Enter the element to be searched");
       
       int searchnumber= s.nextInt();
       
       
       int low=0;
       int high= n-1;
       int middle= low+high/2;
            
           while(low<=high)
           {
        	   if(a[middle]< searchnumber)
        	   {
        		   low= middle+1;
        	   }   
        	   
        	   else if(a[middle]== searchnumber)
        	   {
        		   System.out.println("Search number is located at" + (middle+1));
        	       break;
        	   }
        	   else
        		   high=middle-1;
        	   
        	       middle= low+high/2;
        
           }
       
           if(low>high)   
           {
             System.out.println("Wrong number have been searched");		
	}

}
}