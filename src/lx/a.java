package lx;
import java.io.File;
public class a {
	public static void main (String[] args )throws Exception{
		File file=new File("D:\\�½��ļ��� (3)");
		if (file.isDirectory()){
			String[]nams=file.list();
			for(String name:nams){
				System.out.println(name);
			}
		}
				
	}

}
