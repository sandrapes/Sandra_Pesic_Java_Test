package Sandra_Pesic_JavaTest;

public class Zadatak1 {


    //1. [40] Napisati funkciju najmanjiOdCetiri koja prima 4 niza celih brojeva i
    //vraca najmanji broj medju ta 4 prosledjena niza.
    //Primer a)
    //1 Input : [1, 2, 3, 4, 5], [6, 7, -1, 0], [9, 10] ,[11 , 12]
    //2 Output : -1


    public static int najmanjiOdCetiri (int[] niz1, int[] niz2, int[] niz3, int[] niz4) {

        int najmanji = Integer.MAX_VALUE;

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] < najmanji)
                najmanji = niz1[i];

        }
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] < najmanji)
                najmanji = niz2[i];

        }
        for (int i = 0; i < niz3.length; i++) {
            if (niz3[i] < najmanji)
                najmanji = niz3[i];

        }
        for (int i = 0; i < niz4.length; i++) {
            if (niz4[i] < najmanji)
                najmanji = niz4[i];

        }

        System.out.println("Najmanji element sva 4 niza je: ");
        return najmanji;


    }

    public static void main(String[] args) {

        int[] niz1 = {1, 2, 14};
        int[] niz2 = {-10, 15, 3, 4};
        int[] niz3 = {5, 7};
        int[] niz4 = {9, 2, 10, 15, 48};


        System.out.println(najmanjiOdCetiri(niz1, niz2, niz3, niz4));


    }


}
