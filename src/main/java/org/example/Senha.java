package org.example;

public class Senha {
    private String conteudo;
    private int forca;

    public Senha(String conteudo){
        setConteudo(conteudo);
    }

    private void setConteudo(String conteudo) {
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        if(conteudo.length() < 10){ // verificar menos que 10
            System.out.println("Senha com menos que 10 carecteres");
        }
        if(conteudo.length() > 30){ // verificar mais de 30
            System.out.println("Senha com mais que 30 carecteres");
        }
        for(int i = 0; i < conteudo.length(); i++){ // verificar uma letra maiuscula
            char c = conteudo.charAt(i);
            if(Character.isUpperCase(c)){
                temMaiuscula = true;
            }
        }
        for(int i = 0; i < conteudo.length(); i++){ // verificar uma letra minuscula
            char c = conteudo.charAt(i);
            if(Character.isLowerCase(c)){
                temMinuscula = true;
            }
        }
        for(int i = 0; i < conteudo.length(); i++){ // verificar um numero
            char c = conteudo.charAt(i);
            if(){

            }
        }

        for(int i = 0; i < conteudo.length(); i++){ // verificar um caracter especial

        }
    }

    public int forcaSenha(String conteudo){
        int i;
        for(i = 0; i < conteudo.length(); i++){ // verifica a quantidade de letras da String

        }



        if(i == 10){
            forca = 75;
        }

        if(i == 30){
            forca = 100;
        }

        return forca;
    }

    public void alterarSenha(){

    }
}
