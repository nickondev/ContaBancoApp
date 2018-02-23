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
public class ProjetoContaBancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco("998948293", 1000);
        ContaBanco cb2 = new ContaBanco("658948293", 1000);
        ContaBanco cb3 = new ContaBanco("238948293", 1000);
        
        
        cb1.setNome("Nick");
        System.out.println(cb1.getNome());
        cb1.fazerDeposito(500);
        cb1.fazerDeposito(600);
        cb1.pagarFatura(1000);
        cb1.acumular();
        System.out.println(cb1.toString());
    }
    
}
