
public class MyDoubleDynamicQueue<T> implements MyQueue<T> 
{

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int numItems;
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue()
	{
		this.numItems = 0;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
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
	public T first()
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
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		return this.head.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element)
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------


		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		int scenario = 0;
		
		if (numItems == 0)
		{
			scenario = 1;
		}
		else
		{
			scenario = 2;
		}
		


		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		MyDoubleLinkedNode<T> newNode = null;
		
		switch(scenario){	

		case 1:
			 newNode = new MyDoubleLinkedNode<T>(head , element, tail);
			 this.head = newNode;
			 this.tail = newNode;
			 this.numItems++;
			break;

		case 2:
			 newNode = new MyDoubleLinkedNode<T>(head, element, tail);
			 newNode.setLeft(this.head);
			 newNode.setRight(this.tail);
			 this.head = newNode;
			 this.numItems++;

			break;
		}		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	


	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------


		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		int scenario = 0;
		
		//Rule 1. MyQueue is empty so true is returned

		//Rule 2. MyQueue is not empty so false is returned
		if(numItems == 0)
		{
			System.out.println("Nothing else to delete");
		}
		else
		{
			this.head = head.getRight();
			this.numItems--;
		}
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	

		case 1:

			break;

		case 2:

			break;
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	


	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------


		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION

		int scenario = 0;
		//Rule 1. MyQueue is empty so true is returned

		//Rule 2. MyQueue is not empty so false is returned

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	

		case 1:

			break;

		case 2:

			break;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		return (T) this.tail.getInfo();


	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element)
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------


		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		int scenario = 0;
		if (numItems == 0)
		{
			scenario = 1;
		}
		else
		{
			scenario = 2;
		}
		
		//Rule 1. MyQueue is empty so true is returned

		//Rule 2. MyQueue is not empty so false is returned

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
	
		

		MyDoubleLinkedNode<T> newNode = null;
		
		switch(scenario){	

		case 1:
			 newNode = new MyDoubleLinkedNode<T>(head , element, tail);
			 this.head = newNode;
			 this.tail = newNode;
			 this.numItems++;
			break;

		case 2:
			 newNode = new MyDoubleLinkedNode<T>(head, element, tail);
			 newNode.setLeft(this.tail);
			 newNode.setRight(this.head);
			 this.tail = newNode;
			 this.numItems++;

			break;
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	


	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast()
	{
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		int scenario = 0;
		if(numItems == 0)
		{
			scenario = 1;
		}
		else
		{
			scenario = 2;		
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	

		case 1:
			System.out.println("Sorry the list is already empty");
			break;

		case 2:
			MyDoubleLinkedNode<T> previousNode = null;
			previousNode = tail.getLeft();
			tail = previousNode;
			previousNode.setRight(null);
			numItems--;

			break;
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	


	}
	
}
