package Controller;

public class MultiporSoma {

	public MultiporSoma() {
		super();
		}
	
	public int MultiSoma (int a, int b) {
		if (a>0) { // enquanto não for zero significa que não esta "multiplicando por zero"
			return b + MultiSoma(a-1,b); // aqui vai somando a cada vez que "não esta sendo multiplicado por zero"
			} else {
				return 0; // retorna zero pois é o resultado conhecido já que "chegou a multiplicação por zero"
			}
	}
}
