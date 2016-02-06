package Assignment;

public class MiniGenBankSeq extends SequenceLoader {
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
	}
	//2 args
	public MiniGenBankSeq(String locus, String accession){
		this.locus=locus;
		this.accessionNumber=accession;
	}
	//4 args
	public MiniGenBankSeq(String locus, String accession, String definition, String source){
		this(locus, accession);
		this.definition=definition;
		this.source=source;
	}
	public MiniGenBankSeq(String[] arguments){
		System.out.println(arguments);
	}
	@Override
	public String toString(){
		String formatted = locus +('\n')+ accessionNumber +('\n')+ definition +('\n')+ source;
		return formatted;
	}
	
	public void StringBuilderMiniGenBankSeq(String s, int times){
		for(int i=0;i<times;i++){
		System.out.println("Concatenating time "+ i + " of "+times);
		sequence = sequence + s;
		}
	}
	
	public static void main(String[] args){
		MiniGenBankSeq bob = new MiniGenBankSeq("filler", "filler", "filler", "filler"); 
		System.out.println(bob.definition);
	}
}
