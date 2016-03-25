import java.util.Scanner;

public class selectsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s= new Scanner(System.in);
          int i, j, swap,n;
          
          System.out.println("Enter the number of elements");
          
          n= s.nextInt();
         int a[]= new int[n];
         System.out.println("Enter the number to be sorted");
                
         for(i=0;i<n;i++)
         {
       	  a[i]= s.nextInt();
         }
            // SELECT SORT

            for(i=0;i<n;i++)
            {
            	 int minimumnumberindex=i;
            	for(j=i+1;j<n;j++)
            	{
            		if(a[minimumnumberindex]>a[j])
            		{
            			minimumnumberindex=j;
            		}
            		
            	}
            	
            	swap= a[i];
            	a[i]=a[minimumnumberindex];
            	a[minimumnumberindex]= swap;
            	
            }         
            System.out.println("Sorted List:");

            for(i=0;i<n;i++)
            {
          	  System.out.println("Numbers are:" +a[i]);
            }
            
                         }
}