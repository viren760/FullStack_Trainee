package Collection;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		Map<String,Integer> value = new HashMap<>();

		value.put("First", 1);
		value.put("Second", 2);
		value.put("Third", 3);
		value.put("Fourth", 4);
		value.put("Fifth", 5);
		value.put("Six", 3);
		value.put("Seven", 5);
		value.putIfAbsent("Six", 6);
		
		System.out.println(value);
		System.out.println(value.containsKey("Third"));
		System.out.println(value.containsValue(5));
	     value.remove("Fourth", 4);
		System.out.println("Latest value of map are : "+value);
		value.replace("Seven", 5, 7);
		System.out.println(value);
		
		System.out.println("======= All Keys =========");
		for(String key : value.keySet()) {
			System.out.println(key);
		}
		System.out.println("======== All Values ==========");
		for(Integer Value : value.values()) {
			System.out.println(Value);
		}
	}

}
