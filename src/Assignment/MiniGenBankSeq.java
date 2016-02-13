/* AUTHOR: Keshav Dial
 * COURSE: BIF812
 * PURPOSE: Assignment #1 for Java
 * I declare that the attached assignment is my own work in accordance with Seneca Academic Policy. 
 * No part of this assignment has been copied manually or electronically from any other source (including web sites) 
 * or distributed to other students.
Keshav Dial 250526958 */

package Assignment;

public class MiniGenBankSeq extends SequenceLoader {
	private String locus;
	private String accessionNumber;
	private String definition;
	private String source;
	
	// DECLARING GETTER and SETTER METHODS
	public String getLocus(){
		/**
		 * Will return the value of the String 'locus'. If no value is available
		 * it will return 'NOT INITIALIZED'
		 */
		if (locus==null){
			return "NOT INITIALIZED";
		}
		else{
			return locus;
		}
	}
	public void setLocus(String locusValue){
		locus = locusValue;
	}
	
	public String getAccession(){
		/**
		 * Will return the value of the String 'accessionNumber'. If no value is available
		 * it will return 'NOT INITIALIZED'
		 */
		if (accessionNumber==null){
			return "NOT INITIALIZED";
		}
		else{
			return accessionNumber;
		}
	}
	public void setAccession(String accessionValue){
		accessionNumber = accessionValue;
	}
	
	public String getDefiniton(){
		/**
		 * Will return the value of the String 'definition'. If no value is available
		 * it will return 'NOT INITIALIZED'
		 */
		if (definition==null){
			return "NOT INITIALIZED";
		}
		else{
			return definition;
		}
	}
	public void setDefinition(String definitionValue){
		definition = definitionValue;
	}
	
	public String getSource(){
		/**
		 * Will return the value of the String 'source'. If no value is available
		 * it will return 'NOT INITIALIZED'
		 */
		if (source==null){
			return "NOT INITIALIZED";
		}
		else{
			return source;
		}
	}
	public void setSource(String sourceValue){
		source = sourceValue;
	}	
	//
	
	//DECLARING CONSTRUCTOR METHODS
	// No arguments
	public MiniGenBankSeq(){
		/**
		 * This constructs a MiniGenBankSeq instance with 4 strings (locus,
		 * accessionNumber, definition and source). In this case all four strings
		 * are set to NULL.
		 */
	}
	//Two arguments
	public MiniGenBankSeq(String locus, String accession){
		/**
		 * This constructs a MiniGenBankSeq instance with 4 strings (locus,
		 * accessionNumber, definition and source). In this case the first
		 * two arguments are assigned to the locus and accessionNumber 
		 * Strings respectively. 
		 */
		this.setLocus(locus);
		this.setAccession(accession);
	}
	//Four arguments
	public MiniGenBankSeq(String locus, String accession, String definition, String source){
		/**
		 * This constructs a MiniGenBankSeq instance with 4 strings (locus,
		 * accessionNumber, definition and source). In this case, the four 
		 * arguments are assigned to the Strings locus, accessionNumber,
		 * definition, and source (in that order).  
		 */
		this(locus, accession);
		setDefinition(definition);
		setSource(source);
	}
	//override toString()
	@Override
	public String toString(){
		/**
		 * This method returns the MiniGenBankSeq object's contents (locus, accessionNumber, definition, and source) formatted 
		 * with labels. The method utilizes the getter methods and as such will print 'NOT INITILIZED' if no value has been
		 * assigned to the given String.  
		 */
		String formatted = "LOCUS       "+this.getLocus() +("\nACCESSION   ")+ this.getAccession() +("\nDEFINITION  ")+ this.getDefiniton() +("\nVERSION     ")+ this.getSource();
		return formatted;
	}
	
}
