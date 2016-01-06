public class NewlineCheck {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("=====================");
		System.out.print("\n");
		System.out.println("=====================");
		System.out.print("\r");
		System.out.println("=====================");
		System.out.print(System.lineSeparator());
		System.out.println("=====================");
		System.out.print(System.getProperty("line.separator"));
		System.out.println("=====================");
	}

}
