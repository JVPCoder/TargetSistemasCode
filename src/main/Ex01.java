package main;

public class Ex01 {
	
	public static void main(String[] args) {
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		int resultado = imprimeSoma(indice,soma,k);
		
		System.out.println(resultado);
	}
	
	public static int imprimeSoma(int indice, int soma, int k) {
		while(k < indice) {
			k += 1;
			soma += k;
		}
		
		return soma;
	}
	
	
}
