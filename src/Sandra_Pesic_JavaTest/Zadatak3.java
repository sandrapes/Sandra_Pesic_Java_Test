package Sandra_Pesic_JavaTest;

public class Zadatak3 {


    ///[25] Napisati funkciju prostiBrojevi koja za zadati ceo broj n, 2 < n ≤ 50,
    //ispisuje za svaki broj t, 2 ≤ t ≤ n poruku oblika:
    //1 "<t> je prost "; ako je t prost broj
    // 2 "<t> je slozen "; ako t nije prost broj
    //OBJASNJENJE:
    //Broj je prost ako je deljiv samo sa 1 i sa samim sobom.
    //Broj x je deljiv brojem y ako je ostatak operacije x/y jedank 0.



    public static void prostiBrojevi (int n) {

        for (int i = 3; i <= n; i++) {

            for (int j = 2; j <= n; j++) {
                if (i != j && i % j == 0) {
                        System.out.println( j + " je slozen");
                    }

                else if (i == j && i % j == 0) {
                    System.out.println(j + " je prost");
                }
                }

            }

        }


    public static void main(String[] args) {


        int a = 10;

        prostiBrojevi(a);
    }






}


