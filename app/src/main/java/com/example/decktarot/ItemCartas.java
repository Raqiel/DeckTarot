package com.example.decktarot;

public class ItemCartas {

    int imagemID;
    String nome;
    String texto;


    public ItemCartas(String nome, int imagemID, String texto) {
        this.nome = nome;
        this.imagemID = imagemID;
        this.texto = texto;
    }

    public int getImagemID(){
        return imagemID;
    }

    public String getNome(){
        return nome;
    }

    public String getTexto(){
        return texto;
    }

    public void setImagemID(int imagemID){
        this.imagemID = imagemID;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }


}
