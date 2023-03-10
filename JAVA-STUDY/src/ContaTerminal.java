import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite o seu cpf: ");
        String cpf = scanner.next();
        System.out.println("Conta criada com sucesso. Seja bem vindo, " + nome + "!");
    }
}
