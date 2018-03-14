/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contamagica;

import static contamagica.ContaMagicaBigDecimal.Categoria.GOLD;
import static contamagica.ContaMagicaBigDecimal.Categoria.PLATINUM;
import static contamagica.ContaMagicaBigDecimal.Categoria.SILVER;
import java.math.BigDecimal;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class ContaMagicaBigDecimal {

    public enum Categoria {
        SILVER, GOLD, PLATINUM;
    }

    private BigDecimal saldo;
    private String nome;
    private Categoria categoria;

    public ContaMagicaBigDecimal(String nome) {
        this.nome = nome;
        this.categoria = SILVER;
        saldo = new BigDecimal("0.00");
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Categoria getCategoria() {
        if (getSaldo().doubleValue() >= 200000) {
            return PLATINUM;
        } else if (getSaldo().doubleValue() >= 50000) {
            return GOLD;
        } else {
            return SILVER;
        }
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void deposito(BigDecimal valor) {
        if (valor.doubleValue() <= 0) {
            System.out.println("Valor informado menor/igual a zero.");
        } else {
            BigDecimal total = new BigDecimal("0.0");
            if (getSaldo().doubleValue() >= 200000) {
                //getSaldo().add(valor);
                total = total.add(valor);
                setSaldo(total.add(getSaldo()));
            } else if (getSaldo().doubleValue() >= 50000) {
                total = total.add(valor);
                setSaldo(total.add(getSaldo()));
            } else {
                total = total.add(valor);
                setSaldo(total.add(getSaldo()));
            }
        }
    }
}
