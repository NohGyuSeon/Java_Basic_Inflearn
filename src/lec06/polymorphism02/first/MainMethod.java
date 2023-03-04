package lec06.polymorphism02.first;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("CheckStyle")
public class MainMethod {

	public static void main(String[] args) {
		
		Company cmpElecs = new Electronics();
		Company cmpShips = new Ships();
		
		Map<String, Object> hashMap = new HashMap<String, Object>();
		Map<String, Object> treeMap = new TreeMap<String, Object>();
		
		cmpElecs.builtCompany();
		
		Electronics electronics = new Electronics();
		electronics.systemDevice();
		 
		boolean boolCompany = cmpElecs instanceof Company;
		System.out.println("같은가? : " + boolCompany);
		boolean boolElectronics = electronics instanceof Company;
		System.out.println("같은가? : " + boolElectronics);
		Ships ships = new Ships();
		boolean boolShips = ships instanceof Company;
		System.out.println("같은가? : " + boolShips);
		
		if (ships instanceof Ships) {
			System.out.println("조선회사가 맞습니다.");
		}
		
	}
	
}
