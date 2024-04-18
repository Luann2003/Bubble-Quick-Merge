package desafioDev;

public class Result {

	private int vetor[];
	private int trocas;
	
	public Result(int[] vetor, int trocas) {
		this.vetor = vetor;
		this.trocas = trocas;
	}

	public int[] getVetor() {
		return vetor;
	}

	public int getTrocas() {
		return trocas;
	}

}
