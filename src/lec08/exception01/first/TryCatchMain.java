package lec08.exception01.first;

public class TryCatchMain {

	public static void main(String[] args) {
		
		try {

			int divide = 10 / 0;
			System.out.println("나누기 : " + divide);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
