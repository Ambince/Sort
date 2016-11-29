
public class Find {
	public static void main(String[] args) {
		int[] array = { 3, 5, 11, 17, 21, 23, 28, 30, 32, 50 };

		inputIndex(splitHalf(array, 30, 0, array.length));
		
	}

	public static void inputIndex(int x) {
		x += 1;
		System.out.println("��ѯ��λ��Ϊ=" + x);
	}

	/**
	 * �۰����
	 * @param array
	 * @param searchData
	 * @param start
	 * @param end
	 * @return
	 */
	public static int splitHalf(int[] array, int searchData, int start, int end) {
		int index = (start + end) / 2;
		int data = array[index];
		
		if (start > end) {
			return -1;
		}
		if (array[index] == searchData) {
			return index;
		} else {
			if (searchData > data) {
				// ����������ִ����м�������Ӻ��β�ѯ
				return splitHalf(array, searchData, index + 1, end);

			} else {
				// ��ѯǰ���
				return splitHalf(array, searchData, start, index - 1);
			}
		}

	}

}












