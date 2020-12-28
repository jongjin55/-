package Week3;

import java.util.Arrays;

public class week03 {

	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	private static String reverseStr(String string) {

		char[] result = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			result[i] = string.charAt(i);
		}

		char temp = ' ';
		for (int j = 1; j < result.length; j++) {

			for (int i = 0; i < result.length - j; i++) {
				if (result[i] > result[i+1]) {
					temp = result[i];
					result[i] = result[i+1];
					result[i+1] = temp;
				}
			}
		}
		
		String result2 = "";
		
		for (int i = 0; i < result.length; i++) {
			 result2 += result[i];
		}
		
		return result2;
	}
}
