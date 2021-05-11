import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("First", 1);
		m1.put("Second", 2);
		m1.put("Third", 3);
		m1.put("Fourth", 4);
		System.out.println(m1.get("First"));
	}

}
