
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Datos {
    
    private int option;
    private SobrecargaFigurasGeometricas figura;
    
    public void Menu(){
        
        String temp;
        temp=JOptionPane.showInputDialog("Ingrese una de las siguientes opciones"
        +"\n1. Cuadrado \n2. Circulo \n3.Rectangulo \n 4. Triangulo \n 5.Cubo \n6. Esfera");
        option=Integer.parseInt(temp);
        switch(option){
            case 1:
                input(option);
//                figura.Area(figura.cuadrado());
                break;
            case 2:
                input(option);
                break;
            case 3:
                input(option);
                break;
            case 4:
                input(option);
                break;
            case 5:
                input(option);
                break;
            case 6:
                input(option);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        
        
    }
    public void input(int opcion){
        
        switch(opcion){
            case 1:
                //cuadrado
                String temp;
                int base1;
                temp=JOptionPane.showInputDialog("Ingrese un lado: ");
                base1=Integer.parseInt(temp);
                figura = new SobrecargaFigurasGeometricas(base1);
                break;
            case 2:
                //circulo
                String temp2;
                double rad;
                temp2=JOptionPane.showInputDialog("Ingrese el radio: ");
                rad=Double.parseDouble(temp2);
                figura = new SobrecargaFigurasGeometricas(rad);
                break;
            case 3:
                //rectangulo
                String temp3;
                int b, h;
                temp3=JOptionPane.showInputDialog("Ingrese la base: ");
                b=Integer.parseInt(temp3);
                temp=JOptionPane.showInputDialog("Ingrese la altura: ");
                h=Integer.parseInt(temp);
                figura = new SobrecargaFigurasGeometricas(b,h);
                break;
                //triangulo
            case 4:
                String temp4;
                double b1,h1;
                temp4=JOptionPane.showInputDialog("Ingrese la base: ");
                b1=Double.parseDouble(temp4);
                temp4=JOptionPane.showInputDialog("Ingrese la altura: ");
                h1=Double.parseDouble(temp4);
                figura = new SobrecargaFigurasGeometricas(b1,h1);
                break;
                
            case 5:
                //Cubo
                String temp5;
                double b5;
                temp5=JOptionPane.showInputDialog("Ingrese la base: ");
                b5=Double.parseDouble(temp5);
                figura = new SobrecargaFigurasGeometricas(b5,"cuadrado");
                break;
            case 6:
                //esfera
                String temp6;
                double radesfera;
                temp6=JOptionPane.showInputDialog("Ingrese el radio de la esfera: ");
                radesfera=Double.parseDouble(temp6);
                figura = new SobrecargaFigurasGeometricas(radesfera,'c');
                break;
                
                
                
        
        }
    }
}
