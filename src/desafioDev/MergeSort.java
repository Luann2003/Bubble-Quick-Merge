package desafioDev;

public class MergeSort {

	static int trocas = 0;

	static Result mergeSort(int[] v, int[] aux, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(v, aux, start, mid);
			mergeSort(v, aux, mid + 1, end);
			mesclar(v, aux, start, mid, end);
		}
		
		return new Result(v, trocas);
	}

	static void mesclar(int[] v, int[] aux, int start, int mid, int end) {		

		for (int k = start; k <= end; k++)
			aux[k] = v[k];

		int i = start;
		int j = mid + 1;

		for (int k = start; k <= end; k++) {
			if (i > mid) {
				v[k] = aux[j++];
				trocas++;
			} else if (j > end) {
				v[k] = aux[i++];
				trocas++;
			} else if (aux[i] < aux[j]) {
				v[k] = aux[i++];
				trocas++;
			} else {
				v[k] = aux[j++];
				trocas++;
			}
		}

	}
}
