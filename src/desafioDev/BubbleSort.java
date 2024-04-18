package desafioDev;

public class BubbleSort {
	
	public static Result Bubble(int v[]) {
		int cont = 0;
		for(int i = 0; i<v.length; i++) {
			for(int j = 0; j < v.length - i - 1; j++) {
				if(v[j] > v[j+1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
					cont++;
				}	
			}
		}
		return new Result(v, cont);
	}
}
