import java.util.*;
import java.io.*;

public class Segmentation{
	static final int ROWN = 9999999;//ÇÐ¸îºóµÄ×Ö·ûÊý
	public static void main(String[] args) throws Exception{
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()){
			System.out.println("File doesn't exist!");
			System.exit(0);
		}
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
		int r, file_num = 0;
		while((r = input.read()) != -1){
			File targetFile = new File("./txt/file_"+file_num);
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
			for(int i = 0; i < ROWN; i++){
				output.write((byte)r);
				if((r = input.read()) == -1){
					output.close();
					return;
				}
			}
			file_num++;
		}
		input.close();
	}
}