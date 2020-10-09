package partitionList;

import java.util.LinkedList;
import java.util.Scanner;

public class PartitionList {

	public static void main(String[] args) {

		LinkedList<Integer> myList = new LinkedList<Integer>();
		Scanner myScanner = new Scanner(System.in);
	
		/**System.out.println("Enter a key");
		Integer key = myScanner.nextInt();
		
		System.out.println("Enter");**/
		Integer key = 5;
		myList.add(5);
		myList.add(4);
		myList.add(6);
		myList.add(1);
		myList.add(10);
		myList.add(1);
		myList.add(5);
		
	}
	
	public static LinkedList<Integer> transform(LinkedList<Integer> myList, Integer key) {
		for(int i = 0; i < myList.size(); i++) {
			/*if(myList.get(i).) {
				
			}*/
		}
		
		return myList;
	}

}
