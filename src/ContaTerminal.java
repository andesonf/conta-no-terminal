package ContaTerminal.src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o numero da conta ! ");                        
        String conta = scanner.next();
        conta.replaceAll("-", "");
           int modificador = Integer.parseInt(conta); 
         
        System.out.println("por favor, digite o numero da agencia ! ");
        int agencia = scanner.nextInt();
        
        System.out.println("por favor digite seu nome !");
        String nomeCliente =  scanner.next();
        
        System.out.println("quanto deseje trazer da outra conta ?");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ nomeCliente+"!" + " obrigado por criar uma conta em nosso banco." );
        System.out.println("Sua agência é: "+ agencia+ " conta: "+numero+ ", seu saldo é: "+ saldo + " e já está disponivel para saque.");
    }
}