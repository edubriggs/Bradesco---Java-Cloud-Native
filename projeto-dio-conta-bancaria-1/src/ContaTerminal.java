import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, Digite seu numero da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite sua agencia: ");
		String agencia = sc.nextLine();
		
		System.out.println("Digite seu nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		sc.close();
		System.out.println("Olá " + nomeCliente + 
				", Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " +
				numero + " e seu saldo R$: " + saldo + "já está disponível para saque");
		
}
}
