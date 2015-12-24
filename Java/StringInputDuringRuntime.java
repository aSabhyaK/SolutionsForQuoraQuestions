public class StringInputDuringRuntime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String string_one = scanner.nextLine();
		String string_two = scanner.nextLine();
		System.out.println(
				(isNullOrEmpty(string_one) ? 
						"<nothing>" : 
						string_one) + 
				"__" +
				(isNullOrEmpty(string_two) ? 
						"<nothing here as well>" : 
						string_two)
		);
		
		scanner.close();
	}
	private static boolean isNullOrEmpty(String string)
	{
		//check 01: checks whether the string is null or not.
		//check 02: checks whether the string is composed entirely of whitespace characters or not
		//check 03: checks whether the string is empty or not
		
		return string == null | string.matches("\\s+") | string.isEmpty();
	}
}
