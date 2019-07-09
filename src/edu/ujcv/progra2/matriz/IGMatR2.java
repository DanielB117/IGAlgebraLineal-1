//package edu.ujcv.progra2.matriz;
//import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
//
//public class IGMatR2 {
//    private int a;
//    private int b;
//    private int c;
//    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

//    IGVecR2 f1;
//    IGVecR2 f2;
//
//  public IGMatR2 mul(IGMatR2 b){
////
//    }
//
////
//    public IGVecR2 colXMat(IGVecR2 col){
////
//    }
//    public IGMatR2 suma (IGMatR2 b){
////
//    }
//   public IGMatR2 escalarXmat(double escalar){
////
//    }
//   public static IGVecR2 rotacion (double angulo, IGVecR2 vector){
//           int x = lt.leerEntero("ingrese el valor x del vector","intente de nuevo");
//           int y = lt.leerEntero("ingrese el valor y del vector","intente de nuevo");
//
//           double grados = lt.leerFlotante("Ingrese el angulo","intente de nuevo");
//
//           double a1 = Math.cos(grados);
//           double a2 = Math.sin(grados);
//           double a3 = Math.sin(grados);
//           double a4 = Math.cos(grados);
//
//           System.out.println("la matriz rotacion es:");
//           System.out.println("|"+a1+" "+a2+"|");
//           System.out.println("|"+a3+" "+a4+"|");
//
//           System.out.println("La matriz del vector es: ");
//           System.out.println("|"+x+" "+y+"|");
//
//           double b1 = a1 * x + (-a2 * y);
//           double b2 = a3 * x + a4 * y;
//
//           System.out.println("El total es: ");
//           System.out.println("|"+b1+" "+b2+"|");
//       }
//    }
//
//
//
//    public void suma(){
//        int a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
//        int a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
//        int a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
//        int a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");
//
//        int b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
//        int b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
//        int b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
//        int b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");
//
//        int c1 = a1 + b1;
//        int c2 = a2 + b2;
//        int c3 = a3 + b3;
//        int c4 = a4 + b4;
//
//        System.out.println("|"+c1+" "+c3+"|");
//        System.out.println("|"+c2+" "+c4+"|");
//    }
//
//    public void resta(){
//        int a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
//        int a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
//        int a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
//        int a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");
//
//        int b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
//        int b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
//        int b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
//        int b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");
//
//        int c1 = a1 - b1;
//        int c2 = a2 - b2;
//        int c3 = a3 - b3;
//        int c4 = a4 - b4;
//
//        System.out.println("|"+c1+" "+c3+"|");
//        System.out.println("|"+c2+" "+c4+"|");
//    }
//    public void multiplicacion(){
//        int a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
//        int a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
//        int a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
//        int a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");
//
//        int b1 = lt.leerEntero("favor ingresar el numero b1","Favor intentar de nuevo");
//        int b2 = lt.leerEntero("Favor ingresar el numero b2","Favor intentar de nuevo");
//        int b3 = lt.leerEntero("favor ingresar el numero b3","Favor intentar de nuevo");
//        int b4 = lt.leerEntero("favor ingresar el numero b4", "Favor intentar de nuevo");
//
//        int c1 = (a1*b1+a2*b3);
//        int c2 = (a3*b1+a4*b3);
//        int c3 = (a1*b2+a2*b4);
//        int c4 = (a3*b2+a4*b4);
//
//        System.out.println("|"+c1+" "+c3+"|");
//        System.out.println("|"+c2+" "+c4+"|");
//    }
//    public void escalar(){
//        int a1 = lt.leerEntero("favor ingresar el numero a1","Favor intentar de nuevo");
//        int a2 = lt.leerEntero("Favor ingresar el numero a2","Favor intentar de nuevo");
//        int a3 = lt.leerEntero("favor ingresar el numero a3","Favor intentar de nuevo");
//        int a4 = lt.leerEntero("favor ingresar el numero a4", "Favor intentar de nuevo");
//
//        int Escalar = lt.leerEntero("Favor ingrese el escalar","Favor intente de nuevo");
//
//        int b1 = Escalar*a1;
//        int b2 = Escalar*a2;
//        int b3 = Escalar*a3;
//        int b4 = Escalar*a4;
//
//        System.out.println("|"+b1+" "+b3+"|");
//        System.out.println("|"+b2+" "+b4+"|");
//    }
//    public void MatrizRotacion(){
//        int x = lt.leerEntero("ingrese el valor x del vector","intente de nuevo");
//        int y = lt.leerEntero("ingrese el valor y del vector","intente de nuevo");
//
//        double grados = lt.leerFlotante("Ingrese el angulo","intente de nuevo");
//
//        double a1 = Math.cos(grados);
//        double a2 = Math.sin(grados);
//        double a3 = Math.sin(grados);
//        double a4 = Math.cos(grados);
//
//        System.out.println("la matriz rotacion es:");
//        System.out.println("|"+a1+" "+a2+"|");
//        System.out.println("|"+a3+" "+a4+"|");
//
//        System.out.println("La matriz del vector es: ");
//        System.out.println("|"+x+" "+y+"|");
//
//        double b1 = a1 * x + (-a2 * y);
//        double b2 = a3 * x + a4 * y;
//
//        System.out.println("El total es: ");
//        System.out.println("|"+b1+" "+b2+"|");
//    }
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//}