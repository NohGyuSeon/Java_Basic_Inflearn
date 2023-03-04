package lec08.fileio04.first.c;

import java.io.File;

public class FileIOTest {

	public static void main(String[] args) {
		
		File fileOriginal = new File("C:\\dev\\FileIOTest\\orginalFolder");
		File changeNameFile = new File("C:\\dev\\FileIOTest\\moveFolder");

		fileOriginal.renameTo(changeNameFile);
		System.out.println("폴더가 변경되었는가? : " + changeNameFile.exists());
	}
	
}
