package lx;
import java.io.File;

public class d {
	public static void main (String []args ) {
		File file=new File("D:\\�½��ļ��� (3)");
		if(file.exists()){
			System.out.println(file.delete());
		}
		}

}
