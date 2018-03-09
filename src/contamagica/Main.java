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
        ContaMagica cm = new ContaMagica("joao");
        cm.deposito(200000);
        System.out.println(cm.getCategoria()); //platinum
        cm.retirada(180000);
        System.out.println(cm.getCategoria()); //gold
        
    }
    
}
