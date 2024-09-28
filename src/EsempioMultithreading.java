class ThreadEsempio extends Thread {
    private String messaggio;
/*
* Threading è un concetto che permette di eseguire più operazioni contemporaneamente nel tuo programma. È utile per migliorare l'efficienza, soprattutto in applicazioni che richiedono operazioni di I/O, come il caricamento di dati o il trattamento di richieste da più utenti.

Concetti Chiave:

    Thread: Un'unità di esecuzione. Ogni thread può eseguire un compito indipendentemente dagli altri.
    Sincronizzazione: Quando più thread accedono a risorse condivise, è importante gestire correttamente l'accesso per evitare conflitti.
    Runnable Interface: Per creare un thread, puoi implementare l'interfaccia Runnable e sovrascrivere il metodo run().
* */
    public ThreadEsempio(String messaggio) {
        this.messaggio = messaggio;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(messaggio);
            try {
                Thread.sleep(500); // Pausa di 500 millisecondi
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto.");
            }
        }
    }
}

public class EsempioMultithreading {
    public static void main(String[] args) {
        ThreadEsempio thread1 = new ThreadEsempio("Ciao dal Thread 1!");
        ThreadEsempio thread2 = new ThreadEsempio("Ciao dal Thread 2!");

        thread1.start();
        thread2.start();
    }
}
