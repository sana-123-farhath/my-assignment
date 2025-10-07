package week2.day2;

public class ChangeOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String test = "changeme";
		        char[] charArray = test.toCharArray();

		        for (int i = 0; i < charArray.length; i++) {
		          
		            if (i % 2 != 0) {
		          
		                charArray[i] = Character.toUpperCase(charArray[i]);
		            }
		   } 
	  System.out.println(new String(charArray));
  }
}


