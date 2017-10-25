
public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int items[]; 
	private int numItems;
	private int maxItems;
	

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m)
	{
		this.maxItems = m;
		this.items = new int[this.maxItems];
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
		//Rule 1. Empty MyQueue 
		case 1:
			res = true;
			break;
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
		
		//Rule 1. There is something in the first position
		if(numItems > 0)
		{
			scenario = 1;
		}

		//Rule 2. There is nothing in the first position 
		else
		{
			scenario = 2;
		}
		


		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		//Rule 1. There was something in the first position and res is set to it
		case 1:
			res = items[0];
			break;
		//Rule 2. There was nothing in the first position and an error is printed
		case 2:
			res = -1;
			System.out.println("There is nothing in posiion one at the moment");
			break;

		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		return res;

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
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
		if(numItems < maxItems)
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

		//Rule 1. Empty MyQueue 
		case 1:
			
			//1.2. We add the item to the queue
			this.items[this.numItems] = element;	
			
			//1.3. We increase the number of queued items
			
			this.numItems ++;

			break;
			
		case 2:
			System.out.println("Error the Queue is full");
			break;

		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		

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
		
		//Rule 1. MyQueue is empty so false is returned

		//Rule 2. MyQueue is not empty so true is return 
		if(isEmpty() == false)
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
		//Rule 1. Empty MyQueue 
		case 1:
			for (int i = 0; i < (this.numItems - 1); i++)
				this.items[i] = this.items[i+1];
			
			//1.2. We decrease the number of items
			this.numItems = this.numItems - 1;
			break;
		case 2:
			System.out.println("Error no more elements to remove");
			break;

		}			

		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------	
		

	}
	
}
