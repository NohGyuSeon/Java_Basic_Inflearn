package lec06.interface03.first;

public interface SampleInterface {

	public void interfaceMethod();

	public abstract void abstractMethod();
	
	public String OS_NAME = "windows11";
	public final static String DOWNLOAD_PATH = "C:/";
	
	public class sampleFirst {
		public int sampleCount = 3;
	}
	
	public static class sampleStaticClass {
		public static int staticSampleCount = 1;
	}
	
	public interface innerInterface {
		public void showMsg();
	}
	
	public enum D {CREATE, READ, UPDATE, DELETE}
	
	public default void defaultMethod() {
		System.out.println("기본 메서드입니다. 자바 1.8 이후부터 사용 가능합니다.");
	}
	
	public static void staticVoidMethod() {
		System.out.println("static 메서드도 사용이 가능합니다. 마찬가지로 1.8부터 사용이 가능합니다.");
	}
	
	private void privateMethod() {
		System.out.println("interface 내부의 private 메서드입니다. 자바 11 버전 이후부터 사용이 가능합니다.");
	}
	
	default void callPrivateMethodInDefaultMethod() {
		privateMethod();
	}
	
}
