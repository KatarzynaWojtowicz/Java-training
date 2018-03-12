package pl.katarzynawojtowicz.collectionstraining.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> bookMap = new HashMap<String, String>();
		bookMap.put("9788365315014", "Metro 2033");
		bookMap.put("9788380083448", "Kicia Kocia To moje!");

		System.out.println(bookMap.size());
		System.out.println(bookMap.get("9788380083448"));
		System.out.println(bookMap.containsValue("Metro 2033"));

		for (String key : bookMap.keySet()) {
			String value = bookMap.get(key);
			System.out.println("[" + key + "] = " + value);
		}

	}
}
