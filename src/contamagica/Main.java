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
        System.out.println("Saldo: "+cm.getSaldo()+" | Categoria: "+cm.getCategoria()); //silver
        cm.setSaldo(100000);
        cm.deposito(100000);
        cm.deposito(8000000);
        System.out.println("Saldo: "+cm.getSaldo()+" | Categoria: "+cm.getCategoria()); //gold
        cm.deposito(200000);
        System.out.println("Saldo: "+cm.getSaldo()+" | Categoria: "+cm.getCategoria()); //platinum
        System.out.println("--- Fim teste deposito ---\n");
       // System.out.println("--- Testando retirada ---");
      //  ContaMagica cm1 = new ContaMagica("pedro");
      //  cm1.deposito(200000);
      //  System.out.println("Saldo: "+cm1.getSaldo()+" | Categoria: "+cm1.getCategoria()); //platinum
      //  cm1.retirada(180000);
      //  System.out.println("Saldo: "+cm1.getSaldo()+" | Categoria: "+cm1.getCategoria()); //gold
        
    }
    
}
