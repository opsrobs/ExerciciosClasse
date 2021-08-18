package com.company;

import javax.swing.*;

import java.util.ArrayList;


public class Artigo {
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

    public float getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    public int validador (){
        int num;
        int val=3;
        num= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos que gostaria de informar ou 0(zero) para usar a quantidade padrão(3):"));
        if (num>0)
            val=num;
        return val;

    }

    public static String capturarNomeArtigo() {
        String nome;
        nome = JOptionPane.showInputDialog("Informe o nome do produto");
        return nome;
    }
    public static float capturarPrecoArtigo(String prod) {
        float preco;
        preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do "+prod));
        return preco;
    }
    public static float capturarDescontoartigo(String prod){
        float desc;
        desc = Float.parseFloat(JOptionPane.showInputDialog("Informe a porcentagem do desconto do "+prod));
        return desc;
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
        artigo.setPrecoFinal(artigo.calcularprecoFinal());
    }
    public String prod(){
        return  "\n O artigo comprado foi: "+artigo.getNomeArtigo()+
                "\n O preço pago pelo "+artigo.getNomeArtigo()+" foi: "+artigo.getPreco()+"R$"+
                "\n O Desconto dado foi de: "+ artigo.getPercentual()+" %"+
                "\n O valor final do "+artigo.getNomeArtigo() +" foi de: "+artigo.getPrecoFinal()+"R$"+
                "\n----------------------------------------";

    }
}