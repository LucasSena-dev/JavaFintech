import java.util.Scanner;

public class Register {
    String email;
    String password;
    String confirmPassword;
    String cpf;

    public Register() {}

    public Register(String email, String password, String confirmPassword, String cpf) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.cpf = cpf;
    }

    public boolean doRegister(Scanner sc) {
        while (true) {
            if (password.equals(confirmPassword)) {
                System.out.println("Cadastro realizado com sucesso!");
                return true;
            }
            else {
                System.out.println("As senhas não são iguais. Digite novamente.");

                System.out.println("Digite sua senha: ");
                this.password = sc.next() + sc.nextLine();

                System.out.println("Digite para confirmar sua senha: ");
                this.confirmPassword = sc.next() + sc.nextLine();
                continue;
            }
        }
    }
}