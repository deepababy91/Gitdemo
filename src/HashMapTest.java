

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ram");
		map.put(2, "Rpam");
		map.put(3, "Ram");
		map.put(4, "Raman");
		/*Set<Entry<Integer,String>> entries=map.entrySet();
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+entry.getValue());*/
			HashMap<Integer,String> map1=new HashMap<Integer,String>();
			map1.put(5, "tata");
			map1.putAll(map);
			Set<Entry<Integer,String>> entries2=map1.entrySet();
			for(Entry<Integer,String> entry2:entries2) {
				System.out.println(entry2.getValue() + entry2.getKey());
			}
			Set<Integer> keyvalues=map1.keySet();
			for(Integer keyvalue:keyvalues) {
				System.out.println(keyvalue);
			}
			System.out.println(map1.containsKey(66));//false
			System.out.println(map1.containsValue("Ram"));//true
			System.out.println(map1.size());//5
			System.out.println(map1.containsKey(5));//true
			
			System.out.println(map1.containsKey(5));//false
            map1.clear();
			System.out.println(map1.isEmpty());//true
			System.out.println(map1.get(1));
			
		}

}
