/* AUTHOR: Keshav Dial
 * COURSE: BIF812
 * PURPOSE: Assignment #1 for Java
 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * No part of this assignment has been copied manually or electronically from any other source (including web sites) 
 * or distributed to other students.
Keshav Dial 250526958 */

package Assignment;
import java.io.StringWriter;
public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{

	public void concatenate(String sw, int times) {
		/**
		 * This method uses the StringWriter class's append function to concatenate
		 * the inputed String 'sw' to itself as many times as specified by the integer 'times'
		 */
		StringWriter temp = new StringWriter();
		for(int i=0;i<=times;i++){
			System.out.println("Concatenating time "+ i + " of "+times);
			temp = temp.append(sw);
		}
		sequence = temp.toString();
	}	
}
