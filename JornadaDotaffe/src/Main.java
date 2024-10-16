public class Main {
    public static void main(String[] args) {
        Taffe taffe = new Taffe();
        taffe.dizerOi();
        String fala = taffe.dizerOi();
        System.out.println(fala);
        taffe.falar("Gremio ");
        taffe.falar("Aprendendo Classes em Java");

        taffe.andar(10, true);
        taffe.andar(10,true);
        taffe.andar(52,false);
        taffe.andar(30,false);
        taffe.retornarposicao();

        Taffe patrick = new  Taffe();
        patrick.andar(20, true);
        patrick.retornarposicao();
    }
}