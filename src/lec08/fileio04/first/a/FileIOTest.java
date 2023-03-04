package lec08.fileio04.first.a;

import java.io.File;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\dev\\test.txt");
		
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath();
		String canoicalPath = file.getCanonicalPath();
		
		System.out.println("path : " + path);
		System.out.println("absolutePath : " + absolutePath);
		System.out.println("canoicalPath : " + canoicalPath);
		
		System.out.println();
		
		String parent = file.getParent();
		File parentFile = file.getParentFile();
		System.out.println("parent : " + parent);
		System.out.println("parentFIle : " + parentFile);
		
		String absoulteParent = file.getAbsoluteFile().getParent();
		File absoulteFileParentFile = file.getAbsoluteFile().getParentFile();
		System.out.println();
		System.out.println("absoulteParent : " + absoulteParent);
		System.out.println("absoulteFileParentFile " + absoulteFileParentFile);
		
		boolean exists = file.exists();
		boolean isFile = file.isFile();
		boolean isDirectory = file.isDirectory();
		System.out.println();
		System.out.println("exists : " + exists);
		System.out.println("isFile : " + isFile);
		System.out.println("isDirectory : " + isDirectory);
			
	}
	
}
