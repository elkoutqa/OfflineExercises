package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		
		String doubleChar = "";
		
		for (int i = 0; i < input.length(); i++) {
			
			doubleChar = doubleChar + input.charAt(i) + input.charAt(i);
		}
		
		return doubleChar;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		
		int start = 0 ,end = 0, instance = 0;
		
		for (int i = 0; i < input.length() - 4; i++) {
			
			if (input.substring(i, i+5).equals("bread")) {
				
				if (instance == 0) {
					start = i+5;
					end = i+5;
					
					instance = 1;
				} else if (instance == 1) {
					end = i;
				}
			}
		}
		return input.substring(start, end);
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		int max = 0, mid = 0, min = 0;
	
		max = Integer.max(a, b);
		max = Integer.max(max, c);
		
		min = Integer.min(a, b);
		min = Integer.min(min, c);
		
		if (a != max && a!= min) {
			mid = a;
		} else if (b != max && b!= min) {
			mid = b;
		} if (c != max && c!= min) {
			mid = c;
		}
		
		if ((max - mid) == (mid - min)){
			return true;
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		
		String test = "";
		int length = input.length();
		
		test = input.substring(0, a) + input.substring(length - a,length);
		
		return test;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		
		int length = input.length();
		
		if (length < 2) {
			return false;
		} else {
			if (input.substring(length - 2, length).equals("ly")){
				return true;
			} else {
				return false;
			}
		}

	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		
		int length = input.length();
		String cleaned = input.charAt(0)+"";
		
		for (int i = 1; i < length; i++) {
			
			if ((input.charAt(i)+"").equals(input.charAt(i-1)+"")) {
				
			} else {
			
				cleaned = cleaned + input.charAt(i);
			}
		}
		return cleaned;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		
		int ans = 0;
		
		if (input == 0) {
			return 0;
		}
		
		if (input == 1) {
			return 1;
		}
		
		ans = fibonacci(input - 2) + fibonacci(input - 1);
		
		return ans;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		
		int num = 0;
		
		if (input == 0) {
			return 0;
		}	
		

		num = bunnyEars(input-1) + 2;
		
		if (num/2 == input) {
			return num;
		}
		
		return num;
	}
	
	public void diamond() {
		/*
		int size = 5;
		int mid = size - 3;
		String line = "";
		
		System.out.println("   *");
		System.out.println("  * *");
		System.out.println(" *   *");
		System.out.println("*     *");
		System.out.println(" *   *");
		System.out.println("  * *");
		System.out.println("   *\n");
		
		for (int j = 0; j < mid; j++) {
			line = line + " ";
		}
		
		line = line + "*";
		System.out.println(line);
		line = "";
		
		for (int i = 1; i < size; i=i+2) {
			
			
			
			line = "*";
				
			for (int j = 0; j <i ; j++) {
				line = line + " ";
			}
			line = line + "*";
			
			for (int j = size; j >i+mid+1 ; j--) {
				line = " "+line;
			}
			
			
			
			
			System.out.println(line);
			line = "";
			
		}
		
		*/
	}
	

}
