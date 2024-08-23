import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        Register register = new Register();

        while (true) {
            menu();

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1){
                login.doLogin(sc);
                break;
            }

            else if (op == 2) {
                System.out.println("Digite seu email: ");
                String email = sc.next() + sc.nextLine();
                System.out.print("Digite o seu CPF: ");
                String cpf = sc.next();
                System.out.println("Digite sua senha: ");
                String password = sc.next() + sc.nextLine();
                System.out.println("Digite para confirmar sua senha: ");
                String confirmPassword = sc.next() + sc.nextLine();

                register = new Register(email, password, confirmPassword, cpf);

                if (register.doRegister(sc)) {
                    continue;
                }
            }
            else if (op == 0) {
                System.out.println("Saindo do programa...");
                break;
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void menu() {
        System.out.println("Bem-vindo(a) ao Fintech");
        System.out.println("1- Login");
        System.out.println("2- Cadastrar");
        System.out.println("0- Sair");
    }
}
