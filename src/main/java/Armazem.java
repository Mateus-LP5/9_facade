public class Armazem extends Restaurante {

    private static Armazem armazem = new Armazem();

    private Armazem() {};

    public static Armazem getInstancia(){
        return armazem;
    }
}
