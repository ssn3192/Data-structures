import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s= new Scanner(System.in);
          int i, j, k, swap,n;
          
          System.out.println("Enter the number of elements");
          
          n= s.nextInt();
         int a[]= new int[n];
         System.out.println("Enter the number to be sorted");
         
          for(i=0;i<n;i++)
          {
        	  a[i]= s.nextInt();
          }
          
            //bubble sort starts
          for(i=0;i<n-1;i++)
          {
        	  for(k=0;k<n-i-1;k++)
        	  {
        		  if(a[k] > a[k+1])
        		  {
        			  swap= a[k];
        			  a[k]=a[k+1];
        			  a[k+1]= swap;
        		  }
        	  }
        	  
          }
          System.out.println("Sorted List:");

          for(i=0;i<n;i++)
          {
        	  System.out.println("Numbers are:" +a[i]);
          }
	}

}
