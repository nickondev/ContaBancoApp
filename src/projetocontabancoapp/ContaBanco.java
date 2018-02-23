/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocontabancoapp;

/**
 *
 * @author dsilvanicolas
 */
public class ContaBanco implements IJuro {
    // Propriedades da ContaBanco
    private static int ID = 1000; //Contador Interno
    private String numConta; // ID + 2 digitos randomicos + 2 primeiros digitos do CPF
    private static final String NUMEROAGENCIA = "6199";
    private String nome;
    private String CPF;
    private double balanco;
    
    //Construtor
    public ContaBanco(String CPF, double depositoInicial){
        balanco = depositoInicial;
        this.CPF = CPF;
        ID++;
        setNumConta();
    }
    private void setNumConta(){
        int random = (int) (Math.random() * 100);
        numConta = ID + "" + random + CPF.substring(0, 2);
        System.out.println(numConta);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void pagarFatura(double valor){
        System.out.println("Pagando fatura:" + valor);
        balanco = balanco-valor;
        mostrarBalanco();
    }
    public void fazerDeposito(double valor){
        System.out.println("Fazendo deposito: " + valor);
        balanco = balanco+valor;
        mostrarBalanco();
    }
    public void mostrarBalanco(){
        System.out.println("Balanço atual: " + balanco);
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Numero da conta: " + numConta + "\n" +
                "Numero da agência: " + NUMEROAGENCIA + "\n" +
                "Balanço da conta: " + balanco;
    }

    @Override
    public void acumular() {
        balanco = balanco * (1 + taxa/100);
        mostrarBalanco();
    }
}
