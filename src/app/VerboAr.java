package app;

public class VerboAr extends Verbo{
    public VerboAr(String _radical, String _sufixo) {
        super(_radical, _sufixo);
    }

    public void Conjulgar(){
        System.out.println("\nEu " + radical + "o");
        System.out.println("Tu " + radical + "as");
        System.out.println("Ele/Ela " + radical + "a");
        System.out.println("Nós " + radical + "amos");
        System.out.println("Vós " + radical + "ais");
        System.out.println("Eles/Elas " + radical + "am\n");
    }
}
