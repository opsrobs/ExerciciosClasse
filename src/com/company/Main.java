package com.company;

import java.util.ArrayList;

import static com.company.Artigo.capturarDescontoartigo;
import static com.company.Artigo.capturarPrecoArtigo;

public class Main {

    public static void main(String[] args) {
        Artigo artigo = new Artigo();

        artigo.lista();


//        String cadastro;
//        ArrayList<String> compra = new ArrayList<>();
//
//        artigo.setNomeArtigo(artigo.capturarNomeArtigo());
//        artigo.setPreco(capturarPrecoArtigo(artigo.getNomeArtigo()));
//        artigo.setPercentual(capturarDescontoartigo(artigo.getNomeArtigo()));
//        artigo.setPrecoFinal(artigo.calcularprecoFinal(artigo.getPreco(),artigo.getPercentual()));
//        System.out.println(
//                " O artigo comprado foi: "+artigo.getNomeArtigo()+
//                "\n O preço pago pelo "+artigo.getNomeArtigo()+" foi: "+artigo.getPreco()+
//                "\n O Desconto dado foi de "+ artigo.getPercentual()+" %"+
//                "\n O valor final do "+artigo.getNomeArtigo() +" foi de: "+artigo.getPrecoFinal());


    }
}
