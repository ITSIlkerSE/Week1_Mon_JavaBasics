public class Boolean {

    public static void main(String[] args) {

        int bust = 24, rust = 26;
        double just = 5.5, hust = 5.5;
        double a = (just + rust);
        double b = (hust + bust);

        System.out.println( "Das Ergebnis von der double a ist " + a);
        System.out.println( "Das Ergebnis von der double b ist " + b);

        boolean lust = a == b;

        System.out.println(lust);

        if (a == b) {
            System.out.println("Die Werte sind in diesem Fall gleich");
        }
        else {
            System.out.println("Die Werte sind in diesem Fall nicht gleich");

        }
    }

}

