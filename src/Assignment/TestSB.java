package Assignment;

public class TestSB {
	public static void main(String[] args){
		StringBuilderMiniGenBankSeq test = new StringBuilderMiniGenBankSeq();
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10k.txt", 10000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/100k.txt", 1000));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/1M.txt", 100));
		System.out.println(test.testConcatenate("/Users/keshavdial/git/BIF812_A1/bin/Assignment/10M.txt", 10));
		}
}

// 10,000 -> 1,175,722,050
// 1000 -> 437,917,761
// 100 -> 410,145,578
// 10 -> 1,989,750,148