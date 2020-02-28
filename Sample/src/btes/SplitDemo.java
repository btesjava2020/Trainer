package btes;

public class SplitDemo {

	public static void main(String[] args) {
		int i;
		String s="bebo Technical Education Services";
		String s1[]=s.split("Technical");
		for(i=0;i<s1.length;i++)
			System.out.println(s1[i]);
	}

}
