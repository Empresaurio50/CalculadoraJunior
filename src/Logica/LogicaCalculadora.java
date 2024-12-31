/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Entidades.Calculadora;
import CustomExcepcion.ExcepcionesPersonalizadas;
import Servicios.ServicioCalculadora;
/**
 *
 * @author Empresaurio50
 */
public class LogicaCalculadora implements ServicioCalculadora{
    
    private int resultado;
    
    
    public void sumar(Calculadora objCalculadora){
        
        
        resultado = objCalculadora.getNumero1() + objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    
    public void resta(Calculadora objCalculadora){
        
        
        resultado = objCalculadora.getNumero1() - objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    
    public void dividir(Calculadora objCalculadora) throws ExcepcionesPersonalizadas{
        
        if ((objCalculadora.getNumero1() == 0) || (objCalculadora.getNumero2() == 0)) {
            throw new ExcepcionesPersonalizadas ("No se puede dividir entre 0");
        }
        
        resultado = objCalculadora.getNumero1() / objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    
    public void multiplicar(Calculadora objCalculadora){
        
        resultado = objCalculadora.getNumero1() * objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    
    
    public void operadores(Calculadora objCalculadora) throws ExcepcionesPersonalizadas, Exception{
        
        switch (objCalculadora.getOperador()) {
            case "+":
                sumar(objCalculadora);
                
                break;
            case "-":
                resta(objCalculadora);
                break;
            case "*":
                multiplicar(objCalculadora);
                break;
            case "/":
                dividir(objCalculadora);
                break;
            default:
                throw new Exception("Mas de una operacion");
        }
        
        
    }
    
    
}
