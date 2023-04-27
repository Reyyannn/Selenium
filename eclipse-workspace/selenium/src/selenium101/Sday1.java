package selenium101;

import java.util.ArrayList;
import java.util.Iterator;

public class Sday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> students= new ArrayList<Integer>();
		students.add(05);
		students.add(10);
		students.add(30);
		students.add(15);
		System.out.println(students);
		
		Iterator<Integer> ss= students.iterator();
		
		while(ss.hasNext()) {
			
			if(ss.next()<20) {
				
				ss.remove();
			}
		}
		
		
		ArrayList<Integer> numofnames= new ArrayList<Integer>();
		numofnames.add(30);
		numofnames.add(40);
		numofnames.add(10);
		numofnames.add(20);
		System.out.println(numofnames);
		
		Iterator<Integer> NM= numofnames.iterator();
		
		while(NM.hasNext()) {
			
			if(NM.next()<20) {
				
				NM.remove();
			}
		}
		
		
	}

}
