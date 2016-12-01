
public class Find {
	public static void main(String[] args) {
		int[] array = new int[1000000];

		for (int i = 0; i < 1000000; i++) {
			array[i] = (int) (Math.random() * 1000000);
			System.out.println(array[i]);
		}
		long startTime = System.nanoTime();
		inputIndex(splitHalf(array, 873180, 0, array.length));
		long endTime = System.nanoTime();
		System.out.println("Time=" + (endTime - startTime));

	}

	public static void inputIndex(int x) {
		x += 1;
		System.out.println("查询的位置为=" + x);
	}

	/**
	 * 折半查找
	 * 
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
				// 如果查找数字大于中间数字则从后半段查询
				return splitHalf(array, searchData, index + 1, end);

			} else {
				// 查询前半段
				return splitHalf(array, searchData, start, index - 1);
			}
		}

	}

	public static int splitHalfOtherWay(int[] array, int searchData, int start, int end) {
		while (1 > 0) {
			int index = (start + end) / 2;
			int data = array[index];
			if (start > end) {
				return -1;
			}
			if (array[index] == searchData) {
				return index;
			} else {
				if (searchData > data) {
					// 如果查找数字大于中间数字则从后半段查询
					start = index + 1;
					// return splitHalf(array, searchData, index + 1, end);
				} else {
					// 查询前半段
					end = index - 1;
					// return splitHalf(array, searchData, start, index - 1);
				}
			}
		}

	}

}
