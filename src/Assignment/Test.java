package Assignment;

public class Test {
	public static void main(String[] args){
		MiniGenBankSeq test = new MiniGenBankSeq();
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10k.txt", 10000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/100k.txt", 1000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1M.txt", 100));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10M.txt", 10));
	}
}

// 10,000 -> 1,421,663,064,313
// 1,000 -> 137,021,355,929
// 100 -> 14,179,629,047
// 10 -> 1,336,577,151
