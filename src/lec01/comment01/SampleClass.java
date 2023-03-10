package lec01.comment01;

/**
 * <pre>
 * 클래스 주석
 * </pre>
 * @author kusun
 * 
 */
public class SampleClass {
	
	public static void main(String[] args) {
		
		/*
		 * 주석을 사용함으로써 클래스와 함수에 대한 설명을 글로 적어 둘 수가 있음.
		 * 소스코드가 많아지고 라인 수가 길어질수록 소스코드만 보고 분석하는 것에는 시간이 걸림.
		 * 그럴 때 소스코드의 원 저작자가 설명 주석을 달아주어서 협업하는데 도움을 주거나
		 * 이후 개발자가 바뀌더라도 인수인계의 원활함의 장점을 가져갈 수 있음.
		 * 
		 * 주석은 컴파일 시 제외됨.
		 * 
		 * API 블록 주석의 경우 클래스 레벨, 즉 클래스 위쪽에 작성 후 마우스를 놓으면
		 * 클래스 설명을 볼 수 있음.
		 * 이클립스에서 생성된 주석은 HTML 형식이라서 스페이스바, 탭, 개행이 적용되지 않음.
		 * 적용시키기 위해서는 <pre></pre>라는 태그를 적용시켜야 함.
		 * <pre></pre> 태그를 통해서 스페이스바, 탭, 개행이 적용될 수 있음.
		 */
		
		/*
		 * 블록주석
		 * 
		 */
		
		/* 여러 줄의
		 * 블록입니다. */
		
		System.out.println("Hello, world.");
//		System.out.println("세계야, 안녕.");
	}
	
}
 