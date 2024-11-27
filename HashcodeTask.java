package nov14;

import java.util.HashSet;

public class HashcodeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(100);
		hs.add(500);
		hs.add(300);
		
		System.out.println(hs);
		hs.add(200);
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		
		HashSet<String> s = new HashSet<String>();
		s.add("java");
		s.add("python");
		s.add("flutter");
		s.add("c");
		s.add("c++");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		
	

	}
  
}
