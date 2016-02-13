/* AUTHOR: Keshav Dial
 * COURSE: BIF812
 * PURPOSE: Assignment #1 for Java
 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * No part of this assignment has been copied manually or electronically from any other source (including web sites) 
 * or distributed to other students.
Keshav Dial 250526958 */

package Assignment;

public class TestSW {
	public static void main(String[] args){
		StringWriterMiniGenBankSeq test = new StringWriterMiniGenBankSeq();
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1k.txt", 100000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10k.txt", 10000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/100k.txt", 1000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1M.txt", 100));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10M.txt", 10));
	}
}
// 100,000 -> 2,452,282,481
// 10,000 -> 648,113,309
// 1,000 -> 452,363,696
// 100 -> 475,941,987
// 10 -> 563,134,264