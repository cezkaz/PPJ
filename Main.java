
package cwiczenie;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);

         System.out.println("Podaj liczbê wierszy");

int w = in.nextInt();

 // Deklaracja tablicy i definicja liczby wierszy

int[][] tab = new int[w][];

// Tworzenie w ka¿dym wierszy odpowiedniej liczby kolumn

for(int i=0; i<tab.length; i++)

     tab[i]=new int[i+1];

  // Wype³nienie tablicy  

 for(int i=0; i<tab.length; i++)

     for (int j=0; j<tab[i].length; j++)

         tab[i][j]=0+j; 

  // Wyœwietlenie tablicy

 System.out.println("Wype³niona tablica:\n");

 for(int i=0; i<tab.length; i++){

     for (int j=0; j<tab[i].length; j++)

         System.out.print(tab[i][j]+ " ");

     System.out.println();
 }
  System.out.println();
}
}

