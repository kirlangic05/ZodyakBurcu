package KosulluIfadeler;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int A = 30;
        int B = 25;
        int C = 60;
        int D = 10;


        // == Operatörü
        System.out.println("Eşitlik denemeleri ==");
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(C == D);

        // !=  Eşit Değil Operatörü
        System.out.println("Eşit değil denemeleri != ");
        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(C != B);

        // > Büyüktür Operatörü
        System.out.println("Büyüktür denemeleri >");
        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);

        // >= Büyük-Eşittir Operatörü
        System.out.println("Büyük eşittir denemeleri >= ");
        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);

        // <  Küçüktür Operatörü
        System.out.println("Küçüktür denemeleri < ");
        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);


        // <= Küçük-Eşittir Operatörü
        System.out.println("Küçük eşittir denemeleri <= ");
        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);

    }
}
