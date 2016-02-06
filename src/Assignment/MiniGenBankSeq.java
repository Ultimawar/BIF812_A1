package Assignment;

public class MiniGenBankSeq extends SequenceLoader {
	private String locus;
	private String accessionNumber;
	private String definition;
	private String source;
	
	// getters and setters
	public String getLocus(){
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
	
	//constructors
	//no args
	public MiniGenBankSeq(){
	}
	//2 args
	public MiniGenBankSeq(String locus, String accession){
		this.setLocus(locus);
		this.setAccession(accession);
	}
	//4 args
	public MiniGenBankSeq(String locus, String accession, String definition, String source){
		this(locus, accession);
		setDefinition(definition);
		setSource(source);
	}
	//override toString()
	@Override
	public String toString(){
		String formatted = this.getLocus() +('\n')+ this.getAccession() +('\n')+ this.getDefiniton() +('\n')+ this.getSource();
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
