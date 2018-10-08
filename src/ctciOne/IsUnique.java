package ctciOne;

public class IsUnique {
	public static boolean determineUniqueString(String a) {
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
