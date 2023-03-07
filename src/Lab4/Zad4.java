package Lab4;

class Tabliczka{
	int[][] dostepne = new int[15][15];
	void wypelnijCzesc() {
		for(int i=0; i<15; i++) {
			dostepne[0][i] = i;
			dostepne[i][0] = i;
		}
	}
	void mnozenie() {
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				dostepne[i][j] = dostepne[i][0] * dostepne[0][j];
			}
		}
	}
	void wyswietlanie() {
		for(int i=0; i<15; i++) {
			for(int j=0; j<15; j++) {
				System.out.print(dostepne[i][j]+"\t|  ");
			}
			System.out.println();
		}
	}
}

public class Zad4 {
	public static void main(String[] args) {
		Tabliczka obiekt = new Tabliczka();
		obiekt.wypelnijCzesc();
		obiekt.mnozenie();
		obiekt.wyswietlanie();
	}
}
