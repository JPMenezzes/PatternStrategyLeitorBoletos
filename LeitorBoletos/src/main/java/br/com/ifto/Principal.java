package br.com.ifto;

public class Principal {
    public static void main(String[] args) {

        var leituraRetornoBancoBrasil = new LeituraRetornoBancoBrasil();
        var processadorBrasil = new ProcessarBoletos(leituraRetornoBancoBrasil);

        //processadorBrasil.setLeituraRetorno(leituraRetornoBancoBrasil);
        processadorBrasil.processar("banco-brasil-1.csv");
        System.out.println(processadorBrasil.getLeituraRetorno().toString());

        System.out.println("");

        var leituraRetornoBradesco = new LeituraRetornoBradesco();
        var processadorBradesco = new ProcessarBoletos(leituraRetornoBradesco);

        //processadorBradesco.setLeituraRetorno(leituraRetornoBradesco);
        processadorBradesco.processar("bradesco-1.csv");
        System.out.println(processadorBradesco.getLeituraRetorno().toString());

    }
}