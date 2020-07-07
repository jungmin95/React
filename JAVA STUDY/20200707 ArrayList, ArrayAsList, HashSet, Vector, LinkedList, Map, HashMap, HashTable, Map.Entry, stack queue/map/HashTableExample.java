package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("�̼���", 95);
		map.put("ȫ�浿", 100);
		
		System.out.println(map.size());
		Set<String> keyset = map.keySet();
		Iterator<String> key = keyset.iterator();
		
		while(key.hasNext()) {
			String tempKey = key.next();
			Integer tempValue = map.get(tempKey);
			System.out.println(tempKey + ", " + tempValue);
		}
		System.out.println();
		map.clear();

		System.out.println(map.size());
		

	}

}