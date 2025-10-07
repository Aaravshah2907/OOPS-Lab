public class CheatSheet {
	public static void main(String args[]) {
		String str1 = "Hello";
		String str2 = "Hello";
		int index = 0;
		String []list_str = {"A","a","r", "a", "v"};

		// charAt
		System.out.println(str1.charAt(index));

		// compareTo : returns a negative value if the string comes before other in
		// dictionary order, a positive value if the
		// string comes after other in dictionary order, or 0 if the strings are equal
		System.out.println(str1.compareTo(str2));

		// equals
		System.out.println(str1.equals(str2));

		// equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));

		// startsWith : needs string arguements
		System.out.println(str1.startsWith("H"));

		// endsWith : needs string arguements
		System.out.println(str1.endsWith("o"));

		// indexOf : 1st instance
		System.out.println(str1.indexOf("H"));

		// indexOf : from Index 2
		System.out.println(str1.indexOf("l", 2));

		// lastIndexOf : returns the start of the last substring equal to the string str, starting at the end of the string or at 
		// fromIndex if specified, or -1 if str does not occur in this string
		System.out.println(str1.lastIndexOf(str2));

		// length
		System.out.println(str1.length());
		
		// replace
		System.out.println(str1.replace(str2, str2));

		// substring
		System.out.println(str1.substring(index));
		
		// substring
		System.out.println(str1.substring(index, index+3));

		// toUpperCase
		System.out.println(str1.toUpperCase());
		
		// toLowerCase
		System.out.println(str1.toLowerCase());

		/*
		// strip
		System.out.println(strip(str1));
		
		// stripLeading
		System.out.println());

		// stripTrailing
		System.out.println(str1.stripTrailing(str2));
		*/
		
		// join
		System.out.println(String.join(str1, list_str));

	}
}
