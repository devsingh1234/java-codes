public class Main
{
    
	public static void main(String[] args) {
	    SinglyLinkList sll=new SinglyLinkList();
	    sll.head=new ListNode(10);
	    ListNode second=new ListNode(1);
	    sll.head.next=second;
	    
	    
		}
	}

public class SinglyLinkList{
    private ListNode head;
	public static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data){
		    this.data= data;
		    this.next=next;
		}
		public void display(){
		    ListNode current=sll.head;
	    while(current!=null){
	        System.out.println(current.data + "->");
	        current=current.next;
	        
	    }
	    System.out.println("null");
		}
		
		public int length(){
		    if(head==null){return 0;}
		    int count=0;
		ListNode current=head;
	    while(current!=null){
	        System.out.println(current.data + "->");
	        count++;
	        current=current.next;
	        
	    }
	    return count;
		    
	}
	}
