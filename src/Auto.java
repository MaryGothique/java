public class Auto {
    public static void main(String[] args) {

    }
    private String marca;
    private String modello;
    private int anno;

    public Auto(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public void mostraInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno: " + anno);
    }
}
