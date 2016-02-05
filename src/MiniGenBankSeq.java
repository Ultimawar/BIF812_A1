
public class MiniGenBankSeq {
	private String locus;
	private String accessionNumber;
	private String definition;
	private String source;
	// getters and setters
	public String getLocus(){
		return locus;
	}
	public void setLocus(String locusValue){
		locus = locusValue;
	}
	public String getAccession(){
		return accessionNumber;
	}
	public void setAccession(String accessionValue){
		accessionNumber = accessionValue;
	}
	public String getDefiniton(){
		return definition;
	}
	public void setDefinition(String definitionValue){
		definition = definitionValue;
	}
	public String getSource(){
		return source;
	}
	public void setSource(String sourceValue){
		source = sourceValue;
	}	
	//
	
	//constructors
	//no args
	public MiniGenBankSeq(){
		this("filler","filler","filler","filler");
	}
	//2 args
	public MiniGenBankSeq(String definition, String source){
		this("filler", "filler", definition, source);
	}
	//4 args
	public MiniGenBankSeq(String locus, String accessionNumber, String definition, String source){
		this.locus=locus;
		this.accessionNumber=accessionNumber;
		this.definition=definition;
		this.source=source;
	}
	
	public static void main(String[] args){
		MiniGenBankSeq bob = new MiniGenBankSeq("filler", "filler", "filler", "filler");
		System.out.println(bob.definition);
	}
}
