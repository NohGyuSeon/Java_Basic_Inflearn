package lec06.interface03.first;

public class SampleClass implements SampleInterface {
	
	@Override
	public void interfaceMethod() {
		System.out.println("SampleClass에서 구체화되었습니다.");
	}

	@Override
	public void abstractMethod() {
		System.out.println("SampleClass에서 구체화되었습니다.");
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("default 메서드입니다. SampleClass에서 구현되었습니다.");
	}

	@Override
	public void callPrivateMethodInDefaultMethod() {
		System.out.println("private 메서드를 호출하는 메서드입니다. SampleClass에서 구현되었습니다.");
	}
	
}
