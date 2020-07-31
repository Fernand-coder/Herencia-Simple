/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasimpletarea1;

/**
 *
 * @author windows
 */
class Bateria{
    String marca;
    double voltaje;
    double corriente;
    double resistencia;
    
    void MostarDatosBateria(){
        System.out.println("* La bateria de marca "+marca+" tiene un voltaje de "+voltaje+" voltios"
        +"\nun amperaje de "+corriente+" amperios");
    }
}

class BateriaLitio extends Bateria{
    String Tipo;
    
    double Calcularvoltaje(){
        return corriente*resistencia;
    }
    double Calcularcorriente(){
        return voltaje/resistencia;
    }
    void MostrarTipo(){
        System.out.println("* El tipo de bateria es: "+Tipo);
    }  
}
class BateriaCalcio extends Bateria{
    String Tipo;
    
    double Calcularvoltaje(){
        return corriente*resistencia;
    }
    double Calcularcorriente(){
        return voltaje/resistencia;
    }
    void MostrarTipo(){
        System.out.println("* El tipo de bateria es: "+Tipo);
    }  
}
class BateriaCeldasHumedas extends Bateria{
    String Tipo;
    
    double Calcularvoltaje(){
        return corriente*resistencia;
    }
    double Calcularcorriente(){
        return voltaje/resistencia;
    }
    void MostrarTipo(){
        System.out.println("* El tipo de bateria es: "+Tipo);
    }  
}

    
public class HerenciaSimpleTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--UNIVERSIDAD DE LAS FEURZAS ARMADAS ESPE--");
        System.out.println("Apellidos y Nombres: Padilla Castro Fernando Jose");
        System.out.println("Materia: Programación [7450]");
        System.out.println("Carrera: Ingenieria Automotriz\n");
        System.out.println(" --Tarea Herencia Simple-- \n");
        
        
        BateriaLitio bateria1=new BateriaLitio();
        BateriaCalcio bateria2=new BateriaCalcio();
        BateriaCeldasHumedas bateria3=new BateriaCeldasHumedas();
        
        
        bateria1.marca="Bosch";
        bateria1.Tipo="Bateria Litio";
        bateria1.corriente=2;
        bateria1.voltaje=11;
        bateria1.resistencia= 5;
        
        bateria2.marca="Bosch";
        bateria2.Tipo="Bateria Litio";
        bateria2.corriente=3;
        bateria2.voltaje=8.9;
        bateria2.resistencia= 9;
        
        bateria3.marca="Bosch";
        bateria3.Tipo="Bateria Litio";
        bateria3.corriente=1.5;
        bateria3.voltaje=10;
        bateria3.resistencia= 7;
        
        System.out.println("-Informacion de la Bateria de Litio--");
        bateria1.MostrarTipo();
        bateria1.MostarDatosBateria();
        System.out.println("* El voltaje Real de la bateria es: "+bateria1.Calcularvoltaje());
        System.out.println("* La corriente Real de la bateria es: "+bateria1.Calcularcorriente());
        System.out.println();
        
        System.out.println("-Informacion de la Bateria de Calcio--");
        bateria1.MostrarTipo();
        bateria1.MostarDatosBateria();
        System.out.println("* El voltaje Real de la bateria es: "+bateria2.Calcularvoltaje());
        System.out.println("* La corriente Real de la bateria es: "+bateria2.Calcularcorriente());
        System.out.println();
        
        System.out.println("-Informacion de la Bateria de Celdas Humedas--");
        bateria1.MostrarTipo();
        bateria1.MostarDatosBateria();
        System.out.println("* El voltaje Real de la bateria es: "+bateria3.Calcularvoltaje());
        System.out.println("* La corriente Real de la bateria es: "+bateria3.Calcularcorriente());
        System.out.println();
        
        
    }
    
}
