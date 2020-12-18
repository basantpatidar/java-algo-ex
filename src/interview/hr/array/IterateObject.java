package interview.hr.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"store": {A:[1], B[2,3], C[4,5,6], D[7,8,9,0]}
		
		Map<String, List<Integer>> store = new HashMap<String, List<Integer>>();
			store.put("A", Arrays.asList(1));
			store.put("B", Arrays.asList(2, 3));
			store.put("C", Arrays.asList(4, 5, 6));
			store.put("D", Arrays.asList(7, 8, 9, 0));

			Map<String, Integer> stateAndStore = new HashMap();
			
			for(Map.Entry<String, List<Integer>> entry : store.entrySet()) {
				String key = entry.getKey();
				List<Integer> value = entry.getValue();
				stateAndStore.put(key, value.get(0));
				
	            System.out.print(key + ": ");
	            for (int i = 0; i < value.size(); i++) {
	                System.out.print(value.get(i) + " ");
	            }
	            System.out.println();
			}
			System.out.println(stateAndStore.toString());

	}

}
