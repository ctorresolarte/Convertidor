package com.mycompany.convertidor;

public class Operaciones {

 
    private double valor, resultado;
    private int divisaInicial, divisaFinal;

  
 
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisaInicial() {
        return divisaInicial;
    }

    public void setDivisaInicial(int divisaInicial) {
        this.divisaInicial = divisaInicial;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    //constructor
    public Operaciones() {
    }

    
    
    //Convertidor moneda
    public double convertir() {
        //--------------pesos------------------
        //peso a peso
        if (divisaInicial == 0 && divisaFinal == 0) {
            resultado = valor;
        }
        //peso a dolar
        if (divisaInicial == 0 && divisaFinal == 1) {
            resultado = (valor * 0.00021);
        }
        //peso a euro
        if (divisaInicial == 0 && divisaFinal == 2) {
            resultado = valor * 0.00019;
        }
        //peso a libra
        if (divisaInicial == 0 && divisaInicial == 3) {
            resultado = valor * 0.00017;
        }
        //peso a yen
        if (divisaInicial == 0 && divisaFinal == 4) {
            resultado = valor * 0.027;
        }
        //peso a won
        if (divisaInicial == 0 && divisaFinal == 5) {
            resultado = valor * 0.27;
        }

        //---------------dolares----------------
        //dolar a peso
        if (divisaInicial == 1 && divisaFinal == 0) {
            resultado = valor * 4849.99;
        }
        //dolar a dolar
        if (divisaInicial == 1 && divisaFinal == 1) {
            resultado = valor;
        }
        //dolar a euro
        if (divisaInicial == 1 && divisaFinal == 2) {
            resultado = valor * 0.94;
        }
        //dolar a libra
        if (divisaInicial == 1 && divisaFinal == 3) {
            resultado = valor * 0.83;
        }
        //dolar a yen
        if (divisaInicial == 1 && divisaFinal == 4) {
            resultado = valor * 133.74;
        }
        //dolar a won
        if (divisaInicial == 1 && divisaFinal == 5) {
            resultado = valor * 1301.14;
        }

        //---------------euros-----------------
        //euro a peso
        if (divisaInicial == 2 && divisaFinal == 0) {
            resultado = valor * 5147.44;
        }
        //euro a dolar
        if (divisaInicial == 2 && divisaFinal == 1) {
            resultado = valor * 1.06;
        }
        //euro a euro
        if (divisaInicial == 2 && divisaFinal == 2) {
            resultado = valor;
        }
        //euro a libra
        if (divisaInicial == 2 && divisaFinal == 3) {
            resultado = valor * 0.88;
        }
        //euro a yen
        if (divisaInicial == 2 && divisaFinal == 4) {
            resultado = valor * 141.85;
        }
        //euro a won
        if (divisaInicial == 2 && divisaFinal == 5) {
            resultado = valor * 1380.56;
        }

        //---------------libras-----------------
        //libra a peso
        if (divisaInicial == 3 && divisaFinal == 0) {
            resultado = valor * 5874.20;
        }
        //libra a dolar
        if (divisaInicial == 3 && divisaFinal == 1) {
            resultado = valor * 1.21;
        }
        //libra a euro
        if (divisaInicial == 3 && divisaFinal == 2) {
            resultado = valor * 1.14;
        }
        //libra a libra
        if (divisaInicial == 3 && divisaFinal == 3) {
            resultado = valor;
        }
        //libra a yen
        if (divisaInicial == 3 && divisaFinal == 4) {
            resultado = valor * 161.77;
        }
        //libra a won
        if (divisaInicial == 3 && divisaFinal == 5) {
            resultado = valor * 1575.60;
        }

        //---------------yens-----------------
        //yen a peso
        if (divisaInicial == 4 && divisaFinal == 0) {
            resultado = valor * 36.31;
        }
        //yen a dolar
        if (divisaInicial == 4 && divisaFinal == 1) {
            resultado = valor * 0.0075;
        }
        //yen a euro
        if (divisaInicial == 4 && divisaFinal == 2) {
            resultado = valor * 0.0071;
        }
        //yen a libra
        if (divisaInicial == 4 && divisaFinal == 3) {
            resultado = valor;
        }
        //yen a yen
        if (divisaInicial == 4 && divisaFinal == 4) {
            resultado = valor;
        }
        //yen a won
        if (divisaInicial == 4 && divisaFinal == 5) {
            resultado = valor * 9.74;
        }

        //---------------wons-----------------
        //won a peso
        if (divisaInicial == 5 && divisaFinal == 0) {
            resultado = valor * 3.73;
        }
        //won a dolar
        if (divisaInicial == 5 && divisaFinal == 1) {
            resultado = valor * 0.00077;
        }
        //won a euro
        if (divisaInicial == 5 && divisaFinal == 2) {
            resultado = valor * 0.00073;
        }
        //won a libra
        if (divisaInicial == 5 && divisaFinal == 3) {
            resultado = valor* 0.00063;
        }
        //won a yen
        if (divisaInicial == 5 && divisaFinal == 4) {
            resultado = valor* 0.10;
        }
        //won a won
        if (divisaInicial == 5 && divisaFinal == 5) {
            resultado = valor;
        }
        return resultado;
    }
}
