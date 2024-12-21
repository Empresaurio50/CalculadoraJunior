/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

import CustomExcepcion.ExcepcionesPersonalizadas;
import Entidades.Calculadora;

/**
 *
 * @author Empresaurio50
 */
public interface ServicioCalculadora {
    
    void sumar(Calculadora objCalculadora);
    void resta(Calculadora objCalculadora);
    void dividir(Calculadora objCalculadora) throws ExcepcionesPersonalizadas;
    void multiplicar(Calculadora objCalculadora);
    
    
    
}
