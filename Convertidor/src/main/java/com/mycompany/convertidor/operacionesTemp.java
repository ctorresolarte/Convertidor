
package com.mycompany.convertidor;


public class operacionesTemp {
    private double valor, resultado;
    private int tempInicial, tempFinal;

    public double getResultado() {
        return resultado;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempInicial() {
        return tempInicial;
    }

    public void setTempInicial(int tempInicial) {
        this.tempInicial = tempInicial;
    }

    public int getTempFinal() {
        return tempFinal;
    }

    public void setTempFinal(int tempFinal) {
        this.tempFinal = tempFinal;
    }

    //constructor
    public operacionesTemp() {
    }
    
    //operaciones
    public double convertir(){//metodo
        //--------------°C----------------
        //de °c a °c
        if(tempInicial==0 && tempFinal==0){
            resultado = valor;
        }
        //de °c a °f
        if(tempInicial==0 && tempFinal==1){
            resultado = (valor*9/5)+32;
        }
         //de °c a °k
        if(tempInicial==0 && tempFinal==2){
            resultado = (valor+273.15);
        }
        
        
        //--------------°F----------------
        //de °f a °c
        if(tempInicial==1 & tempFinal==0){
            resultado = (valor-32)*5/9; 
        }
         //de °f a °f
        if(tempInicial==1 & tempFinal==1){
            resultado = valor; 
        }
        //de °f a °k
        if(tempInicial==1 & tempFinal==2){
            resultado = (valor + 459.67)*5/9; 
        }
        
        
        //--------------°K----------------
        //de °k a °c
        if(tempInicial==2 & tempFinal==0){
            resultado = (valor-273.15); 
        }
         //de °k a °f
        if(tempInicial==2 & tempFinal==1){
            resultado = (valor - 273.15)*9/5+32; 
        }
        //de °k a °k
        if(tempInicial==2 & tempFinal==2){
            resultado = valor; 
        }
        return resultado;
    }
    
    
    
    
}
