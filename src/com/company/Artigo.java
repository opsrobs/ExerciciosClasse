package com.company;

import javax.swing.*;
import static com.company.ChamadasArtigos.*;

import java.util.ArrayList;


public class Artigo{
    private String nomeArtigo;
    private float preco;
    private float percentual;
    private float precoFinal;


    public String getNomeArtigo() {
        return nomeArtigo;
    }

    public void setNomeArtigo(String nomeArtigo) {
        this.nomeArtigo = nomeArtigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }


    public float calcularprecoFinal(){
        float precoFinalProduto;
        float desc=this.getPercentual()/100;
        precoFinalProduto = this.getPreco()-(desc*this.getPreco());
        return precoFinalProduto;
    }

    Artigo artigo;
    public  void lista(){
        int condicao = validador();
        ArrayList<String> compras =new ArrayList<>();
        while (compras.size()<condicao){
            artigo =new Artigo();
            preenchendoArtigo();
            compras.add(prod());
        }
        System.out.println(compras);
    }

    public void preenchendoArtigo(){
        artigo.setNomeArtigo(capturarNomeArtigo());
        artigo.setPreco(capturarPrecoArtigo(artigo.getNomeArtigo()));
        artigo.setPercentual(capturarDescontoartigo(artigo.getNomeArtigo()));
        artigo.calcularprecoFinal();
    }
    public String prod(){
        return  "\n O artigo comprado foi: "+artigo.getNomeArtigo()+
                "\n O preço pago pelo "+artigo.getNomeArtigo()+" foi: "+artigo.getPreco()+"R$"+
                "\n O Desconto dado foi de: "+ artigo.getPercentual()+" %"+
                "\n O valor final do "+artigo.getNomeArtigo() +" foi de: "+artigo.calcularprecoFinal()+"R$"+
                "\n O total do desconto da compra foi: "+ (artigo.getPreco()-artigo.calcularprecoFinal())+
                "\n----------------------------------------";

    }
}