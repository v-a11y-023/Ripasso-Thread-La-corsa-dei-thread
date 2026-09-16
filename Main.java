public class Main {
    public static void main(String[] args) {
        // Creazione dei due corridori (thread)
        Corridore corridoreA = new Corridore("Corridore A");
        Corridore corridoreB = new Corridore("Corridore B");

        System.out.println("🏁 La gara sta per iniziare... VIA!");

        // Avvio dei thread con .start() (NON usare .run() direttamente!)
        corridoreA.start();
        corridoreB.start();

        try {
            // Il Main aspetta che entrambi i thread abbiano finito
            corridoreA.join();
            corridoreB.join();
        } catch (InterruptedException e) {
            System.out.println("Il thread principale è stato interrotto.");
        }

        // Questo messaggio apparirà SOLO dopo che entrambi sono arrivati
        System.out.println("\n🏆 Gara terminata!");
    }
}

