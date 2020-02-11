package Week1.day2;

public class Reverseevenwords {

	public static void main(String[] args) {
		String s="I am a software Tester";
		String rev="";
		String[] split = s.split("\\s");
		for (int i = 0; i < split.length-1; i++) {
			int l = s.length();
			String s1="";
			while(l>0)
			{
				char ch = s.charAt(l-1);
				s1=s1+ch;
				l--;
			}
			rev=rev+s1+" ";
			System.out.print(rev);
		}
	}
	

}
