package Assignment;

public class Test {
	public static void main(String[] args){
		MiniGenBankSeq test = new MiniGenBankSeq();
		String s = "bonjour";
		test.setSequence(s);
		System.out.println(test.testConcatenate(100000));
	}
}

//100,000 Bonjours takes 34,753,644,087!