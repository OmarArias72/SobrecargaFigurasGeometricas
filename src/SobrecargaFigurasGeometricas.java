/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class SobrecargaFigurasGeometricas {
    private int result1;
    private double resultado2;
    
    
    private int baseCua;
    private int base3;
    private int alt1;
    private double r2circulo;
    private double r3;
    double alt2;
    double base2;
    private double cubobase4;
    
    //cuadrado
    public SobrecargaFigurasGeometricas(int base){
        baseCua=base;
        Area(baseCua);
        Resultado(result1);
        
    }
    //circulo
    public SobrecargaFigurasGeometricas(double radio){
        r2circulo=radio;
        Area(r2circulo);
        Resultado(resultado2);
        
    }

    //rectangulo
    public SobrecargaFigurasGeometricas(int base, int alt){
        base3=base;
        alt1=alt;
        Area(base,alt1);
        Resultado(result1);
        
        
    }
    
    //triangulo
    public SobrecargaFigurasGeometricas(double base, double alt){
        base2=base;
        alt2=alt;
        Area(base2,alt2);
        Resultado(resultado2);
        
        
    }
    //cubo
    public SobrecargaFigurasGeometricas(double base, String fig){
        cubobase4=base;
        Area(cubobase4,"fig");
        Resultado(resultado2);
        
    }
    //esfera
    public SobrecargaFigurasGeometricas(double radio, char c){
        r3=radio;
        Area(r3,'c');
        Resultado(resultado2);
    }
    
    public void Area(int bas){
        result1=(int) Math.pow(bas,2);
    }
    
    public void Area(double  r){
        resultado2=3.14*Math.pow(r,2);
    }
    
    public void Area(int base, int alt){
        result1=base*alt;
    }
    public void Area(double b, double alt){
        resultado2=(b*alt)/2;
    }
    
    public void Area(double b,String fig){
        resultado2=6*Math.pow(b,2);
    }
    
    public void Area(double b,char c){
        resultado2=(4*3.14)*-Math.pow(b,2);
    }
    
    
    
//    public int cuadrado(){
//        return base1;
//    }
    
    public void Resultado(int result){
        System.out.printf("El resultado es: %n%5d",result);
    }
    
    public void Resultado(double result){
        System.out.printf("El resultado es: %n%5.5f",result);
    }
    
//    public double circulo(){
//        return r2;
//    }
    
//    public void Resultado(String figura){
//        if("cuadrado".equalsIgnoreCase(figura)){
//            System.out.printf("El resultado de "+figura+" es", result1);
//        } else if("circulo".equalsIgnoreCase(figura)){
//            System.out.printf("El resultado de "+figura+" es", resultado2);
//        }
//        
//    }
    
}
