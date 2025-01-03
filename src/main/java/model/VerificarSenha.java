package model;

import java.util.Scanner;

public class VerificarSenha {
    private String usuario;
    private String senhaPrincipal ;
    private String senhaDeConfirmacao;


    public VerificarSenha() {
    }

    public VerificarSenha(
            String usuario,
            String senhaPrincipal,
            String senhaDeConfirmacao
            ){
            this.usuario = usuario;
            this.senhaPrincipal = senhaPrincipal;
            this.senhaDeConfirmacao = senhaDeConfirmacao;

    }

    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getsenhaPrincipal (){
        return this.senhaPrincipal;
    }
    public void setsenhaPrincipal(String senhaPrincipal){
        this.senhaPrincipal = senhaPrincipal;
    }

    public String getsenhaDeConfirmacao (){
        return this.senhaDeConfirmacao;

    }
    public void setsenhaDeConfirmacao(String senhaDeConfirmacao){
        this.senhaDeConfirmacao = senhaDeConfirmacao;

    }
    public void validarSenha(String senhaPrincipal, String senhaDeConfirmacao){
        Scanner scanner = new Scanner(System.in);
        while (!senhaPrincipal.equals(senhaDeConfirmacao)) {
            System.out.println("Senhas diferentes." );
            System.out.println("Tente novamente.");
            System.out.print("Digite uma nova senha: ");
            senhaPrincipal = scanner.nextLine();
            System.out.print("Repita a senha: ");
            senhaDeConfirmacao = scanner.nextLine();
        }

            System.out.println("Senha confirmada com sucesso.");
            scanner.close(); // Fechar o Scanner

        }
}