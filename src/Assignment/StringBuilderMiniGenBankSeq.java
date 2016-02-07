package Assignment;

public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq{
	
	public void concatenate(String seq, int times){
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<=times;i++){
			System.out.println("Concatenating time "+ i + " of "+times);
			temp.append(seq);
		}
		sequence = temp.toString();
	}
}

