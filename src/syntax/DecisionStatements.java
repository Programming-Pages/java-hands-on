package syntax;

public class DecisionStatements {

	public static void main(String[] args) {
		/*
		 * >> To write conditions we need to use COMPARISON OPERATORS 1. Two values can
		 * be the same 2. Two values cannot be the same 3. One value is greater than the
		 * other value. 4. One value is less than the other value. 5. One value is
		 * greater than or equal to the other value. 6. One value is less than or equal
		 * to the other value. 7. One value is TRUE 8. One value i FALSE >> For
		 * scenarios with two or more conditions: Execute a block of code if: 9. Output
		 * of all the conditions are true. eg. Provide driving license to a person who
		 * has (age greater than or equal to 18)& (less than 60) 10. Output of any one
		 * condition is true eg. The trip that we plan can be either to (Mout Abu)or to
		 * (Matheran)or to (Goa)or to(Kerala)or
		 * 
		 */
		int iVar1 = 25;
		int iVar2 = 55;
		System.out.println("Value of iVar1 is: " + iVar1 + " Value of iVar2 is: " + iVar2);

		if (iVar1 == iVar2)

		{
			System.out.println("Using == operator: The Values of both variables are equal");
		} else {
			System.out.println("Using == operator: The Values of both variables are NOT equal");
		}
		if (iVar1 != iVar2) {
			System.out.println("Using != operator: The Values of both variables are NOT equal");
		} else {
			System.out.println("Using != operator: The Values of both variables are equal");
		}

		if (iVar1 > iVar2) {
			System.out.println("Using > operator: the value of iVar1 is greater than iVar2");
		} else {
			System.out.println("Using > operator: the value of iVar1 is NOT greater than iVar2");

		}
		if (iVar1 < iVar2) {
			System.out.println("Using < operator: the value of iVar1 is less than iVar2");
		} else {
			System.out.println("Using < operator: the value of iVar1 is NOT less than iVar2");

		}
		//
		if (iVar1 >= iVar2) {
			System.out.println("Using >= operator: the value of iVar1 is greater than equal to iVar2");
		} else {
			System.out.println("Using >= operator: the value of iVar1 is NOT greater than equal to iVar2");

		}
		if (iVar1 <= iVar2) {
			System.out.println("Using <= operator: the value of iVar1 is less than equal to iVar2");
		} else {
			System.out.println("Using <= operator: the value of iVar1 is NOT less than equal to iVar2");

		}
		boolean bln = true;
		System.out.println("Value of bln is  :" + bln);

		if (bln == true) {
			System.out.println("Value of bln is TRUE");
		} else {
			System.out.println("Value of bln is NOT TRUE");
		}

		if (bln == false) {
			System.out.println("Value of bln is False");
		} else {
			System.out.println("Value of bln is NOT False");
		}

		/*
		 * >> For scenarios with two or more conditions: Execute a block of code if: 9.
		 * Output of all the conditions are true. eg. Provide driving license to a
		 * person who has (age greater than or equal to 18)& (less than 60)
		 * 
		 * 
		 */

		int age = 10;
		if (age >= 18 && age < 60) {
			System.out.println("Pass: Provide driving license");
		} else {
			System.out.println("Fail: The age is not between 18 and 60");
		}

		/*
		 * 10. Output of any one condition is true eg. Session days (Monday,
		 * Wednesday,Friday , Saturday)
		 * 
		 * 
		 */

		char sDay = 'T';
		if (sDay == 'M' || sDay == 'W' || sDay == 'W' || sDay == 'F' || sDay == 'S')

		{
			System.out.println("This is the session day ");
		} else {
			System.out.println("We have a break this day");

		}

		/*
		 * Switch () case break
		 */

		char sessionDate = 'A';
		switch (sessionDate) {
		case 'M':
			System.out.println("The session day is on Monday");
			break;
		case 'W':
			System.out.println("The session day is on Wednesday");
			break;
		case 'F':
			System.out.println("The session day is on Friday");
			break;
		case 'S':
			System.out.println("The session day is on Saturday");
			break;
		default:
			System.out.println("There is no session  today");
			break;

		}
	}

}
