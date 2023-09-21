public class Jogo {
    public static void main(String[] args) throws Exception{
        var personagem = new Personagem();
        personagem.nome = "john";
        while(true){
            personagem.cacar();
            personagem.comer();
            personagem.dormir();
            System.out.println("*************");
            
            Thread.sleep(8000);
            
        }
    }
}
