package nov14;

import java.util.TreeSet;

public class TreeSetTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("java" );
		ts.add("python" );
		ts.add("flutter" );
		ts.add("c" );
		ts.add("c++");
		System.out.println(ts);
		System.out.println(ts.hashCode());
		System.out.println("Unique Courses:");
        for (@SuppressWarnings("unused") String course :ts) {
            System.out.println(ts);
		

	}

}
}
