package desafioDev;

public class QuickSort {
	
	static int trocas = 0;

	public static Result QuickSortt(int[] array, int start, int end) {
		if (start < end) {
			int pivot = particao(array, start, end);
			QuickSortt(array, start, pivot);
			QuickSortt(array, pivot + 1, end);
		}
		return new Result(array, trocas);
	}

	static int particao(int[] array, int start, int end) {
		int p = array[(start + end) / 2];
		int left = start - 1;
		int right = end + 1;

		while (true) {
			do {
				left++;
			} while (array[left] < p);
			do {
				right--;
			} while (array[right] > p);
			if (left >= right) {
				return right;
			}

			int aux = array[left];
			array[left] = array[right];
			array[right] = aux;
			trocas++;
		}
	}
}
