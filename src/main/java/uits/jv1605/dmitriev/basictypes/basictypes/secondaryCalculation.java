package uits.jv1605.dmitriev.basictypes.basictypes;

import static uits.jv1605.dmitriev.basictypes.basictypes.simpleCalculation.PI;

public class secondaryCalculation {
     public static double obCil(double radius, double heigth){
    return PI*radius*radius*heigth;}
     
      public static double obPolCil(double radiusOut, double radiusInner, double heigth){
    return PI*heigth*(radiusOut*radiusOut-radiusInner*radiusInner);}
      
       public static double bokCil(double radius, double heigth){
    return PI*2*radius*heigth;}    
       
    public static double obCircle(double radius){
    return (PI*4*(Math.pow(radius,3)))/3;}  
    
    public static double sqCircle(double radius){
    return PI*4*radius*radius;}  
    
    public static double obPar(double a, double b, double c){
    return a*b*c;}  
    
    public static double sqPar(double a, double b, double c){
    return 2*(a*b+b*c+a*c);} 
    
    public static double obTet(double a){
    return ((Math.sqrt(2))*(Math.pow(a,3)))/12;} 
    
    public static double sqTet(double a){
    return Math.sqrt(3)*a*a;} 
}
