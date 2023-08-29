import java.util.Scanner;
public class JavaWhile {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int voto;
        int pre1=0;
        int pre2=0;
        int pre3=0;
        int pre4=0;
        int branco=0;
        
        System.out.println("Bem vindo as Eleições mais epicas de todos os tempos\nDigite de 1 a 4 para escolher seu presidente, 5 para votar em branco, 0 para sair");
        
        do{
            System.out.print("Digite seu voto: ");
            voto=ler.nextInt();
            
            switch(voto){
                case 1:
                    System.out.println("Voto contabilizado!!!");
                    pre1++;
                    break;
                case 2:
                    System.out.println("Voto contabilizado!!!");
                    pre2++;
                    break;
                case 3:
                    System.out.println("Voto contabilizado!!!");
                    pre3++;
                    break;
                case 4:
                    System.out.println("Voto contabilizado!!!");
                    pre4++;
                    break;
                case 5:
                    System.out.println("Voto contabilizado!!!");
                    branco++;
                    break;
            }
        } while(voto!=0);
        
        System.out.println("||RESULTADOS||");
        System.out.println("Presidente 1: " + pre1);
        System.out.println("Presidente 2: " + pre2);
        System.out.println("Presidente 3: " + pre3);
        System.out.println("Presidente 4: " + pre4);
        System.out.println("Votos em Branco: " + branco);
    }
}
