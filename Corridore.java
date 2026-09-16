import java.util.Random;

// La classe Corridore estende Thread per poter essere eseguita in parallelo
public class Corridore extends Thread {
    private String nome;

    // Costruttore per assegnare il nome al corridore
    public Corridore(String nome) {
        this.nome = nome;
    }

    // Il metodo run contiene il codice che il thread eseguirà
    @Override
    public void run() {
        Random random = new Random();

        // Ciclo da 1 a 5 passi
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + " ha fatto il passo " + i);
            
            try {
                // Genera una pausa casuale tra 200 e 800 millisecondi
                // random.nextInt(601) genera un numero da 0 a 600, + 200 fa da 200 a 800
                int pausa = random.nextInt(601) + 200; 
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println(nome + " è stato interrotto!");
            }
        }
        
        // Messaggio finale al traguardo
        System.out.println("🚩 " + nome + " HA TAGLIATO IL TRAGUARDO!");
    }
}
