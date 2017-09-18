import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by Bashi, Abdifatah Ali on 18.09.2017.
 */
public class Oppgave1_7 {
    public static void main(String[] args) {
        int[] tempArray = new int[]{66, 5, 33, -2, 33, 1, 33, 6};

        // print(tempArray);
        // min(tempArray);

        System.out.println(mode(tempArray));
        System.out.println(modus(tempArray));

        // System.out.println("Antall byttinger er: " + ombyttinger(randomArray(6)));

        //print(randomArray(5));
        // ombyttinger(randomArray(6));

    }

    public static int min(int[] inputArray) {
        if (inputArray.length < 1) {
            throw new NoSuchElementException("Tabellen er tom!");
        }
        for (int i = 0; i < inputArray.length - 1; i++) {

            for (int j = i + 1; j < inputArray.length; j++) {

                if (inputArray[i] > inputArray[j]) {
                    bytt(inputArray, i, j);

                }
            }


        }
        return inputArray[0];
    }


    public static int ombyttinger(int[] inputArray) {
        int antall = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < inputArray.length; j++) {

                if (inputArray[i] > inputArray[j]) {
                    min = j;
                    antall++;
                    bytt(inputArray, i, j);


                }

            }


        }
        return antall;
    }

    public static void bytt(int[] inputArray, int i, int j) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i]);
        }
    }
    //Metode som genererer random tabell elementer.


    public static int[] randomArray(int n) {
        int[] tempArray = new int[n];
        Random r = new Random();
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = r.nextInt(9);

        }
        return tempArray;
    }

    // Metode som finner modus tallet dvs. tallet som forekommer ofte.
    public static int modus(int[] a) {
        int modus = a[0];
        int maks = 0;
        for (int i = 0; i < a.length; i++) {
            int verdi = a[i];
            int antall = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == verdi) {
                    antall++;
                }
                if (antall > maks) {
                    modus = verdi;
                    maks = antall;
                }

            }

        }
        return modus;
    }


}