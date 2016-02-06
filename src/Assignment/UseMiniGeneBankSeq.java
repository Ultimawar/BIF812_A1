package Assignment;
public class UseMiniGeneBankSeq {
	public static void main(String[] args){
		String gen1Locus = "KU556802                 749 bp    RNA     linear   VRL 02-FEB-2016";
		String gen1Definition = "Zika virus isolate MEX/InDRE/14/2015 NS5 protein gene, partial cds.";
		String gen1Accession = "KU556802";
		String gen1Source = "Zika virus\n  ORGANISM  Zika virus\n            Viruses; ssRNA viruses; ssRNA positive-strand viruses, no DNA\n            stage; Flaviviridae; Flavivirus; Spondweni virus group.";
		String gen2Locus = "AF086833               18959 bp    cRNA    linear   VRL 13-FEB-2012";
		String gen2Definition ="Ebola virus - Mayinga, Zaire, 1976, complete genome.";
		String gen2Accession = "AF086833";
		String gen2Source = "Ebola virus - Mayinga, Zaire, 1976 (EBOV-May)\n  ORGANISM  Ebola virus - Mayinga, Zaire, 1976\n            Viruses; ssRNA viruses; ssRNA negative-strand viruses;";
		String gen3Locus ="Z86099                154746 bp    DNA     linear   VRL 14-NOV-2006";
		String gen3Definition ="Herpes simplex virus type 2 (strain HG52), complete genome.";
		String gen3Accession ="Z86099";
		String gen3Source ="Human herpesvirus 2 (Herpes simplex virus 2)\n  ORGANISM  Human herpesvirus 2\n            Viruses; dsDNA viruses, no RNA stage; Herpesvirales; Herpesviridae;\n            Alphaherpesvirinae; Simplexvirus.";
		MiniGenBankSeq noArguments = new MiniGenBankSeq();
		MiniGenBankSeq twoArguments = new MiniGenBankSeq(gen2Locus, gen2Accession);
		MiniGenBankSeq fourArguments = new MiniGenBankSeq(gen3Locus, gen3Accession,gen3Definition,gen3Source);
		String demonstrationPartOne =
				("**********************************************************************************\n"
				+"*                               BIF812 ASSIGNMENT #1                             *\n"
				+"*                                  MiniGenBankSeq                                *\n"
				+"*                              PROGRAMMER: KESHAV DIAL                           *\n"
				+"**********************************************************************************\n"
				+"DEMONSTRATION #1: A MiniGenBankSeq constructor with no arguments\n\n" 
				+ noArguments.toString()
				+"\n\nBecause no arguments have been provided, the fields: locus, accession, definition"
				+"\nand version, equal NULL. The 'getter' methods return 'NOT INITIALIZED' when a"
				+"\nvalue equals NULL. Because each of the fields were NULL, all 4 'getters' returned"
				+"\n'NOT INITIALIZED' to the toString() method, hence the output above."
				+"\n\n=> USING SETTER METHODS TO FILL IN MISSING DATA");
		System.out.println(demonstrationPartOne);
		noArguments.setLocus(gen1Locus);
		noArguments.setAccession(gen1Accession);
		noArguments.setDefinition(gen1Definition);
		noArguments.setSource(gen1Source);
		String demonstrationPartTwo=(
				"=> PRINTING UPDATED OBJECT\n\n"+noArguments.toString()
				+"\n\nNow that all fields have been set, all parts of the GenBank file are returned."
				+"\n\nDEMONSTRATION #2: A MiniGenBankSeq constructor with two arguments\n\n"
				+ twoArguments.toString()
				+"\n\nIn this case, the two arguments are used in the constructer by two 'setter'"
				+"\nmethods. The 'setters' assign the first two arguments to locus and accession"
				+"\nfields respectively. Because the fields of definition and version are not set,"
				+"\n'NOT INITIALIZED' is also returned."
				+"\n\n=> USING SETTER METHODS TO FILL IN MISSING DATA");
		System.out.println(demonstrationPartTwo);
		twoArguments.setDefinition(gen2Definition);
		twoArguments.setSource(gen2Source);
		String demonstrationPartThree=(
				"=> PRINTING UPDATED OBJECT\n\n"+twoArguments.toString()
				+"\n\nNow that all fields have been set, all parts of the GenBank file are returned."
				+"\n\nDEMONSTRATION #3: A MiniGenBankSeq constructor with four arguments\n\n"
				+ fourArguments.toString()
				+"\n\nIn this final case, four arguments have been provided so all 4 fields are assigned"
				+"\nto not NULL values. Once arguments have been assigned using 'setters' they are"
				+"\nreturned using 'getters' and passed to the toString() method. The arguments are"
				+"\nthen formatted as above."
				+"\n\nFINAL NOTES:"
				+"\nThe MiniGenBankSeq class is limited to the constructors demonstrated above,"
				+"\naccepting only string arguments where appropriate.\n"
				+"**********************************************************************************"
				);
		System.out.println(demonstrationPartThree);
	}
}
// GenBank 1 Data from http://www.ncbi.nlm.nih.gov/nuccore/KU556802.1
// GenBank 2 Data from http://www.ncbi.nlm.nih.gov/nuccore/AF086833.2
// GenBank 3 Data from http://www.ncbi.nlm.nih.gov/nuccore/Z86099.2