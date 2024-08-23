import java.util.Scanner;

public class Login {
    String emailLogin;
    String passwordLogin;

    public Login(String email, String password){
        this.emailLogin = email;
        this.passwordLogin = password;
    }

    public Login() {

    }

    public void doLogin(Scanner sc){
            System.out.println("Digite o seu email: ");
            this.emailLogin = sc.nextLine();
            System.out.println("Digite a sua senha: ");
            this.passwordLogin = sc.nextLine();

            System.out.println("Logado!");
    }
}
