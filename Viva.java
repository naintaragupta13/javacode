package Basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Viva {

	public static void main(String[] args) {
	Map<Integer,String> map= new HashMap<>();
	
	map.put(1, "Naina");
	map.put(2,"Raja");
	map.put(3, "Ram");
	map.entrySet();
	
	Iterator<Map.Entry<Integer, String>> itr =map.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry<Integer, String> entry=itr.next();
		System.out.println(entry.getKey()+"="+entry.getValue());
		
	}
	}

}
