package javaPractice;

public class StringManipulll {

	public static void main(String[] args) {
		
		String a= "Automation lead";
		String b = "automation lead";
		
		//compare
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		//sub string
		System.out.println(a.substring(12));
		System.out.println(a.substring(4, 12));
		System.out.println(a.subSequence(4, 9));
		
		
		//replace all
		System.out.println(b.replace(" ", ""));
		
		//split
		String[] c= a.split(" ");
		for (String string : c) {
			System.out.print(string+", ");
			
		}
		
		String d[]= a.split(" ");
		for (String string1 : d) {
			System.out.print(string1+", ");
			
		}
		
		//concat
		String q = "test";
		String w = "ing";
		int e = 1;
		int r = 2;
		System.out.println(q+w);
		System.out.println(q+w+e+r);
		System.out.println(q+w+(e+r));
		System.out.println(q+e+r);
		System.out.println(e+r+w);
		
		//string var andobject
		
		String abc= "Srenevasan";
		String ab = "Srenevasan";
		System.out.println(abc.equals(ab));
		String name = new String("srene");
		String name1 = new String("srene");
		System.out.println(name.equals(name1));
		System.out.println(name==name1);
		
	}
	
	
}
