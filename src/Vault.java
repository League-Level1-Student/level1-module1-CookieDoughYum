import java.util.Random;

public class Vault {
	int secretcode= 629430;
public static void main(String[] args) {
	Vault v=new Vault();
}
boolean tryCode(int code) {
	if(code==secretcode) {
		return true;
	}
	else {
		return false;
	}
}
int getCode(){
	return this.secretcode;
}
}
