package lec08.fileio04.first.f;

import java.io.File;

public class FileIOTest {

	public static void main(String[] args) {
		
		File deleteFile = new File("C:\\dev\\FileIOTest\\deleteFile\\test.txt");
		
		boolean delete = deleteFile.delete();
		System.out.println("파일이 삭제되었는가? : " + delete);
	}
}
