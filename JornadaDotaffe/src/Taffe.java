public class Taffe {

    public int numeracao;

    public String versao;
    public int posicaoAtual=0;


    public static String dizerOi(){
        return "oi pessoal";
    }
    public  void falar(String oqueFalar) {
        System.out.println(oqueFalar);
    }

    public  void andar (int quantidadePassos, boolean paraFrente){
        for (int i = 1 ; i <= quantidadePassos; i++){
            System.out.println("passo" + i);

        }
        if ( paraFrente== true) {

            posicaoAtual += quantidadePassos;
        }else {
            posicaoAtual -= quantidadePassos;
        }
    }
    public void retornarposicao(){
        System.out.println("Minha posição é " +posicaoAtual);
    }


    //mandar mensagem bravo
    //Dizer oi
    //dar um recado em sala
    //andar
    //falar
    //limpara a casa
    //cantar uma  musica
    // mudar idioma


}
