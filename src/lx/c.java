package lx;
import java.io.File;
public class c {
	public static void main (String []args ) throws Exception{
		File file=new File("D:\\�½��ļ��� (2)");
		fileDir(file);
	}
	public static void fileDir(File dir){
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory()){
				fileDir(file);
			}
			System. out. println(file. getAbsolutePath());
		}
	}
}
