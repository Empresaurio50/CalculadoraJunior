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
    
    @Override
    public void sumar(Calculadora objCalculadora){
        
        
        resultado = objCalculadora.getNumero1() + objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    @Override
    public void resta(Calculadora objCalculadora){
        
        
        resultado = objCalculadora.getNumero1() - objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    @Override
    public void dividir(Calculadora objCalculadora) throws ExcepcionesPersonalizadas{
        
        if ((objCalculadora.getNumero1() == 0) || (objCalculadora.getNumero2() == 0)) {
            throw new ExcepcionesPersonalizadas ("No se puede dividir entre 0");
        }
        
        resultado = objCalculadora.getNumero1() / objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    @Override
    public void multiplicar(Calculadora objCalculadora){
        
        resultado = objCalculadora.getNumero1() * objCalculadora.getNumero2();
        objCalculadora.setResultado(resultado);
    }
    
    
    
    
}
