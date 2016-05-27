package uits.jv1605.dmitriev.basictypes.basictypes;

public class simpleCalculation {
   static final double PI=3.14159265;
   
   public static double dlOkr(double radius){
    return PI*2*radius;}
  
    public static double sqOkr(double radius){
    return PI*radius*radius;}
   
   public static double sqRing(double radiusBig, double radiusSmall){
    return PI*(radiusBig*radiusBig-radiusSmall*radiusSmall);}
   
  public static double perTrian(double a, double b, double c){
    return a+b+c;}
  
    public static double sqTrian(double as, double bs, double cs){
        double p=(as+bs+cs)/2;
    return Math.sqrt(p*(p-as)*(p-bs)*(p-cs));}
    
    public static double perSq(double a, double b){
    return 2*(a+b);}
    
    public static double sqSq(double a, double b){
    return a*b;}
}
