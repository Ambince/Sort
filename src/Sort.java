
public class Sort {
	public static void main(String[] args) {

		int[] array = { 49, 38, 65, 97, 76, 13, 27, 49 };
		// customSort(array);
		// bubbleSort(array);
		// selectSort(array);
		// quickSort(array, 0, array.length - 1);
		// insertSort(array);

		// input(array);

		int maxSize = 100;
		ArrayInObj arr;
		arr = new ArrayInObj(maxSize);
		arr.insert("Amence", "Marry", 20);
		arr.insert("Amence1", "Marry", 20);
		arr.insert("Amence2", "Marry", 20);
		arr.insert("Amence3", "Marry", 20);
		arr.insert("Amence7", "Marry", 20);
		arr.insert("Amence5", "Marry", 20);
		arr.insert("Amence9", "Marry", 20);
		arr.insert("Amence11", "Marry", 20);
		arr.insert("Amenced", "Marry", 20);
		arr.insert("Amencef", "Marry", 20);
		arr.insert("Amencev", "Marry", 20);
		arr.insert("Amences", "Marry", 20);
		arr.insert("Amencez", "Marry", 20);
		arr.insert("Amenceh", "Marry", 20);
		arr.insert("Amencej", "Marry", 20);
		arr.insert("Amenceq", "Marry", 20);
		System.out.print("����֮ǰ��");
		
		arr.display();
		
		System.out.print("����֮��");
		arr.insertionSort();
		arr.display();

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

	// ԭʼ����
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

	// ð��
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

	// ѡ��
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

	// ��������
	public static void quickSort(int[] array, int start, int end) {

		if (start < end) {
			int base = array[start]; // ѡ���Ļ�׼ֵ����һ����ֵ��Ϊ��׼ֵ��
			int temp; // ��¼��ʱ�м�ֵ
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

	// ��������
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
