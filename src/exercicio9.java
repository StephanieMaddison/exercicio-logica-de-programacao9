
public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totaleleitor = 1000;
		int votosnulos = 500;
		int votosbrancos = 250;
		int votosvalidos = 250;

		int me = metodo.percbrancos(votosbrancos, totaleleitor);
		int meto = metodo.percnulos(votosnulos, totaleleitor);
		int metod = metodo.percvalidos(votosvalidos, totaleleitor);

		System.out.println("Porcentagem de votos brancos é " + me + "%");

		System.out.println("Porcentagem de votos nulos é " + meto + "%");

		System.out.println("Porcentagem de votos validos é " + metod + "%");

	}
}
