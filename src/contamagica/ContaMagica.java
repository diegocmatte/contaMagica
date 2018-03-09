/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contamagica;

import static contamagica.ContaMagica.Categoria.GOLD;
import static contamagica.ContaMagica.Categoria.PLATINUM;
import static contamagica.ContaMagica.Categoria.SILVER;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class ContaMagica {

    private Categoria categoria;

    public enum Categoria {
        SILVER, GOLD, PLATINUM;
    }
    private String nome;
    private double saldo;

    public ContaMagica(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Categoria getCategoria() {
        if (getSaldo() < 50000) {
            return SILVER;
        } else if (getSaldo() < 200000) {
            return GOLD;
        } else {
            return PLATINUM;
        }
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor informado menor/igual a zero.");
        } else {
            if (getSaldo() < 50000) {
                setSaldo(valor + saldo);
                if (getSaldo() >= 50000) {
                    setCategoria(GOLD);
                }
            } else if (getSaldo() < 200000) {
                setSaldo(valor + saldo + (valor * 0.01));
                if (getSaldo() >= 200000) {
                    setCategoria(PLATINUM);
                }
            } else {
                setSaldo(valor + saldo + (valor * 0.025));
            }
        }
    }

    public void retirada(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Valor informado maior que o saldo");
        } else {
            switch (getCategoria()) {
                case PLATINUM:
                    setSaldo(saldo - valor);
                    if (getSaldo() < 100000) {
                        setCategoria(GOLD);
                    }
                    break;
                case GOLD:
                    setSaldo(saldo - valor);
                    if (getSaldo() < 25000) {
                        setCategoria(SILVER);
                    }
                    break;
                case SILVER:
                    setSaldo(saldo - valor);
                    break;
            }
            /*
            if (getSaldo() < 25000) {
                setCategoria(SILVER);
            } else if (getSaldo() < 100000) {
                setCategoria(GOLD);
            } else {
                setCategoria(PLATINUM);
            }
        }
             */
        }
    }
}
