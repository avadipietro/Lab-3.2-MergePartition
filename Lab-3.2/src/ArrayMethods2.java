
public class ArrayMethods2 {
	
	public static void main(String[] args) {
		String[] list1 = {"aba", "ava", "dog", "egg", "shoe", "string", "xa"};
		String[] list2 = {"banana", "computer", "hat", "saurabh", "train", "vex", "water", "xyz", "yeah", "zebra"};
		int[] list3 = {2, 1, 7, 8, 6, 3, 5, 4};
		//merge(list1, list2);
		for (int i : partition(list3)) {
			System.out.print(i + " ");
		}
	}

	public static String[] merge(String[] list1, String[] list2) {
		/*	Pre-Condition: Both list1 and list2 contain Strings in alphabetical order from a to z.
			Returns: An array of the two lists merged together. The result must be in alphabetical order.
		*/
		int l = 0;
		int x = 0;
		int y = 0;
		String[] list3 = new String[list1.length + list2.length];
		if (list1.length > list2.length) {
			l = list2.length;
		}
		else {
			l = list1.length;
		}
		for (int z = 0; z < list1.length + list2.length; z++) {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			if (y < l && x < l) {
			if (list1[x].compareTo(list2[y]) <= 0) {
				list3[z] = list1[x];
				x++;
			}
			else {
				list3[z] = list2[y];
				y++;
			}
			}
			if (l == list1.length) { // list2 is bigger
				list3[z] = list2[y];
				y++;
			}
			System.out.println(list3[z]);
		}
		return list3;	
	}
	
	public static int[] partition(int[] list) {
		/*	Write a method that partitions a list using the first element as the pivot. You should return the
			integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
			all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
			greater than the pivot.
		*/
		// Done with help from KC Ang's visual partition
		int pivot = list[list.length - 1];
		int y = 0;
		for (int x = 0; x < list.length - 1; x++) {
			if (list[x] < pivot) {
				y++;
				int z = list[x];
				list[x] = list[y];
				list[y] = z;
			}
		}
		return list;
	}
	
}
