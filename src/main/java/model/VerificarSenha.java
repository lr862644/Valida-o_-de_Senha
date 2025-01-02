package model;

import java.util.Scanner;

public class VerificarSenha {
    private String usuario;
    private String senha0 ;
    private String senha1;


    public VerificarSenha() {
    }

    public VerificarSenha(
            String usuario,
            String senha0,
            String senha1
            ){
            this.usuario = usuario;
            this.senha0 = senha0;
            this.senha1 = senha1;

    }

    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getSenha0 (){
        return this.senha0;
    }
    public void setSenha0(String senha0){
        this.senha0 = senha0;
    }

    public String getSenha1 (){
        return this.senha1;

    }
    public void setSenha1(String senha1){
        this.senha1 = senha1;

    }
    public void validarSenha(String senha0, String senha1){
        Scanner scanner = new Scanner(System.in);
        while (!senha0.equals(senha1)) {
            System.out.println("Senhas diferentes. Tente novamente.");
            System.out.print("Digite uma nova senha: ");
            senha0 = scanner.nextLine();
            System.out.print("Repita a senha: ");
            senha1 = scanner.nextLine();
        }

            System.out.println("Senha confirmada com sucesso.");
            scanner.close(); // Fechar o Scanner

        }
}