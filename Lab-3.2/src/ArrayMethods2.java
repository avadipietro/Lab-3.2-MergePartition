// Ava DiPietro

import java.util.Arrays;

public class ArrayMethods2 {
	
	public static void main(String[] args) {
		String[] list1 = {"aba", "ava", "dog", "egg", "shoe", "string", "xa"};
		String[] list2 = {"banana", "computer", "hat", "saurabh", "train", "vex", "water", "xyz", "yeah", "zebra"};
		int[] list3 = {4, 1, 7, 8, 6, 3, 5, 2};
		
		//Merge Test
		long start = System.nanoTime();
		String[] mergeResult = merge(list1, list2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		
		//Partition Test
		start = System.nanoTime();
		int pivotFinalPos = partition(list3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(Arrays.toString(list3));
		
	}

	public static String[] merge(String[] list1, String[] list2) {
		/*	Pre-Condition: Both list1 and list2 contain Strings in alphabetical order from a to z.
			Returns: An array of the two lists merged together. The result must be in alphabetical order.
		*/
		int x = 0;
		int y = 0;
		int xcompy = 0;
		String[] list3 = new String[list1.length + list2.length];
		for (int z = 0; z < list3.length; z++) {
			if (x >= list1.length) {
				xcompy = 1;
			}
			else if (y >= list2.length) {
				xcompy = -2;
			}
			else {
				xcompy = list1[x].compareTo(list2[y]);
			}
			if (xcompy <= 0) {
				list3[z] = list1[x];
				x++;
			}
			else {
				list3[z] = list2[y];
				y++;
			}
		}
		return list3;	
	}
	
	public static int partition(int[] list) {
		// Done with help from KC Ang's visual partition	
		int i = 1;
		int pivot = list[0];		
		for (int j = 2; j < list.length; j++) {
			if (list[j] < pivot) {
				i++;
				int m = list[i];
				list[i] = list[j];
				list[j] = m;
			}
		}
		for (int a = 0; a < i; a++) {
			list[a] = list[a + 1];
		}
		list[i] = pivot;
		return i;
	}
	
}