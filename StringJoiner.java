import java.util.StringJoiner;

public class linkedlist {
	public static void main(String Args[]) {
		StringJoiner str = new StringJoiner(",", "[", "}");
    
		// if stringjoiner is empty it will take by default
		str.setEmptyValue("add this");
		System.out.print(str);
		str.add("null");
    
		StringJoiner str1 = new StringJoiner(":", "[", "]");
		str1.add("kuchv");
		str1.add("ker");
    
		// make sure to create new stringjoiner to store it
		StringJoiner st = str.merge(str1);
		System.out.println(st);
    
		// it print the length
		System.out.println(str.length());
		
		
		//output: add this[null,kuchv:ker}
		//16
		

	}
}
