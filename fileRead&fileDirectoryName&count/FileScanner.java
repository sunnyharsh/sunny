package filehandlingDemo;

import java.io.File;

public class FileScanner {

	public static void main(String[] args) 
	{
		String path="/media/sunny/sunny/file";
		File file=new File(path);
		File files[]=file.listFiles();
		int fileCount=0;
		int dirCount=0;
		for(File f: files) {
			if(f.isDirectory())
			{
				dirCount++; 
				System.out.println("<dir>" + f.getName());
			}
			else 
				if(f.isFile())
				{
					fileCount++;
					System.out.println("<file> " + f.getName());
					int index=f.getName().lastIndexOf(".");
					System.out.println(index);
					String fileName=f.getName().substring(0, index);
					System.out.println(fileName);
					//System.out.println(path+"/"+fileName+".haha");
					f.renameTo(new File(path+"/"+fileName+".haha"));//extension change
				}
			
		}
		
	}

}
