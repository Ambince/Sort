
public class Sort {
	public static void main(String[] args) {

		int[] array = { 49, 38, 65, 97, 76, 13, 27, 49 };
		// customSort(array);
		// bubbleSort(array);
//		selectSort(array);
		// quickSort(array, 0, array.length - 1);
		 insertSort(array);

		input(array);
	}

	public static void input(int[] array) {
		for (int i = 0; i < array.length; i++) {

			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}

		}
	}

	// 原始排序
	public static void customSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	// 冒泡
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// 选择
	public static void selectSort(int[] array) {
		int i, j, min;
		for (i = 0; i < array.length - 1; i++) {
			min = i;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}

		}

	}

	// 快速排序
	public static void quickSort(int[] array, int start, int end) {

		if (start < end) {
			int base = array[start]; // 选定的基准值（第一个数值作为基准值）
			int temp; // 记录临时中间值
			int i = start, j = end;
			do {
				while ((array[i] < base) && (i < end))
					i++;
				while ((array[j] > base) && (j > start))
					j--;
				if (i <= j) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
			System.out.println("start= " + start + " j= " + j + " end= " + end + " i= " + i);
			if (start < j)
				quickSort(array, start, j);
			if (end > i)
				quickSort(array, i, end);
		}

	}

	// 插入排序
	public static void insertSort(int[] array) {
		int j, temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			for (j = i; j > 0 && array[j - 1] < temp; j--) {
				array[j] = array[j - 1];
			}
			array[j] = temp;

		}

	}

}
