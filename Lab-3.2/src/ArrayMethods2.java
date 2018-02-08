
public class ArrayMethods2 {
	
	public static void main(String[] args) {
		String[] list1 = {"aba", "ava", "dog", "egg", "shoe", "string", "xa"};
		String[] list2 = {"banana", "computer", "hat", "saurabh", "train", "vex", "water", "xyz", "yeah", "zebra"};
		merge(list1, list2);
		/*for (String s : merge(list1, list2)) {
			System.out.print(s + " ");
		}*/
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
	
	public static int partition(int[] list) {
		/*	Write a method that partitions a list using the first element as the pivot. You should return the
			integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
			all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
			greater than the pivot.
		*/
		int pivot = list[0];
		int[] newList = new int[list.length];
		for (int x = 1; x < list.length; x++) {
			if (list[x] < pivot) {
				
			}
		}
		return 0; //TEMP
	}
	
}
