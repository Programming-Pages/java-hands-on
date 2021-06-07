package syntax;

public class Loops {

	public static void main(String[] args) {
		
	System.out.println("Learning Loops......");	
	
	//  When you have a block of code to be executed more than once, it is recommended to use LOOPS
	// In a loop ther will be a variable..
	/*
	
		1. is going to take care of a count. This count is the number of iterations that you want to loop
		2.will increment or decrement itself to reach to that final count
		3.you will have to place a condition which will decide when the loop execution should end
		
		
	Step 1: First the variable i is declare
	Step 2: The value of i is initialized with 1
	Step 3: The value of variable i is compared to the condition given as second parameter
	Step 4: If the output of condition as per step 3 is true, the block of code will be executed
	Step 5: The value of variable is incremented or decremented
	Step 6: Start from Step 3. 	
		
		
	*/	
	int i;
	for(i=1;i<=5;i=i+1)
	{
		//this block of code to be looped
		System.out.println("Value of variable i is : "+i );
	}
		
	System.out.println("Variable initialization within the group");
	for(int j=0 ; j<5 ; j++ )
	{
		//this block of code to be looped
		System.out.println("Value of variable j is : "+j );
	}	
		
	for(int k=10;k>=1;k--)	
	{
		System.out.println("Value of k is: "+ k);
	}
	
	System.out.println();
	System.out.println();
	System.out.println("Nested loop......");
		
		
	for(int r=1 ; r<=5 ; r++)
	{
		for(int c=1;c<=3;c++)
		{
			System.out.println("Value of r: "+ r+"  Value of c:"+c);
		}
	}
	System.out.println();
	System.out.println();
	System.out.println("While loop......");
	 
	int t =1;
	while(t<=5)
	{
	System.out.println("Value of t : " +t);
	t++;
	
	}
	System.out.println("While loop...... e++ after function" );
	int e =1;
	while(e<=5)
	{
		e++;
	System.out.println("Value of e : " +e);
	
	}	
	
	
	
	System.out.println("While (true) loop..... BASED ON THE CODE WE USED INSIDE THE BLOCK WE ARE APPLYING THE CONDITION." );
	int y=1;
	while(true)
	{
		System.out.println("Value of y : " +y);
		y++;
		if(y==10)
		break;
	}
	
	System.out.println(" do While loop..... " );
	 
	int p=1;
	do
	{
		System.out.println("Value of p is: " + p);
		p++;
		
	}while(p<=10);
	
	
	
	
	
	
		
	}

}
