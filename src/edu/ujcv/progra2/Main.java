package edu.ujcv.progra2;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;
import sun.util.resources.cldr.es.TimeZoneNames_es_419;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                // write your code here
                LectorDeTecladoValidado it = new LectorDeTecladoValidado();
                Scanner sc = new Scanner(System.in);
int Rep;
                do{
                        System.out.println("que desea calcular");
                        System.out.println("Presione 1 para calcular vectores");
                        System.out.println("Presione 2 para calcular matrices");
                        System.out.println("presione 3 para salir del programa");
                        int rep = sc.nextInt();
                        Rep = rep;
                        if (Rep == 1) {
                                System.out.println("presione 1 para calcular Vector en R2");
                                System.out.println("presione 2 para calcular Vector en R3 ");
                                System.out.println("presione 3 para calcular Vector en R4");
                                int TipoVec = sc.nextInt();
                                if (TipoVec == 1) {
                                        System.out.println("presione 1 para calcular suma en R2");
                                        System.out.println("presione 2 para calcular resta en R2");
                                        System.out.println("presione 3 para calcular escalarPorVector R2");
                                        System.out.println("presione 4 para calcular productoPunto en R2");
                                        System.out.println("presione 5 para calcular magnitud en R2");
                                        System.out.println("presione 6 para calcular angulo en R2");
                                        int operaVec = sc.nextInt();
                                        if (operaVec == 1) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese los componentes del primer vector");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las componentes del segundo vector");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                IGVecR2 x = a.suma(b);
                                                IGVecR2 y = a.suma(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.println("," + y.getY());
                                        }
                                        if (operaVec == 2) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las componentes del primer vector");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las componentes del segundo vector");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                IGVecR2 x = a.resta(b);
                                                IGVecR2 y = a.resta(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.println("," + y.getY());
                                        }
                                        if (operaVec == 3) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("Ingrese X1 y Y1");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                System.out.println("ingrese Alpha");
                                                double alpha = sc.nextDouble();
                                                IGVecR2 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ")\n");
                                        }
                                        if (operaVec == 4) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las componentes del  primer vector");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese los componentes del segundo vector");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                double x = a.productoPunto(b);
                                                double y = a.productoPunto(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.println("," + y);
                                        }
                                        if (operaVec == 5) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                double x = a.magnitud(b);
                                                double y = a.magnitud(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.println("," + y);

                                        }
                                        if (operaVec == 6) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                double x = a.angulo(b);
                                                double y = a.angulo(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.println("," + y);
                                        }
                                }
                                if (TipoVec == 2) {
                                        System.out.println("presione 1 para calcular suma en R3");
                                        System.out.println("presione 2 para calcular resta en R3");
                                        System.out.println("presione 3 para calcular escalarPorVector R3");
                                        System.out.println("presione 4 para calcular productoPunto en r3");
                                        System.out.println("presione 5 para calcular producto cruz en R3");
                                        System.out.println("presione 6 para calcular magnitud en R3");
                                        System.out.println("presione 7 para calcular angulo en R3");
                                        int operaVec = sc.nextInt();
                                        if (operaVec == 1) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese los componentes");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las componentes");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                IGVecR3 x = a.suma(b);
                                                IGVecR3 y = a.suma(b);
                                                IGVecR3 z = a.suma(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.print("," + y.getY());
                                                System.out.println("," + z.getZ());
                                        }
                                        if (operaVec == 2) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                IGVecR3 x = a.resta(b);
                                                IGVecR3 y = a.resta(b);
                                                IGVecR3 z = a.resta(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.print("," + y.getY());
                                                System.out.println("," + z.getZ());
                                        }
                                        if (operaVec == 3) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("Ingrese X1 y Y1 y Z1");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                System.out.println("ingrese Alpha");
                                                double alpha = sc.nextDouble();
                                                IGVecR3 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ")\n");
                                        }
                                        if (operaVec == 4) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                double x = a.productoPunto(b);
                                                double y = a.productoPunto(b);
                                                double z = a.productoPunto(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.println("," + z);
                                        }
                                        if (operaVec == 5) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese los componentes");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las componentes");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                IGVecR3 x = a.productoCruz(b);
                                                IGVecR3 y = a.productoCruz(b);
                                                IGVecR3 z = a.productoCruz(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.print("," + y.getY());
                                                System.out.println("," + z.getZ());
                                        }
                                        if (operaVec == 6) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                double x = a.magnitud(b);
                                                double y = a.magnitud(b);
                                                double z = a.magnitud(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.println("," + z);
                                        }
                                        if (operaVec == 7) {
                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                double x = a.angulo(b);
                                                double y = a.angulo(b);
                                                double z = a.angulo(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.println("," + z);
                                        }
                                }
                                if (TipoVec == 3) {
                                        System.out.println("presione 1 para calcular suma en R4");
                                        System.out.println("presione 2 para calcular resta en R4");
                                        System.out.println("presione 3 para calcular escalarPorVector R4");
                                        System.out.println("presione 4 para calcular productoPunto en R4");
                                        System.out.println("presione 5 para calcular magnitud en R4");
                                        System.out.println("presione 6 para calcular angulo en R4");
                                        int operaVec = sc.nextInt();
                                        if (operaVec == 1) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese los componentes");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                b.setw(sc.nextDouble());
                                                IGVecR4 x = a.suma(b);
                                                IGVecR4 y = a.suma(b);
                                                IGVecR4 z = a.suma(b);
                                                IGVecR4 w = a.suma(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.print("," + y.getY());
                                                System.out.print("," + z.getZ());
                                                System.out.println("," + w.getw());
                                        }
                                        if (operaVec == 2) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                b.setw(sc.nextDouble());
                                                IGVecR4 x = a.resta(b);
                                                IGVecR4 y = a.resta(b);
                                                IGVecR4 z = a.resta(b);
                                                IGVecR4 w = a.resta(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.print("," + y.getY());
                                                System.out.print("," + z.getZ());
                                                System.out.println("," + w.getw());
                                        }
                                        if (operaVec == 3) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("Ingrese X1 y Y1 y Z1 y W1");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                System.out.println("ingrese Alpha");
                                                double alpha = sc.nextDouble();
                                                IGVecR4 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ", " + Resul.getw() + ")\n");
                                        }
                                        if (operaVec == 4) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                b.setw(sc.nextDouble());
                                                double x = a.productoPunto(b);
                                                double y = a.productoPunto(b);
                                                double z = a.productoPunto(b);
                                                double w = a.productoPunto(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.print("," + z);
                                                System.out.println("," + w);
                                        }
                                        if (operaVec == 5) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                b.setw(sc.nextDouble());
                                                double x = a.magnitud(b);
                                                double y = a.magnitud(b);
                                                double z = a.magnitud(b);
                                                double w = a.magnitud(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.print("," + z);
                                                System.out.println("," + w);
                                        }
                                        if (operaVec == 6) {
                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                a.setw(sc.nextDouble());
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                b.setw(sc.nextDouble());
                                                double x = a.angulo(b);
                                                double y = a.angulo(b);
                                                double z = a.angulo(b);
                                                double w = a.angulo(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.print("," + y);
                                                System.out.print("," + z);
                                                System.out.println("," + w);
                                        }
                                }
                        }
                        if (Rep == 2) {
                                System.out.println("presione 1 para calcular Matrices en R2");
                                System.out.println("presione 2 para calcular Matrices en R3 ");
                                System.out.println("presione 3 para calcular Matrices en R4");
                                int TipoMat = sc.nextInt();
                                if (TipoMat == 1) {
                                        System.out.println("presione 1 para calcular suma en R2");
                                        System.out.println("presione 2 para calcular  resta en R2");
                                        System.out.println("presione 3 para calcular  multiplicacion en R2");
                                        System.out.println("presione 4 para calcular  colXMat en R2");
                                        System.out.println("presione 5 para calcular escalarXmat en R2");
                                        System.out.println("presione 6 para calcular rotacion en R2");
                                        int operaMat = sc.nextInt();
                                        if (operaMat == 1) {
                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR4 a = new IGVecR4();
                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());
                                                A.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());
                                                B.setw(sc.nextDouble());
                                                IGVecR4 resul = A.suma(B);
                                                System.out.println("|"+resul.getX()+" "+resul.getY()+"|");
                                                System.out.println("|"+resul.getZ()+" "+resul.getw()+"|");
                                        }
                                        if (operaMat == 2) {
                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR4 a = new IGVecR4();
                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());
                                                A.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());
                                                B.setw(sc.nextDouble());
                                                IGVecR4 resul = A.resta(B);
                                                System.out.println("|"+resul.getX()+" "+resul.getY()+"|");
                                                System.out.println("|"+resul.getZ()+" "+resul.getw()+"|");
                                        }
                                        if (operaMat == 3) {
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR2 a = new IGVecR2();
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                IGVecR2 b = new IGVecR2();
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR2  c = new IGVecR2();
                                                c.setx(sc.nextDouble());
                                                IGVecR2 d = new IGVecR2();
                                                d.setx(sc.nextDouble());
                                                c.setY(sc.nextDouble());
                                                d.setY(sc.nextDouble());
                                                double t= a.productoPunto(c);
                                                double o= a.productoPunto(d);
                                                double e=b.productoPunto(c);
                                                double v= b.productoPunto(d);
                                                System.out.println("|"+t+" "+o+"|");
                                                System.out.println("|"+e+" "+v+"|");
                                        }
                                        if (operaMat == 4) {
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("ingrese x, y, z, w");
                                                IGVecR2 a = new IGVecR2();
                                                IGVecR2 b= new IGVecR2();
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                IGVecR2 r= new IGVecR2();
                                                System.out.println("Ingrese X1,Y1");
                                                r.setx(sc.nextDouble());
                                                r.setY(sc.nextDouble());
                                                double g = r.productoPunto(a);
                                                double m= r.productoPunto(b);
                                                System.out.println("El resultado es: ("+g+", "+m+")\n");
                                        }
                                        if (operaMat == 5) {
                                                IGVecR4 p = new IGVecR4();
                                                double alpha = sc.nextDouble();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("ingrese x, y, z, w");
                                                p.setx(sc.nextDouble());
                                                p.setY(sc.nextDouble());
                                                p.setx(sc.nextDouble());
                                                p.setY(sc.nextDouble());
                                                p.escalarPorVector(alpha);
                                                System.out.println("|"+p.getX()+" "+p.getY()+"|");
                                                System.out.println("|"+p.getZ()+" "+p.getw()+"|");
                                        }
                                        if (operaMat == 6) {
                                            IGVecR2 A = new IGVecR2();
                                                System.out.println("ingrese x1 , y1");
                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                double angu = sc.nextDouble();
                                                double angulo = Math.toRadians(angu);
                                                IGVecR2 a = new IGVecR2();
                                                IGVecR2 b = new IGVecR2();
                                                a.setx(Math.cos(angulo));
                                                a.setY(Math.sin(angulo));
                                                b.setx(-(Math.sin(angulo)));
                                                b.setY(Math.cos(angulo));
                                                double r;
                                                double g;
                                                 r = A.productoPunto(a);
                                                 g = A.productoPunto(b);
                                                System.out.println("El resultado es: ("+r+", "+g+")\n");
                                        }
                                }
                                if (TipoMat == 2) {
                                        System.out.println("Presione 1 para calcular multiplicacion");
                                        System.out.println("Presione 2 para calcular columna * matriz");
                                        System.out.println("Presione 3 para calcular suma");
                                        System.out.println("Presione 4 para calcular escalar por matriz");
                                        System.out.println("Presione 5 para calcular la rotacion en x");
                                        System.out.println("Presione 6 para calcular la rotacion en y");
                                        System.out.println("Presione 7 para calcular la rotacion en z");
                                        int operaMat = sc.nextInt();
                                        if (operaMat == 1) {
                                                System.out.println("primera matriz");
                                                System.out.println("| X1 Y1 Z1|");
                                                System.out.println("| X2 Y2 Z2|");
                                                System.out.println("| X3 Y3 Z3|");
                                                IGVecR3 a = new IGVecR3();
                                                a.setx(sc.nextDouble());
                                                a.setY(sc.nextDouble());
                                                a.setZ(sc.nextDouble());
                                                IGVecR3 b = new IGVecR3();
                                                b.setx(sc.nextDouble());
                                                b.setY(sc.nextDouble());
                                                b.setZ(sc.nextDouble());
                                                IGVecR3 c = new IGVecR3();
                                                c.setx(sc.nextDouble());
                                                c.setY(sc.nextDouble());
                                                c.setZ(sc.nextDouble());
                                                System.out.println("segunda matriz");
                                                System.out.println("| X1 Y1 Z1|");
                                                System.out.println("| X2 Y2 Z2|");
                                                System.out.println("| X3 Y3 Z3|");
                                                IGVecR3 d = new IGVecR3();
                                                d.setx(sc.nextDouble());
                                                d.setY(sc.nextDouble());
                                                d.setZ(sc.nextDouble());
                                                IGVecR3 f = new IGVecR3();
                                                f.setx(sc.nextDouble());
                                                f.setY(sc.nextDouble());
                                                f.setZ(sc.nextDouble());
                                                IGVecR3 g = new IGVecR3();
                                                g.setx(sc.nextDouble());
                                                g.setY(sc.nextDouble());
                                                g.setZ(sc.nextDouble());


                                                double x1 = a.productoPunto(d);
                                                double y1 = a.productoPunto(f);
                                                double z1 = a.productoPunto(g);
                                                double x2 = a.productoPunto(d);
                                                double y2 = a.productoPunto(f);
                                                double z2 = a.productoPunto(g);
                                                double x3 = a.productoPunto(d);
                                                double y3 = a.productoPunto(f);
                                                double z3 = a.productoPunto(g);

                                                System.out.println("|" +x1+" "+y1+" "+z1+"|");
                                                System.out.println("|" +x2+" "+y2+" "+z2+"|");
                                                System.out.println("|" +x3+" "+y3+" "+z3+"|");
                                        }
                                        if (operaMat == 2) {

                                                System.out.println("Ingrese la matriz matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println( "|X2 Y2 Z2|");
                                                System.out.println( "|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());

                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());

                                                C.setx(sc.nextDouble());
                                                C.setY(sc.nextDouble());
                                                C.setZ(sc.nextDouble());

                                                IGVecR3 g = new IGVecR3();
                                                System.out.println("Ingrese x1, y1 z1");
                                                g.setx(sc.nextDouble());
                                                g.setY(sc.nextDouble());
                                                g.setZ(sc.nextDouble());
                                                double h= g.productoPunto(A);
                                                double m= g.productoPunto(B);
                                                double j= g.productoPunto(C);
                                               System.out.println("El resultado es: ("+h+", "+m+", "+j+")\n");

                                        }
                                        if (operaMat == 3) {
                                                System.out.println("Ingrese la matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println( "|X2 Y2 Z2|");
                                                System.out.println( "|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());

                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());

                                                C.setx(sc.nextDouble());
                                                C.setY(sc.nextDouble());
                                                C.setZ(sc.nextDouble());

                                                System.out.println("Ingrese la segunda matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println( "|X2 Y2 Z2|");
                                                System.out.println( "|X3 Y3 Z3|");
                                                IGVecR3 d = new IGVecR3();
                                                d.setx(sc.nextDouble());
                                                d.setY(sc.nextDouble());
                                                d.setZ(sc.nextDouble());
                                                IGVecR3 f = new IGVecR3();
                                                f.setx(sc.nextDouble());
                                                f.setY(sc.nextDouble());
                                                f.setZ(sc.nextDouble());
                                                IGVecR3 g = new IGVecR3();
                                                g.setx(sc.nextDouble());
                                                g.setY(sc.nextDouble());
                                                g.setZ(sc.nextDouble());
                                                IGVecR3 x4= A.suma(d);
                                                IGVecR3 y4= B.suma(f);
                                                IGVecR3 z4= C.suma(g);
                                                System.out.println("|" +x4.getX()+" "+x4.getY()+" "+x4.getZ()+"|");
                                                System.out.println("|" +y4.getX()+" "+y4.getY()+" "+y4.getZ()+"|");
                                                System.out.println("|" +z4.getX()+" "+z4.getY()+" "+z4.getZ()+"|");

                                        }
                                        if (operaMat == 4) {
                                                double alpha = sc.nextDouble();
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println("|X2 Y2 Z2|");
                                                System.out.println("|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());

                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());

                                                C.setx(sc.nextDouble());
                                                C.setY(sc.nextDouble());
                                                C.setZ(sc.nextDouble());

                                                 A.escalarPorVector(alpha);
                                                 B.escalarPorVector(alpha);
                                                C.escalarPorVector(alpha);
                                                System.out.println("|" +A.getX()+" "+A.getY()+" "+A.getZ()+"|");
                                                System.out.println("|" +B.getX()+" "+B.getY()+" "+B.getZ()+"|");
                                                System.out.println("|" +C.getX()+" "+C.getY()+" "+C.getZ()+"|");

                                        }
                                        if (operaMat == 5) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, x1");
                                                R.setx(sc.nextDouble());
                                                R.setY(sc.nextDouble());
                                                R.setZ(sc.nextDouble());
                                                double angu = sc.nextDouble();
                                                double angulo = Math.toRadians(angu);
                                                IGVecR3 A = new IGVecR3();
                                                A.setx(1);
                                                A.setY(0);
                                                A.setZ(0);
                                                IGVecR3 B = new IGVecR3();
                                                B.setx(0);
                                                B.setY(Math.cos(angulo));
                                                B.setZ(-(Math.sin(angulo)));
                                                IGVecR3 C = new IGVecR3();
                                                C.setx(0);
                                                C.setY(Math.sin(angulo));
                                                C.setZ(Math.cos(angulo));

                                                double x1= R.productoPunto(A);
                                                double y1= R.productoPunto(B);
                                                double z1= R.productoPunto(C);
                                                System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                        }
                                        if (operaMat == 6) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, x1");
                                                R.setx(sc.nextDouble());
                                                R.setY(sc.nextDouble());
                                                R.setZ(sc.nextDouble());
                                                double angu = sc.nextDouble();
                                                double angulo = Math.toRadians(angu);
                                                IGVecR3 A = new IGVecR3();
                                                A.setx(Math.cos(angulo));
                                                A.setY(0);
                                                A.setZ(-(Math.sin(angulo)));
                                                IGVecR3 B = new IGVecR3();
                                                B.setx(0);
                                                B.setY(1);
                                                B.setZ(0);
                                                IGVecR3 C = new IGVecR3();
                                                C.setx(Math.sin(angulo));
                                                C.setY(0);
                                                C.setZ(Math.cos(angulo));

                                                double x1= R.productoPunto(A);
                                                double y1= R.productoPunto(B);
                                                double z1= R.productoPunto(C);
                                                System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");

                                        }
                                        if (operaMat == 7) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, x1");
                                                R.setx(sc.nextDouble());
                                                R.setY(sc.nextDouble());
                                                R.setZ(sc.nextDouble());
                                                double angu = sc.nextDouble();
                                                double angulo = Math.toRadians(angu);
                                                IGVecR3 A = new IGVecR3();
                                                A.setx(Math.cos(angulo));
                                                A.setY(0);
                                                A.setZ(-(Math.sin(angulo)));
                                                IGVecR3 B = new IGVecR3();
                                                B.setx(0);
                                                B.setY(1);
                                                B.setZ(0);
                                                IGVecR3 C = new IGVecR3();
                                                C.setx(Math.sin(angulo));
                                                C.setY(0);
                                                C.setZ(Math.cos(angulo));

                                                double x1= R.productoPunto(A);
                                                double y1= R.productoPunto(B);
                                                double z1= R.productoPunto(C);
                                                System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                        }

                                }
                                if (TipoMat == 3) {
                                        System.out.println("Presione 1 para calcular la rotacion en x");
                                        System.out.println("Presione 2 para calcular la rotacion en y");
                                        System.out.println("Presione 3 para calcular la rotacion en z");
                                        System.out.println("Presione 4 para calcular la rotacion en w");
                                        int operaMat = sc.nextInt();
                                        if (operaMat == 1) {
                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                IGVecR4 C = new IGVecR4();
                                                IGVecR4 D = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());
                                                A.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());
                                                B.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                C.setx(sc.nextDouble());
                                                C.setY(sc.nextDouble());
                                                C.setZ(sc.nextDouble());
                                                C.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                D.setx(sc.nextDouble());
                                                D.setY(sc.nextDouble());
                                                D.setZ(sc.nextDouble());
                                                D.setw(sc.nextDouble());
                                                IGVecR4 resul = A.suma(B.suma(C.suma(D)));
                                                System.out.println("|"+resul.getX()+" "+resul.getY()+"|");
                                                System.out.println("|"+resul.getZ()+" "+resul.getw()+"|");
                                        }
                                        if (operaMat == 2) {
                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                IGVecR4 C = new IGVecR4();
                                                IGVecR4 D = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                A.setx(sc.nextDouble());
                                                A.setY(sc.nextDouble());
                                                A.setZ(sc.nextDouble());
                                                A.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(sc.nextDouble());
                                                B.setY(sc.nextDouble());
                                                B.setZ(sc.nextDouble());
                                                B.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                C.setx(sc.nextDouble());
                                                C.setY(sc.nextDouble());
                                                C.setZ(sc.nextDouble());
                                                C.setw(sc.nextDouble());
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                D.setx(sc.nextDouble());
                                                D.setY(sc.nextDouble());
                                                D.setZ(sc.nextDouble());
                                                D.setw(sc.nextDouble());
                                                IGVecR4 resul = A.resta(B.resta(C.resta(D)));
                                                System.out.println("|"+resul.getX()+" "+resul.getY()+"|");
                                                System.out.println("|"+resul.getZ()+" "+resul.getw()+"|");
                                        }
                                        if (operaMat == 3) {
                                        }
                                        if (operaMat == 4) {
                                        }
                                        if (operaMat == 5) {
                                        }
                                        if (operaMat == 6){
                                        }
                                        if (operaMat == 7){
                                        }
                                        if (operaMat == 8){
                                        }
                                }
                        }
                } while (Rep != 3);
                System.out.println("Esta Finalizando el programa");
        }
}


