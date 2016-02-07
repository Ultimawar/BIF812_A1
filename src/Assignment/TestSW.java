package Assignment;

public class TestSW {
	public static void main(String[] args){
		StringWriterMiniGenBankSeq test = new StringWriterMiniGenBankSeq();
		String s = "bonjour";
		test.setSequence(s);
		System.out.println(test.testConcatenate(100000));
	}
}

//100,000 Bonjours takes 2,515,962,663!