import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var personagem = new Personagem("John");
        var soneca = new Personagem("Soneca",10,0,0);
        //nasce com muito sono
        //10% chace de caçar
        //10% chance de comer
        while(true){
            int oQueFazer = gerador.nextInt(3); //[0,3]
            switch(oQueFazer){
                case 1:
                    personagem.cacar();
                case 2:
                    personagem.comer();
                case 3:
                    personagem.dormir();
                break;
            }
            personagem.exibirEstado();
            System.out.println("-------------");
            var oQueSonecaVaiFazer = gerador.nextDouble(1);
            if (oQueSonecaVaiFazer <=0.8) {
                soneca.dormir();;
            }else if(oQueSonecaVaiFazer <= 0.9){
                soneca.comer();
            }else{
                soneca.cacar();
            }
            soneca.exibirEstado();
            System.out.println("*************");

            Thread.sleep(8000);
            
        }
    }
}
