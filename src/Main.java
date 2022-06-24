public class Main {
    public static void main(String[] args) {
        int clientAccount = 20_000;
        int payment = 15000;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = clientAccount + payment + bonus;
        System.out.println("На счете: " + clientAccount);
        System.out.println("Бонус: " + bonus );


    }
}
