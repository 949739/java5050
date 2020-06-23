package lx;
import java.io.File;

public class d {
	public static void main (String []args ) {
		File file=new File("D:\\新建文件夹 (3)");
		if(file.exists()){
			System.out.println(file.delete());
		}
		}

}
