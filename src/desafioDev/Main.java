package desafioDev;

public class Main {

	public static void main(String[] args) {
		
		int vetor[] = new int[1000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = 	(int) Math.floor(Math.random() * vetor.length); 
		}
		
		Long inicio, fim;
		Result result;
		
		System.out.println("QuickSort");
		inicio = System.currentTimeMillis();
		result = QuickSort.QuickSortt(vetor.clone(), 0, vetor.length - 1);
		fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim-inicio) + "ms");
		System.out.println("Trocas: " + result.getTrocas());
		System.out.println();
		
		System.out.println("BublleSort");
		inicio = System.currentTimeMillis();
		result = BubbleSort.Bubble(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim-inicio) + "ms");
		System.out.println("Trocas: " + result.getTrocas());
		System.out.println();
		
		System.out.println("MergeSort");
		inicio = System.currentTimeMillis();
		result = MergeSort.mergeSort(vetor.clone(), vetor.clone(), 0, vetor.length-1);
		fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim-inicio) + "ms");
		System.out.println("Trocas: " + result.getTrocas());
		System.out.println();
		
	}

}
