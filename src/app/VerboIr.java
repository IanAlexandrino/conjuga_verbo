package app;

public class VerboIr extends Verbo{

    public VerboIr(String _radical, String _sufixo) {
        super(_radical, _sufixo);
    }

    public void Conjulgar(){
        System.out.println("\nEu " + radical + "o");
        System.out.println("Tu " + radical + "es");
        System.out.println("Ele/Ela " + radical + "e");
        System.out.println("Nós " + radical + "imos");
        System.out.println("Vós " + radical + "is");
        System.out.println("Eles/Elas " + radical + "em\n");
    }
}
