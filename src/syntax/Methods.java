package syntax;

public class Methods {

	public static void main(String[] args) {

		System.out.println("Learning Methods...");
		addition();
	}

	// ClassName objectName = new ClassName();
	Methods objMethods = new Methods();
	// objMethods.addition();

	public static void addition() {
		int iVar1 = 30;
		int iVar2 = 45;
		int res = iVar1 + iVar2;
		System.out.println("The result of adding " + iVar1 + " and " + iVar2 + " result in: " + res);

	}

}
