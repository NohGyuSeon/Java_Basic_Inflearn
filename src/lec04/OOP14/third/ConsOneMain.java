package lec04.OOP14.third;

public class ConsOneMain {

	public static void main(String[] args) {
		
		ConsOne sample = new ConsOne();
		sample.cpuName = "amd";
		sample.gpuName = "radeon";
		
		System.out.println(sample.cpuName);
		System.out.println(sample.gpuName);		
		
		ConsOne consOne = new ConsOne("intel", "nvd");
		System.out.println(consOne.cpuName);
		System.out.println(consOne.gpuName);
		
		System.out.println("====================");
		
		ConsOne consTwo = new ConsOne(consOne);
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
		
		consTwo.cpuName = "amd";
		consTwo.gpuName = "radeon";
		
		System.out.println("\n\n");
		
		System.out.println(consOne.cpuName);
		System.out.println(consOne.gpuName);
		System.out.println("====================");
		System.out.println(consTwo.cpuName);
		System.out.println(consTwo.gpuName);
		
	}
	
}
