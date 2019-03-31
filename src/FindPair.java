import java.util.HashMap;
import java.util.Map;

class FindPair {
	public static void findPair(int[] A, int diff) {

		Map<Integer, Integer> map = new HashMap<>();
		int[] vizitat = new int[20];
		int k = 0;

		for (int i = 0; i < A.length; i++) {

			if (map.containsKey(A[i] + diff)) {
				vizitat[k] = map.get(A[i] + diff);
				vizitat[k + 1] = i;
				k = k + 2;

			}

			map.put(A[i], i);

		}
		for (int a = 0; a < k; a = a + 2) {
			System.out.println(vizitat[a] + " " + vizitat[a + 1]);
		}

	}

	public static void main(String[] args) {
		int[] A = { 4, 5, 10, 11, 6 };
		int diff = -1;
		findPair(A, diff);
	}
}