package lec08.fileio04.second.stream.h;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputTest {

	public static void main(String[] args) {

		String strPath = "C:\\dev\\test.txt";

		try (BufferedInputStream bufferedInputStream = 
				new BufferedInputStream(new FileInputStream(strPath))) {

			byte[] bytes = new byte[30];

			while (true) {
				int read = bufferedInputStream.read(bytes);
				if (read == -1) {
					break;
				}

				String getData = new String(bytes, 0, read);
				System.out.print(getData);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
