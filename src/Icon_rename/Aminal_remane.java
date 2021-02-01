package Icon_rename;
import java.io.*;

public class Aminal_remane {
	public static void main(String[] args) {
		File file = new File("./qq_icon/动物");
		File[] list = file.listFiles();
		
		if(file.exists() && file.isDirectory()) {
			for(int i = 0; i< list.length; i++) {
				String name = list[i].getName();
				int index = name.indexOf(".");
				int index2 = name.lastIndexOf(".");
				String names = name.substring(index2);
				String newName = "qq_anmal"+(i+1)+names;
				File dest = new File(("./qq_icon/动物")+"/"+newName);
				list[i].renameTo(dest);
				System.out.println(dest.getName());
				//将修改后的结果打印出来
			}
		}
		else
			System.out.println("error path!");
	}
}
