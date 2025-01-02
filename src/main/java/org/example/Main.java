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
        String senha0 = scanner.nextLine();
        verifica.setSenha0(senha0);
        System.out.println("Repita a senha:");
        String senha1 = scanner.nextLine();
        verifica.setSenha1(senha1);
        verifica.validarSenha(senha0, senha1);
    }
    }