package week2.day1;

public class ReverseOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String input = "I am a software tester";
		        String[] words = input.split(" ");
		        StringBuilder result = new StringBuilder();

		        for (int i = 0; i < words.length; i++) {
		            if ((i + 1) % 2 == 0) {  // odd positions if counted from 1
		                String reversed = new StringBuilder(words[i]).reverse().toString();
		                result.append(reversed);
		            } else {
		                result.append(words[i]);
		            }
		            if (i < words.length - 1) {
		                result.append(" ");
		            }
		        }

		        System.out.println("Output: " + result.toString());
		    }
	}

