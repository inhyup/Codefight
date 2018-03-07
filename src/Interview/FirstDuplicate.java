package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 7, 4, 6 };
		System.out.println(firstDuplicate(a));
	}
	
	static int firstDuplicate(int[] a) {
		
		int output = -1;
		
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++)
		{
			if (set.contains(a[i]) && !map.containsKey(a[i]))
			{
				map.put(a[i], i);
			}
			set.add(a[i]);
		}
		
		int index = a.length;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() < index) {
				index = entry.getValue();
				output = entry.getKey();
			}
		}
		return output;
	}

}
