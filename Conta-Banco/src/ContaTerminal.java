import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO; Conhecer e importar a classe Scanner

        // Exibr as mensagens para o nosso usuário

        // Obter oela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada .
        Scanner scanner = new Scanner(System.in);
        String nome; 
        String sobreNome;
        int numeroConta;
        int valorDeposito;
        int agencia = 1234;


        System.out.println("Olá, seja muito bem vindo ao Valbank"); 
        
        System.out.println("Para darmos incíco a abertura de sua conta, por gentileza digite o seu primeiro nome:");
        nome = scanner.next();
        
        System.out.println("Digite seu sobrenome :");
        sobreNome = scanner.next();

        System.out.println("Agora escola 4 digitos não sequênciais para serem o numero da sua nova conta :");
        numeroConta = scanner.nextInt();

        System.out.println("Escola uma valor incial para depósito:");
        valorDeposito = scanner.nextInt();

        System.out.println("Olá " + nome + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é :" + agencia);
        System.out.println("Conta :" + numeroConta + " e seu saldo :" + valorDeposito + " já está disponível para saque");



    }
}
