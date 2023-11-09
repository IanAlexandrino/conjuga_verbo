package app;

public class VerboEr extends Verbo{

    public VerboEr(String _radical, String _sufixo) {
        super(_radical, _sufixo);
    }

    public void Conjulgar(){
        System.out.println("\nEu " + radical + "o");
        System.out.println("Tu " + radical + "es");
        System.out.println("Ele/Ela " + radical + "e");
        System.out.println("Nós " + radical + "emos");
        System.out.println("Vós " + radical + "eis");
        System.out.println("Eles/Elas " + radical + "em\n");
    }
}
