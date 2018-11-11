package solution;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindtheWinner {
	/* We have four Candidates with name as 'John',
	      'Johnny', 'jamie', 'jackie'.
	       The votes in String array are as per the
	       votes casted. Print the name of candidates
	       received Max vote. */
	/*public static void findWinner(String votes[])
	{
		// Insert all votes in a hashmap
		Map<String,Integer> map =new HashMap<String, Integer>();
		for (String str : votes)
		{
			if (map.keySet().contains(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		// Traverse through map to find the candidate
		// with maximum votes.
		int maxValueInMap = 0;
		String winner = "";
		for (Map.Entry<String,Integer> entry : map.entrySet())
		{
			String key  = entry.getKey();
			Integer val = entry.getValue();
			if (val > maxValueInMap)
			{
				maxValueInMap = val;
				winner = key;
			}
			// If there is a tie, pick lexicographically
			// smaller.
			else if (val == maxValueInMap &&
					winner.compareTo(key) > 0)
				winner = key;
		}
		System.out.println("Winning Candidate is :" +
				winner);
	}
	// Driver code
	public static void main(String[] args)
	{
		String[] votes = { "john", "johnny", "jackie",
				"johnny", "john", "jackie",
				"jamie", "jamie", "john",
				"johnny", "jamie", "johnny",
		"john" };
		findWinner(votes);
	}*/

	 public static void main(String[] args) {
	        String[] votes = {"victor", "veronica", "ryan", "dave", "maria", "farah", "farah", "ryan", "veronica" };
	        Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
	        for (String vote : votes) {
	            if (map.containsKey(vote)) {
	                map.put(vote, map.get(vote) + 1);
	            } else {
	                map.put(vote, 1);
	            }
	        }
	        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
	                .getKey());
	    }

}


