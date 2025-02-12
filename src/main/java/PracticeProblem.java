import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double num;
		num = in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: Input another number: ");
		Double var;
		Double var2;
		var = in.nextDouble();
		var2 = in.nextDouble();
		double result = var / var2;
		in.nextLine();
		System.out.println(Math.floor(result));
		System.out.println(Math.ceil(result));
		//Write question 2 code here
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double x;
		x = in.nextDouble();
		in.nextLine();
		System.out.println(Math.round(Math.sqrt(x)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: Input another number: ");
		Double y;
		Double z;
		y = in.nextDouble();
		z = in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(y, z));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: Input another number: Input one more number: ");
		Double hi;
		Double two;
		Double three;
		hi = in.nextDouble();
		two = in.nextDouble();
		three = in.nextDouble();
		in.nextLine();
		double max = Math.max(hi, Math.max(two, three));
		double min = Math.min(hi, Math.min(two, three));
		System.out.println(max);
		System.out.println(min);
		
	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence;
		sentence = in.nextLine();
		System.out.println(sentence.contains("on"));

		
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mango;
		mango = in.nextLine();
		System.out.println(mango.equalsIgnoreCase("mango"));

		
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: Input a letter: ");
		String word1;
		String letter;
		word1 = in.nextLine();
		letter = in.nextLine();
		System.out.println(word1.indexOf(letter));
		System.out.println(word1.lastIndexOf(letter));

		
	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence1;
		sentence1 = in.nextLine();
		System.out.println("Your sentence is " + sentence1.length() + " characters long");

		
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: Input a word to replace: What word would you like to replace it with: ");
		String sentence2;
		String word2;
		String word3;
		sentence2 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		System.out.println(sentence2.replace(word2, word3));
		
	}

	public static void q11() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence3;
		sentence3 = in.nextLine();
		System.out.println((sentence3.toUpperCase()).trim());
		System.out.println((sentence3.toLowerCase()).trim());
		
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word4;
		word4 = in.nextLine();
		System.out.println(word4.substring(0, Math.min(4, word4.length())));
		System.out.println(word4.substring(Math.max(0, word4.length() -  4)));
		
	}
	

}
