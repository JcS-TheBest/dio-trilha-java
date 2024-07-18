import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

     String Nome = "MARIO ANDRADE";
     int Conta = 1021;
     String Agencia = "067-8";
     double Saldo = 237.48;


     Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
            String Entrada1 = sc.nextLine();
        if (Entrada1 == Agencia){
            System.out.println("Digite sua conta!");
       };

     sc.close();
    }
}
