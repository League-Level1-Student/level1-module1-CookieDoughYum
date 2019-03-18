import java.util.Random;

public class JamesBond {
public static void main(String[] args) {
	Vault v=new Vault();
	JamesBond jb=new JamesBond();
	System.out.println(jb.findCode(v));
}
int findCode(Vault v) {
	for(int i=0; i<1000000; i++) {
		if(i==v.getCode()) {
			return v.getCode();
		}
	}
	return -1;
}
}
