 public class linkedlist {

Node head;   //first element of the list

	 static class Node {
		 
 		 int data;     //data and pointer to next node indicated as data and next
		 Node next;
		 
		 Node(int d){
			 
			 data=d;
			 next = null; 
			 
		 }

		public Node(int position, int new_value) {
			// TODO Auto-generated constructor stub
			
			
		}
	 }
	 
	 //PRINT THE LIST.....!!!!!!!!!!!!!!!!!!!!!!!
	 public void printlist()
	 {
		 Node n= head;
		 
		 while(n!=null){
			 
			 System.out.println(n.data);
			 n= n.next;
		 }
		 
	 }
	 // Insert data at the starting ie. changing head value
	 public void Insertatbeginning(int head_data){
		 
		Node new_root_data= new Node(head_data);
		
		 new_root_data.next= head;
		 
		 head= new_root_data;
		 
	 }
	 //Insert just after the next node of head...
	 public void InsertAfter(Node prev_node, int new_data){
		 
		 if(prev_node==null){
			 
			 System.out.println("Previous values cannnot be null");
			 return;
		 }
		 
		 Node data= new Node(new_data);
		 
		 data.next= prev_node.next;
		 
		 prev_node.next= data;
	 }
	
	 
	 // insert at the end that is creating new tail
	 public void InsertEnd(int new_data){
		 
		 
		 Node data1= new Node(new_data);
		 
		 if(head==null){
			 
			 head= new Node(new_data);
			 return;
		 }
		 
		data1.next=null;
		
		 Node Last=head;
		 
	 while(Last.next!=null)
			
		Last=Last.next;
		Last.next= data1;
			return;
		
		 
	 }
	 
	 public void insertatPosition(int position,int new_value){
		 
		 Node data1= new Node(position,new_value);
	//	 Node data2= new Node(new_value);
		 data1.data=new_value;
		 data1.next=null;
		 
		
		     Node tmp=head;
		    if(tmp==null && position!=0){
		    	return; }
		    else if (tmp ==null && position==0)
		    {
		    head.next=head;
		    	return;
		    }
		    
			if(position==0){
				
				data1.next= head;
				head= data1;
				return;
			}
			 Node prev= null;
			 Node current= head;
			 int i=0;
			 while(current!=null && i<position){
				 prev= current;
			 current= current.next;
			 i++;
			
			 }
			 data1.next = prev.next;
			    prev.next = data1;
			    return;
	 }
	 
	 public void deleteelement(int key){
		 
		 Node temp= head, previous=null;
		 
		 
		 //case1: when head itself hold the key
		 if(temp!=null &&temp.data==key){
			 
			 head= temp.next;
			 return;
			 
		 }
		 // case2 when head do not hold key
		 while(temp!=null && temp.data!=key){
			 
			 previous= temp;
			 temp=temp.next;
		 }
		  // case3 whne key was not in the list
		 if(temp==null)
			 return;
		 
		 previous.next=temp.next;
	 }
	 
	 public void deletefromposition(int position){
		 
		 
		if(head==null)
			return;
		 
		 Node temp= head;
		 
		 if(position==0){
			 
			 head=temp.next;
			 return;
			 }
		 
		 for(int i=0; temp!=null && i<position-1;i++)
			 temp=temp.next;
		 if(temp==null || temp.next==null )
			 return;
			 
			 Node next= temp.next.next;
			 
			 temp.next= next;
	 }
	 public static void main(String args[]){
		 
		 
		 linkedlist l= new linkedlist();
		 
		 System.out.println("Created Linked list:");
		 l.head= new Node(1);       
		 Node second= new Node(2);
		 Node third= new Node(3);
		 Node fourth= new Node(12);
		 
		 
		 l.head.next=second;    
	     	 
		 second.next=third;
		 
		 third.next= fourth;
		 l.printlist();
		 System.out.println("After inserting an element at beginning:");
		 l.Insertatbeginning(144);
		 l.printlist();
		 System.out.println("After inserting an element after head:");
		 l.InsertAfter(l.head.next, 33);
		 
		 l.InsertAfter(l.head.next, 35);
		 l.printlist();
		 System.out.println("After inserting an element at end:");
		 l.InsertEnd(222);
		 l.printlist();
		 System.out.println("Delete operation:");
		 
		 l.deleteelement(33);
		 l.deleteelement(222);
		 l.deleteelement(1);
		 l.printlist();
		 System.out.println("Delete from the specific position:");
		l.deletefromposition(2);
		 l.printlist();
		 System.out.println();
		 l.deletefromposition(3);
		 l.printlist();
		 System.out.println("Insert at specific position:");
		
		 l.insertatPosition(0, 101);
		 
		 l.printlist();
		 
		 System.out.println();
		 
		 l.insertatPosition(0, 111);
		 l.printlist();
		 System.out.println("Next Insertion result:");
		 l.insertatPosition(3, 1888);
		l.printlist();
		 
		 
	 }
}
