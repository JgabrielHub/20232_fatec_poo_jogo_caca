import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "john";
        var soneca = new Personagem();
        //nasce com muito sono
        //10% chace de caçar
        //10% chance de comer
        soneca.nome = "Soneca";
        soneca.sono = 10;
        soneca.energia = 0;
        soneca.fome = 1;
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
                System.out.printf(
                "e: %d, f: %d, s %d\n",
                personagem.energia,
                personagem.fome,
                personagem.sono
                );
            System.out.println("-------------");
            var oQueSonecaVaiFazer = gerador.nextDouble(1);
            if (oQueSonecaVaiFazer <=0.8) {
                soneca.dormir();;
            }else if(oQueSonecaVaiFazer <= 0.9){
                soneca.comer();
            }else{
                soneca.cacar();
            }
                System.out.printf(
                "e: %d, f: %d, s %d\n",
                soneca.energia,
                soneca.fome,
                soneca.sono
                );
            System.out.println("*************");

            Thread.sleep(8000);
            
        }
    }
}
