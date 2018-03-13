/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contamagica;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- Testando deposito ---");
        ContaMagica cm = new ContaMagica("joao");
        cm.deposito(20000);
        System.out.println("Saldo: "+cm.getSaldo()+" Categoria: "+cm.getCategoria()); //silver
        cm.deposito(80000);
        System.out.println("Saldo: "+cm.getSaldo()+" Categoria: "+cm.getCategoria());
        cm.deposito(200000);
        System.out.println("Saldo: "+cm.getSaldo()+" Categoria: "+cm.getCategoria());
        System.out.println("--- Fim teste deposito ---");
        System.out.println("--- Testando retirada ---");
        
    }
    
}
