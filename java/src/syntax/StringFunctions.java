package syntax;

public class StringFunctions {

	public static void main(String[] args) {
		// To bring all the charactors to lower case
		// To bring all the charactors to upper case
		// To remove leading and training spaces from the string
		// Find a charactor within the string
		// Find the location of a charactor within the string	
		// Find the location of a charactor within the string
		// Replace a string/substracting with othe string/substring
		//
	
System.out.println("Learning String Functions........");
	String str =" Hello World";
	System.out.println("The original string is :  " + str);
	// To bring all the charactors to lower case
	System.out.println("The lower case output of the string is :  " + str.toLowerCase());
	//To bring all the charactors to upper case
	System.out.println("The upper case of the string is :  " + str.toUpperCase());
	// To remove leading and training spaces from the string
	str=" Hello World ";
	System.out.println("The updated string is: '"+ str +"'");
	System.out.println("Output after removing the leanding and Trailing spaces '"+str.trim()+"'");
	// Replace a string/substracting with othe string/substring
	
	
	
	str=str.trim();
	
	
	System.out.println("The updated string is: '"+ str +"'");
	
	System.out.println("Replace 'World' with 'Universe' the output is: " + str.replace("World","Universe"));
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	
	
		str="Hello World";
		
		System.out.println("oth position '"+ str + "'is:" + str.charAt(0));
		System.out.println("6th position '"+ str + "'is:" + str.charAt(6));
		
		//System.out.println("11th position '"+ str + "'is:" + str.charAt(11));
		
		System.out.println("the index value of 'o'in the string : '" + str + "'  is : " + str.indexOf('o'));
		System.out.println("the index value of 'o'in the string : '" + str + "'  is : " + str.indexOf("World"));
		System.out.println("The index value os 'or' in the string  '" + str + "'  is : " + str.indexOf("or"));
		
		String str1 = null;
		System.out.println("Value of 'str1 = null' :"+ " " + str1);
		
		str1 =" ";
		System.out.println("Value of 'str1 = ' : "+ " " + str1);
		 
  	   if(str1.trim().isEmpty())
		{
			System.out.println("EMPTY Value of str1 is empty" );
		}
		
		else 
		{
			System.out.println("NOT EMPTY Value of str1 =  : "+ " " + str1);
		}
		
		
		if(str1.isBlank())
		{
			System.out.println("Value of str1 is blank" );
		}
		
		else 
		{
			System.out.println("NOT BLANK Value of str1 =  : "+ " " + str1);
		}
		
		
		str="Hello World";
		String searchString ="Hello";
		
				
		// Chech if the main string has the sub string or not(Source string has the search string or not )
		if (str.contains(searchString))
			System.out.println("The source String  " + str + "has the search string  : "  + " " + searchString);
		else
			System.out.println("the search string is not present in the source string");
		
		
		
		if (str.startsWith(searchString))
			System.out.println("The source String  " + str + " strats with the search string  : "  + " " + searchString);
		else
			System.out.println("the Source String does not start with source string");
		
		
		
		if (str.endsWith("rld" ) || (str.endsWith("world")))
			System.out.println("The source String  " + str + " ends with the word : "  + " " + "rld");
		else
			System.out.println("the Source String does not end with the word rld");
		
		
		String source = "Hello World";
		String search = "Hello World";
		if (source == search)
			System.out.println("Both the string match exactly....");
		else
			System.out.println("Both the string are diffrent......");
		
		
		if(source.equals(search))
			System.out.println("They still match");
		    System.out.println("they still dont match");
		
		    source = "Hello world";		
		    search = "Hello World";
		    
		    
	    if (source == search)
				System.out.println("The updated values exactly match ....");
	    else
				System.out.println("The updated values still dont match......");
	    
	    if (source.equals(search))
			System.out.println(" .EQUAL The updated values exactly match ....");
        else
			System.out.println(" .EQUAL The updated values still dont match......");
    
	    if (source.equalsIgnoreCase(search))
				System.out.println(" .EQUALSIGNORE The updated values exactly match ....");
	    else
				System.out.println(" .EQUALSIGNORE  The updated values still dont match......"); 
	    
	    if(source.toLowerCase().equals(search.toLowerCase()))
	    	System.out.println(" .ToLowerCase The updated values exactly match ....");
	    else
				System.out.println(" .ToLowerCase  The updated values still dont match......"); 
		
		
		
	     source = "Hello everyone, how are you doing ?";
	     System.out.println("Number of charactors in the source string are:  "+ source.length());
	
		
		
		// Practice 
	     
	     str = "Hello There" ;
	    System.out.println(str.replace(" " ,"" ));
	    
	    System.out.println(str.trim().toUpperCase().replace("Hello", "hi")); // half of this is not going to work
	    System.out.println(str.trim().replace("Hello", "Hi").toUpperCase());
	    System.out.println(str.replace(" ", "").replace("Hello", "Hi"));
		
		
	}

}
