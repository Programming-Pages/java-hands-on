package syntax;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is a single line comment
		// This is another single line comment

		/*
		 * This is a multi-line comment You can add as many lines as you want as a part
		 * of comment Comments are the part of a code But they are never executed As a
		 * programmer/automation engineer, it is a good habit to write comments Comments
		 * helps anyone who is looking the code to understand
		 * 
		 * 
		 * 
		 */
		// System.out.println will display the message or text provided
		// within the round brackets

		System.out.println("Hello World !!!");
		System.out.println("How are you ?");
		System.out.println();
		System.out.println("I am doing great");

		// variables and Data Types
		System.out.println("Cat 1: Primitive Data Type");
		System.out.println("1>> Integer Data Type");

		// Syntax
		// DataType Variable Name
		int iVar1; // Variable declaration
		iVar1 = 100; // Assignment or Initialization of a value to the variable
		System.out.println("value of iVar3 is:" + iVar1);

		int iVar2;
		iVar2 = iVar1;
		System.out.println("value of iVar3 is:" + iVar2);
		int iVar3;
		// The plus sign here is the arithemetic operator for adding two values
		// When the below is executed, first the calculations present
		// on the right side of the = sign will happen
		// The output of this will then be assigned to the variable present
		// on the left side of the=
		//
		iVar3 = iVar1 + iVar2;
		System.out.println("value of iVar3 is:" + iVar3);

		// Declaration and Initialization both together

		int iVar4 = iVar3 + 10;
		System.out.println("value of iVar4 is:" + iVar4);
		System.out.println("Adding 50 to iVar4 gives" + (iVar4 + 50)); // Arithmetic operator
		System.out.println("This is the previous value of iVar4");

		/*
		 * Using + sign between two numeric value or variable is arithmetic operation
		 * 10+10 iVar1 + 10 iVar1+10 iVar1+iVar2
		 */
		System.out.println("2.. Float DataType");
		float fl = 10; // This is a decimal data type
		System.out.println("Value of fl is:" + fl);
		fl = 15.5f;
		System.out.println("Updated Value of fl is :" + fl);
		short sh = 10; // This is a non decimal data type
		System.out.println("Value of sh:" + sh);

		System.out.println("4>> Long Datatype");
		long ln = 10;// This is a non decimal data type
		System.out.println("Value of ln:" + ln);

		System.out.println("5>> Double Datatype");
		double db = 10;// This is a decimal data type
		System.out.println("Value of db:" + db);
		db = 14.7;

		System.out.println("6>> byte Datatype");
		byte bt = 10;
		System.out.println("Value of bt:" + bt);

		System.out.println("7>> Char Datatype");
		char ch = 'a';
		System.out.println("Updated Value of ch:" + ch);

		System.out.println("8>> Boolean Datatype");
		// when you need response in YES or NO i.e TRUE or FALSE
		boolean bln = false;
		System.out.println("Value of bln:" + bln);

		System.out.println("9>> String Datatype");
		String str = "This is a String Datatype";
		System.out.println("Value of str is:" + str);

	}

}
