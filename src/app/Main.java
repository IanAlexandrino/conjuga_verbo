package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        VerboAr vAr = new VerboAr("", "");
        VerboEr vEr = new VerboEr("", "");
        VerboIr vIr = new VerboIr("", "");
        int op = 0;
        String radical;
        String sufixo;
        String verbo;

        do {
            System.out.println("====================================");
            System.out.println("================MENU================");
            System.out.println("========CONJUGADOR DE VERBO=========");
            System.out.println("====================================");

            System.out.println("\n1. Conjugar verbo");
            System.out.println("2. Sair do programa");

            System.out.println("Opção: ");
            op = entrada.nextInt();

            if (op == 1){
                System.out.println("Digite o verbo que você quer conjugar:");
                verbo = entrada.next();

                sufixo = verbo.substring(verbo.length() - 2, verbo.length());
                radical = verbo.substring(0, verbo.length() -2);

                switch (sufixo){
                    case "ar":
                        vAr.setRadical(radical);
                        vAr.setSufixo(sufixo);
                        vAr.Conjulgar();
                        break;
                    case "er":
                        vEr.setRadical(radical);
                        vEr.setSufixo(sufixo);
                        vEr.Conjulgar();
                        break;
                    case "ir":
                        vIr.setRadical(radical);
                        vIr.setSufixo(sufixo);
                        vIr.Conjulgar();
                        break;
                }

            }else if (op < 1 | op > 2){
                System.out.println("\nOpção inválida, por favor digite uma opção válida!\n");
            }else{
                System.out.println("Até a próxima!!!");
                return;
            }


        } while (op != 2);

    }
}
