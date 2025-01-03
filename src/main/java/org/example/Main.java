package org.example;
import model.VerificarSenha;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VerificarSenha verifica = new VerificarSenha();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre o usuario:");
        System.out.println("Digite o usuário:");
        String usuario = scanner.nextLine();
        verifica.setUsuario(usuario);
        System.out.println("Digite uma senha:");
        String senhaPrincipal = scanner.nextLine();
        verifica.setsenhaPrincipal(senhaPrincipal);
        System.out.println("Repita a senha:");
        String senhaDeConfirmacao = scanner.nextLine();
        verifica.setsenhaDeConfirmacao(senhaDeConfirmacao);
        verifica.validarSenha(senhaPrincipal, senhaDeConfirmacao);
    }
    }