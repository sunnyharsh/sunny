package filehandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		final int EOF=-1;
		String path="/media/sunny/sunny/file.txt";
		File file=new File(path);
		if(!file.exists())
		{
			System.out.println("file not available");
			return;
		}
		FileInputStream fs=new FileInputStream(file);
		int singleByte=fs.read();
		while(singleByte!=EOF) 
		{
			System.out.print((char)(singleByte));
			singleByte=fs.read();
		}
	fs.close();
		
	}

}
