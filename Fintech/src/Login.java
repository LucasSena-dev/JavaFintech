import java.util.Scanner;

public class Login {
    String emailLogin;
    String passwordLogin;
    Register register = new Register();

    public Login(){}

    public Login(String email, String password){
        this.emailLogin = email;
        this.passwordLogin = password;
    }

    public void doLogin(Scanner sc){
            System.out.println("Digite o seu email: ");
            this.emailLogin = sc.nextLine();
            System.out.println("Digite a sua senha: ");
            this.passwordLogin = sc.nextLine();

            System.out.println("Logado!");
    }
}
