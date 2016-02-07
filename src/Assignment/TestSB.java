package Assignment;

public class TestSB {
	public static void main(String[] args){
		StringBuilderMiniGenBankSeq test = new StringBuilderMiniGenBankSeq();
		String s = "bonjour";
		test.setSequence(s);
		System.out.println(test.testConcatenate(100000));
		}
}

// 100,000 Bonjours takes 2,402,309,442!