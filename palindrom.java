public class palindrom {
	public static void main(String[] args) {
		
		String s = "racecar";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	}
}