package Sandra_Pesic_JavaTest;

public class Zadatak2 {

    //(a) [15] Napisati funkciju daLiSuIsti koja prima 3 niza realnih brojeva i
    //vraca odgovor na pitanje da li su oni medjusobno jednaki.

    public static boolean daLiSuIsti (double[] niz1, double[] niz2, double[] niz3) {

        boolean b = true;

        if (niz1.length == niz2.length && niz2.length == niz3.length) {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] != niz2[i] && niz2[i] != niz3[i]) {
                    b = false;
                    break;
                }

            }

        }
        else
            b = false;


        if (b) {
            System.out.println("Nizovi su medjusobno jednaki.");
        }

        else {
            System.out.println("Nizovi nisu medjusobno jednaki.");

        }

        return b;
    }


    // (b) [25] Napisati funkciju daLiSuIstiOgledalo koja prima 2 niza realnih
    //brojeva i vraca odgovor na pitanje da li su oni isti u slucaju kada drugi
    //niz posmatramo od pozadi.

    public static boolean daLiSuIstiOgledalo (double[] niz1, double[] niz2) {


        //double[] obrnutiNiz = new double [niz1.length];

        boolean b = true;

        if (niz1.length == niz2.length) {

            for (int i = niz1.length - 1; i >= 0 ; i--) {
                 if (niz1[i] == niz2[i])
                    System.out.println(niz2[i]);
                 b = true;

       }



        }
        else
            b = false;

return b;


    }











    public static void main(String[] args) {

        double[] niz1 = {0.2, 15, 14.2, 5.7, 2.3};
        double[] niz2 = {0.2, 15, 14.2, 5.7, 2.3};
        double[] niz3 = {0.2, 15, 14.2, 5.7, 2.3};

        System.out.println(daLiSuIstiOgledalo(niz1, niz2));
    }


}
