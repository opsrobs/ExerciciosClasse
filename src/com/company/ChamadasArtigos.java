package com.company;

import javax.swing.*;

public class ChamadasArtigos {
    public static int validador (){
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
}
