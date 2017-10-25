
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;
	private int numItems;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue()
	{
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = false;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyQueue is empty so true is returned
		if(numItems == 0)
		{
			scenario = 1;
			
		}
		//Rule 2. MyQueue is not empty so false is returned
		else
		{
			scenario = 2;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		//Rule 1. Shows that myQueue is empty
		case 1:
			res = true;
			break;
		//Rule 2. Shows that myQueue is not empty
		case 2:
			res = false;
			break;
		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		return res;
		 
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		MyNode current = this.head;

		//Rule 1. My queue is not empty
		if(numItems == 0)
		{
			scenario = 2;
		}
		//Rule 2. My queue is empty so there is no first item
		else
		{
			scenario = 1;
		}




		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		//Rule 1. Goes to the front of myQueue and gets the info
		case 1:
			 res = current.getInfo();
			break;
		case 2:
			System.out.println("The queue is empty cannot give you a first item");
			break;
			
		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		return res;


	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element)
	{
		

		
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		if(numItems == 0)
		{
		//Rule 1. If there is no items in the queue we must create the head
			scenario = 1;
		}
		
		else
		{
			// Rule 2. If the head is created we can add to Queue
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		
		MyNode newNode = null;
		MyNode currentNode = head;

		switch(scenario){	
		
		case 1:
			
			newNode = new MyNode(element, null);
			this.head = newNode;
			this.numItems = this.numItems + 1;
			break;
			
		case 2:
			while(currentNode.getNext()!=null)
			{
				currentNode = currentNode.getNext();
			}
			
			newNode = new MyNode(element, null);
			currentNode.setNext(newNode);
			this.numItems = this.numItems + 1;
			break;
			
			
		}	


		//-----------------------------
		//Output Variable --> Return FinalValue
		//------------------------------
		
		
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		if(this.numItems > 0)
		{
			scenario = 1;
		}
		else
		{
			scenario = 2;
		}
		

		//2. We decrease the number of items

		
	

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		
		case 1:
			
			head = head.getNext();
			this.numItems = this.numItems - 1;
			
			break;
		case 2:
			System.out.println("Error there are no more elements to remove");
			break;

		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		

	}
	
}
