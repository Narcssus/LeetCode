package Q332;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void getIt(String[][] tickets, String now, List<String> ans,
			List<List<String>> tmp) {
		String before;
		if (ans.size() == tickets.length + 1) {
			tmp.add(new ArrayList<String>(ans));
			return;
		}
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0] == "")
				continue;
			if (now.compareTo(tickets[i][0]) < 0)
				break;
			if (now.compareTo(tickets[i][0]) == 0) {
				before = now;
				ans.add(tickets[i][1]);
				now = tickets[i][1];
				tickets[i][0] = "";
				getIt(tickets, now, ans, tmp);
				ans.remove(ans.size() - 1);
				tickets[i][0] = before;
				now = before;

			}
		}

	}

	public static List<String> findItinerary(String[][] tickets) {
		List<String> ans = new ArrayList<String>();
		List<List<String>> tmp = new ArrayList<List<String>>();
		if (tickets.length < 1)
			return ans;
		for (int i = 0; i < tickets.length; i++) {
			for (int j = 0; j < tickets.length; j++) {
				String[] tmp2;
				if (tickets[i][0].compareTo(tickets[j][0]) < 0) {
					tmp2 = tickets[i];
					tickets[i] = tickets[j];
					tickets[j] = tmp2;
				}
				if (tickets[i][0].compareTo(tickets[j][0]) == 0
						&& tickets[i][1].compareTo(tickets[j][1]) < 0) {
					tmp2 = tickets[i];
					tickets[i] = tickets[j];
					tickets[j] = tmp2;
				}

			}
		}
		ans.add("JFK");
		getIt(tickets, "JFK", ans, tmp);
		if (tmp.size() > 0)
			return tmp.get(0);
		else
			return new ArrayList<String>();
	}

	public static void main(String[] args) {
		String[][] tickets = { { "AXA", "EZE" }, { "EZE", "AUA" },
				{ "ADL", "JFK" }, { "ADL", "TIA" }, { "AUA", "AXA" },
				{ "EZE", "TIA" }, { "EZE", "TIA" }, { "AXA", "EZE" },
				{ "EZE", "ADL" }, { "ANU", "EZE" }, { "TIA", "EZE" },
				{ "JFK", "ADL" }, { "AUA", "JFK" }, { "JFK", "EZE" },
				{ "EZE", "ANU" }, { "ADL", "AUA" }, { "ANU", "AXA" },
				{ "AXA", "ADL" }, { "AUA", "JFK" }, { "EZE", "ADL" },
				{ "ANU", "TIA" }, { "AUA", "JFK" }, { "TIA", "JFK" },
				{ "EZE", "AUA" }, { "AXA", "EZE" }, { "AUA", "ANU" },
				{ "ADL", "AXA" }, { "EZE", "ADL" }, { "AUA", "ANU" },
				{ "AXA", "EZE" }, { "TIA", "AUA" }, { "AXA", "EZE" },
				{ "AUA", "SYD" }, { "ADL", "JFK" }, { "EZE", "AUA" },
				{ "ADL", "ANU" }, { "AUA", "TIA" }, { "ADL", "EZE" },
				{ "TIA", "JFK" }, { "AXA", "ANU" }, { "JFK", "AXA" },
				{ "JFK", "ADL" }, { "ADL", "EZE" }, { "AXA", "TIA" },
				{ "JFK", "AUA" }, { "ADL", "EZE" }, { "JFK", "ADL" },
				{ "ADL", "AXA" }, { "TIA", "AUA" }, { "AXA", "JFK" },
				{ "ADL", "AUA" }, { "TIA", "JFK" }, { "JFK", "ADL" },
				{ "JFK", "ADL" }, { "ANU", "AXA" }, { "TIA", "AXA" },
				{ "EZE", "JFK" }, { "EZE", "AXA" }, { "ADL", "TIA" },
				{ "JFK", "AUA" }, { "TIA", "EZE" }, { "EZE", "ADL" },
				{ "JFK", "ANU" }, { "TIA", "AUA" }, { "EZE", "ADL" },
				{ "ADL", "JFK" }, { "ANU", "AXA" }, { "AUA", "AXA" },
				{ "ANU", "EZE" }, { "ADL", "AXA" }, { "ANU", "AXA" },
				{ "TIA", "ADL" }, { "JFK", "ADL" }, { "JFK", "TIA" },
				{ "AUA", "ADL" }, { "AUA", "TIA" }, { "TIA", "JFK" },
				{ "EZE", "JFK" }, { "AUA", "ADL" }, { "ADL", "AUA" },
				{ "EZE", "ANU" }, { "ADL", "ANU" }, { "AUA", "AXA" },
				{ "AXA", "TIA" }, { "AXA", "TIA" }, { "ADL", "AXA" },
				{ "EZE", "AXA" }, { "AXA", "JFK" }, { "JFK", "AUA" },
				{ "ANU", "ADL" }, { "AXA", "TIA" }, { "ANU", "AUA" },
				{ "JFK", "EZE" }, { "AXA", "ADL" }, { "TIA", "EZE" },
				{ "JFK", "AXA" }, { "AXA", "ADL" }, { "EZE", "AUA" },
				{ "AXA", "ANU" }, { "ADL", "EZE" }, { "AUA", "EZE" } };
		System.out.println(findItinerary(tickets).toString());
	}

}
