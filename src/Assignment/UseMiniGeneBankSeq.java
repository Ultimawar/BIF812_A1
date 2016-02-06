package Assignment;
public class UseMiniGeneBankSeq {
	public static void main(String[] args){
		MiniGenBankSeq bob = new MiniGenBankSeq();
		System.out.println(bob);
		String[] ass = new String[3];
		for(int i =0; i< 3; i++){
			ass[i]= "ABC";
		}
		MiniGenBankSeq bobby = new MiniGenBankSeq(ass);
	}
}
