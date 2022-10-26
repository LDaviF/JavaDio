package edu.davi.typesAndVariables;

public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smarTv = new SmartTV();
        System.out.println("Está ligada? " + smarTv.ligada);
        System.out.println("Qual o volume? " + smarTv.volume);
        System.out.println("Em qual canal está? " + smarTv.canal);

        smarTv.ligar();
        System.out.println("Está ligada? " + smarTv.ligada);

        smarTv.selecionarCanal(5);
        System.out.println("Canal atual " + smarTv.canal);


    }
}
