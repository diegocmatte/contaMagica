/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contamagica;

import static contamagica.ContaMagica.Categoria.GOLD;
import static contamagica.ContaMagica.Categoria.PLATINUM;
import static contamagica.ContaMagica.Categoria.SILVER;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class ContaMagicaTest {
    /**
     * Test of getSaldo method, of class ContaMagica.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        ContaMagica instance = new ContaMagica("joao");
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        System.out.println(instance.getSaldo()+"\n");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class ContaMagica.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        ContaMagica instance = new ContaMagica("joao");
        instance.setSaldo(saldo);
        assertEquals(instance.getSaldo(), saldo, 0.0);
        System.out.println(instance.getSaldo()+"\n");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class ContaMagica.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        ContaMagica instance = new ContaMagica("joao");
        instance.setSaldo(110000);
        ContaMagica.Categoria expResult = GOLD;
        ContaMagica.Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        System.out.println(instance.getCategoria()+"\n");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class ContaMagica.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        ContaMagica.Categoria categoria = PLATINUM;
        ContaMagica instance = new ContaMagica("joao");
        instance.setSaldo(20000000);
        instance.setCategoria(categoria);
        assertEquals(instance.getCategoria(), categoria);
        System.out.println(instance.getCategoria()+"\n");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deposito method, of class ContaMagica.
     */
    @Test
    public void testDeposito() {
        System.out.println("deposito");
        double valor = 1000.0;
        ContaMagica instance = new ContaMagica("joao");
        instance.deposito(valor);
        assertEquals(1000.0, instance.getSaldo(),0.0);
        System.out.println();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirada method, of class ContaMagica.
     */
    @Test
    public void testRetirada() {
        System.out.println("retirada");
        double valor = 1000;
        ContaMagica instance = new ContaMagica("joao");
        instance.setSaldo(10000);
        instance.retirada(valor);
        assertEquals(9000.0, instance.getSaldo(), 0.0);
        System.out.println(instance.getSaldo()+"\n");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
