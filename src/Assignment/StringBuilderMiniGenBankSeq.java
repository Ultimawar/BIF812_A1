/* AUTHOR: Keshav Dial
 * COURSE: BIF812
 * PURPOSE: Assignment #1 for Java
 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * No part of this assignment has been copied manually or electronically from any other source (including web sites) 
 * or distributed to other students.
Keshav Dial 250526958 */

package Assignment;

public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq{
	
	public void concatenate(String sb, int times){
		/**
		 * This method uses the StringBuilder class's append function to concatenate
		 * the inputed String 'sb' to itself as many times as specified by the integer 'times'
		 */
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<=times;i++){
			System.out.println("Concatenating time "+ i + " of "+times);
			temp.append(sb);
		}
		sequence = temp.toString();
	}
}

