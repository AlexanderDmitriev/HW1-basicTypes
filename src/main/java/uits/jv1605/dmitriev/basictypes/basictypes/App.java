package uits.jv1605.dmitriev.basictypes.basictypes;
public class App {
    public static void main( String[] args ){
        System.out.println( "Здравствуй, мир" );
        System.out.println("Какой-то" + "\n" + "текст" + "\n" + "на 3 строчки");
        String name = "Dmitriev Alexander";
        int group=1605;
        String time="19-00 .... 21-30";
        System.out.println("ФИО" + "[" + name + "]");
        System.out.println("номер группы" + "[" + group + "]");
        System.out.println("время занятий" + "[" + time + "]");
       ///////////////////////////////////////////////////////////////////////
        System.out.println("Длина окружности = " + simpleCalculation.dlOkr(10));
        System.out.println("Площадь  круга = " + simpleCalculation.sqOkr(10));
        System.out.println("Площадь  кольца = " + simpleCalculation.sqRing(10,5));
        System.out.println("Периметр треугольника = " + simpleCalculation.perTrian(10,10,10));
        System.out.println("Площадь треугольника = " + simpleCalculation.sqTrian(10,10,10));
        System.out.println("Периметр  прямоугольника  = " + simpleCalculation.perSq(10,10));
        System.out.println("Площадь прямоугольника = " + simpleCalculation.sqSq(10,10));
        ////////////////////////////////////////////////
        System.out.println("Объем цилиндра = " + secondaryCalculation.obCil(10,10));
        System.out.println("Объем полого цилиндра = " + secondaryCalculation.obPolCil(10,5,10));
        System.out.println("Площадь боковой поверхности цилиндра = " + secondaryCalculation.bokCil(10,10));
        System.out.println("Объем шара = " + secondaryCalculation.obCircle(10));
        System.out.println("Площадь шара = " + secondaryCalculation.sqCircle(10));
        System.out.println("Объем параллелепипеда = " + secondaryCalculation.obPar(10,10,8));
        System.out.println("Площадь параллелепипеда = " + secondaryCalculation.sqPar(10,10,8));
        System.out.println("Объем  тетраэдра = " + secondaryCalculation.obTet(10));
        System.out.println("Площадь  тетраэдра = " + secondaryCalculation.sqTet(10));
    }
}
