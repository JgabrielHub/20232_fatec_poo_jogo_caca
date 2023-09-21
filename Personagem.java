public class Personagem {

    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamento (métodos)
    void cacar(){
        System.out.println(nome + " Caçando...");
    }
    void comer(){
        System.out.println(nome + " Comendo...");
    }
    void dormir(){
        System.out.println(nome + " Dormindo...");
    }
}
