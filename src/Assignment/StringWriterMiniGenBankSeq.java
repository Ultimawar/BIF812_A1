package Assignment;
import java.io.StringWriter;
public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{

	public void concatenate(String s, int times) {
		StringWriter temp = new StringWriter();
		for(int i=0;i<=times;i++){
			System.out.println("Concatenating time "+ i + " of "+times);
			temp = temp.append(s);
		}
		sequence = temp.toString();
	}	
}
