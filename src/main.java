import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Atividade 1
		int NUMINT1 = 5;
		double NUMDEC1 = 2.5;
		String NUMTEXT1 = "LINGUAGEM";
		int NUMINT2 = 10;
		int NUMINT3 = 3;
		double NUMDEC2 = 7.2;
		String NUMTEXT2 = "JAVA";
		int NUMINT4 = NUMINT1++;
		int NUMINT5 = NUMINT4--;

		// Atividade 2
		System.out.println(NUMDEC1);
		System.out.println(NUMTEXT1 + NUMTEXT2);
		System.out.println(NUMTEXT2 + String.valueOf(NUMDEC2));

		// Atividade 3
		boolean AT3 = (NUMINT1 > NUMDEC1);
		System.out.println(AT3);// true
		AT3 = (NUMINT1 >= NUMINT5);
		System.out.println(AT3);// true
		AT3 = (NUMINT2 < NUMINT3);
		System.out.println(AT3);// false
		AT3 = ((NUMINT1 + NUMINT5) == NUMINT2);
		System.out.println(AT3);// false
		AT3 = ((NUMINT2 <= NUMINT3) || (NUMINT1 > NUMDEC1));
		System.out.println(AT3);// true
		AT3 = ((NUMINT5 > NUMINT4) && (NUMDEC1 < NUMDEC2));
		System.out.println(AT3);// true
		AT3 = (!((NUMINT2 <= NUMINT3) && (NUMINT1 > NUMDEC1)));
		System.out.println(AT3);// true
		AT3 = (!((NUMINT5 > NUMINT4) || (NUMDEC1 < NUMDEC2)));
		System.out.println(AT3);// false

		// Atividade 4
		// A
		// Código 0001 e Código 0002
		if (NUMINT1 > NUMDEC1) {
			System.out.println("Código 0001");
		}
		if (NUMINT1 >= NUMINT5) {
			System.out.println("Código 0002");
		}
		if (NUMINT2 < NUMINT3) {
			System.out.println("Código 0003");
		}

		// B
		// Código 0012
		if (NUMINT2 < NUMINT3) {
			System.out.println("Código 0011");
		} else {
			System.out.println("Código 0012");
		}

		// C
		// Código 0100
		if (NUMINT1 >= NUMINT5) {
			System.out.println("Código 0100");
		} else if (NUMINT2 < NUMINT3) {
			System.out.println("Código 0200");
		} else if ((NUMINT1 + NUMINT5) == NUMINT2) {
			System.out.println("Código 0300");
		} else {
			System.out.println("Código0400");
		}

		// D
		// Código 1000
		if ((NUMINT5 > NUMINT4) && (NUMDEC1 < NUMDEC2)) {
			System.out.println("Código 1000");
		} else if (!((NUMINT2 <= NUMINT3) && (NUMINT1 > NUMDEC1))) {
			System.out.println("Código 2000");
		} else if (!((NUMINT5 > NUMINT4) || (NUMDEC1 < NUMDEC2))) {// negação fora da assinatura (faltava um parentese,
			System.out.println("Código 3000");
		} else {
			System.out.println("Código 4000");
		}

		// Atividade 5
		NUMINT1 = leia.nextInt();
		NUMDEC1 = leia.nextDouble();
		NUMTEXT1 = leia.next();

		// Atividade 6
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// Atividade 7
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Atividade 8
		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Atividade 9
		for (i = 1; i <= 30; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// Atividade 10
		int j = 0;
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				System.out.println(i * j);
			}
			j = 0;
		}
	}

	// Atividade 11
	// Nas atividades
	public int SOMA10(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8,
			int param9, int param10) {

		return param1 + param2 + param3 + param4 + param5 + param6 + param7 + param8 + param9 + param10;
	}

	// Atividade 12
	public int MULT10(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8,
			int param9, int param10) {
		return param1 * param2 * param3 * param4 * param5 * param6 * param7 * param8 * param9 * param10;
	}

	// Atividade 13
	public int MEDIA4(int param1, int param2, int param3, int param4) {
		int total = param1 + param2 + param3 + param4;
		int media = total / 4;
		return media;
	}

	// Atividade 14
	// Nesta atividade, assumi o 0 como positivo, para facilitar o código.
	public boolean POSOUNEG() {
		Scanner leia = new Scanner(System.in);
		int valor = leia.nextInt();
		boolean teste = true;

		if (valor < 0) {
			teste = false;
		}
		return teste;
	}

	// Atividade 15
	public boolean PAROUIMPAR() {
		Scanner leia = new Scanner(System.in);
		int valor = leia.nextInt();
		boolean teste = true;

		if (valor % 2 != 0) {
			teste = false;
		}
		return teste;
	}

	// Atividade 16
	// Nessa atividade desconsiderei anos bisextos e considerei mes de 30 dias.
	public int IDADE(int anos, int meses, int dias) {
		anos = anos * 365;
		meses = meses * 30;
		return anos + meses + dias;
	}

	// Atividade 17
	public void CRESCENTE3(int param1, int param2, int param3) {
		int lista[] = { param1, param2, param3 }, temp;

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i] + " ");
		}
	}

	// Atividade 18
	public void DECRESCENTE3(int param1, int param2, int param3) {
		int lista[] = { param1, param2, param3 }, temp;

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] < lista[j + 1]) {
					temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i] + " ");
		}
	}

	// Atividade 19
	public void ANTERIORES(int param) {
		for (int i=param; i >= 0;i--) {
			System.out.println(i + " ");}
	}
	
	//Atividade 20
	public void CONCAT() {
		Scanner leia = new Scanner(System.in);
		String param1= leia.nextLine();
		String param2= leia.nextLine();
		String param3= leia.nextLine();
		System.out.println(param1 + param2 + param3);
	}
}