/* AUTHOR: Keshav Dial
 * COURSE: BIF812
 * PURPOSE: Assignment #1 for Java
 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * No part of this assignment has been copied manually or electronically from any other source (including web sites) 
 * or distributed to other students.
Keshav Dial 250526958 */

package Assignment;

public class Test {
	public static void main(String[] args){
		MiniGenBankSeq test = new MiniGenBankSeq();
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1k.txt", 100000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10k.txt", 10000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/100k.txt", 1000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1M.txt", 100));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10M.txt", 10));
	}
}
// 100,000 -> 11,833,764,286,700
// 10,000 -> 1,421,663,064,313
// 1,000 -> 137,021,355,929
// 100 -> 14,179,629,047
// 10 -> 1,336,577,151
