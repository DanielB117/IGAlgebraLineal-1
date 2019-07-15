package edu.ujcv.progra2;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;


import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                // write your code here
                LectorDeTecladoValidado it = new LectorDeTecladoValidado();
                Scanner sc = new Scanner(System.in);

                double Rep;
                do {
                        System.out.println("que desea calcular");
                        System.out.println("Presione 1 para calcular vectores");
                        System.out.println("Presione 2 para calcular matrices");
                        System.out.println("presione 3 para salir del programa");

                       double rep = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");

                        Rep = rep;

                        if (rep == 1) {
                                System.out.println("presione 1 para calcular Vector en R2");
                                System.out.println("presione 2 para calcular Vector en R3 ");
                                System.out.println("presione 3 para calcular Vector en R4");
                               double TipoVec = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                if (TipoVec == 1) {
                                        System.out.println("presione 1 para calcular suma en R2");
                                        System.out.println("presione 2 para calcular resta en R2");
                                        System.out.println("presione 3 para calcular escalarPorVector R2");
                                        System.out.println("presione 4 para calcular productoPunto en R2");
                                        System.out.println("presione 5 para calcular magnitud en R2");
                                        System.out.println("presione 6 para calcular angulo en R2");


                                       double operaVec=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaVec == 1) {

                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese los componentes del primer vector");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las componentes del segundo vector");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                IGVecR2 x = a.suma(b);
                                                IGVecR2 y = a.suma(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.println("," + y.getY());
                                        }
                                        if (operaVec == 2) {
                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las componentes del primer vector");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las componentes del segundo vector");
                                                b.setx(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                IGVecR2 x = a.resta(b);
                                                IGVecR2 y = a.resta(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x.getX());
                                                System.out.println("," + y.getY());
                                        }
                                        if (operaVec == 3) {

                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("Ingrese X1 y Y1");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                System.out.println("ingrese Alpha");
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");
                                                IGVecR2 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ")\n");
                                        }
                                        if (operaVec == 4) {

                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las componentes del  primer vector");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese los componentes del segundo vector");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                double x = a.productoPunto(b);
                                                double y = a.productoPunto(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.println("," + y);
                                        }
                                        if (operaVec == 5) {

                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                double x = a.magnitud(b);
                                                double y = a.magnitud(b);
                                                System.out.println("Su resultado es");
                                                System.out.print(x);
                                                System.out.println("," + y);

                                        }
                                        if (operaVec == 6) {

                                                IGVecR2 a = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
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

                                        double operaVec=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaVec == 1) {

                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese los componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                System.out.println("ingrese Alpha");
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");
                                                IGVecR3 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ")\n");
                                        }
                                        if (operaVec == 4) {

                                                IGVecR3 a = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                                System.out.println("ingrese los componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                System.out.println("ingrese los componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
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
                                        double  operaVec=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaVec == 1) {

                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese los componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las variables");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
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
                                                System.out.println("ingrese las componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
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
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                System.out.println("ingrese Alpha");
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");
                                                IGVecR4 Resul = a.escalarPorVector(alpha);
                                                System.out.println("El resultado es: (" + Resul.getX() + ", " + Resul.getY() + ", " + Resul.getZ() + ", " + Resul.getw() + ")\n");
                                        }
                                        if (operaVec == 4) {

                                                IGVecR4 a = new IGVecR4();
                                                System.out.println("ingrese las componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese las componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
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
                                                System.out.println("ingrese los componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese los componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
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
                                                System.out.println("ingrese los componentes");
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                System.out.println("ingrese los componentes");
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
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
                        if (rep == 2) {
                                System.out.println("presione 1 para calcular Matrices en R2");
                                System.out.println("presione 2 para calcular Matrices en R3 ");
                                System.out.println("presione 3 para calcular Matrices en R4");
                                double TipoMat=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                if (TipoMat == 1) {
                                        System.out.println("presione 1 para calcular suma en R2");
                                        System.out.println("presione 2 para calcular  resta en R2");
                                        System.out.println("presione 3 para calcular  multiplicacion en R2");
                                        System.out.println("presione 4 para calcular  colXMat en R2");
                                        System.out.println("presione 5 para calcular escalarXmat en R2");
                                        System.out.println("presione 6 para calcular rotacion en R2");
                                        double operaMat=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaMat == 1) {
                                                System.out.println("ingrese la matriz");
                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                A.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));

                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                B.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
                                                IGVecR4 resul = A.suma(B);
                                                System.out.println("|" + resul.getX() + " " + resul.getY() + "|");
                                                System.out.println("|" + resul.getZ() + " " + resul.getw() + "|");
                                        }
                                        if (operaMat == 2) {

                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR4 a = new IGVecR4();
                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                A.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                B.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                B.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 resul = A.resta(B);
                                                System.out.println("|" + resul.getX() + " " + resul.getY() + "|");
                                                System.out.println("|" + resul.getZ() + " " + resul.getw() + "|");
                                        }
                                        if (operaMat == 3) {
                                                System.out.println("ingrese la matriz");
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");

                                                IGVecR2 a = new IGVecR2();
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 b = new IGVecR2();
                                                b.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("Ingrese X,Y,Z,W");
                                                IGVecR2 c = new IGVecR2();
                                                c.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                c.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 d = new IGVecR2();
                                                d.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                d.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));

                                                double t = a.productoPunto(c);
                                                double o = a.productoPunto(d);
                                                double e = b.productoPunto(c);
                                                double v = b.productoPunto(d);
                                                System.out.println("|" + t + " " + o + "|");
                                                System.out.println("|" + e + " " + v + "|");
                                        }
                                        if (operaMat == 4) {
                                                System.out.println("ingrese la matriz");
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("ingrese x, y, z, w");
                                                IGVecR2 a = new IGVecR2();
                                                IGVecR2 b = new IGVecR2();
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                b.setx(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR2 r = new IGVecR2();
                                                System.out.println("Ingrese X1,Y1");
                                                r.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                r.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                double g = r.productoPunto(a);
                                                double m = r.productoPunto(b);
                                                System.out.println("El resultado es: (" + g + ", " + m + ")\n");
                                        }
                                        if (operaMat == 5) {

                                                IGVecR4 p = new IGVecR4();
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");
                                                System.out.println("|X Y|");
                                                System.out.println("|Z W|");
                                                System.out.println("ingrese x, y, z, w");
                                                p.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                p.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                p.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                p.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                p.escalarPorVector(alpha);
                                                System.out.println("|" + p.getX() + " " + p.getY() + "|");
                                                System.out.println("|" + p.getZ() + " " + p.getw() + "|");
                                        }
                                        if (operaMat == 6) {

                                                IGVecR2 A = new IGVecR2();
                                                System.out.println("ingrese x1 , y1");
                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                double angu = leerReal(sc, "angu", "Ha ingresado un caracter no valido");
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
                                                System.out.println("El resultado es: (" + r + ", " + g + ")\n");
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
                                        double operaMat=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaMat == 1) {
                                                System.out.println("primera matriz");
                                                System.out.println("| X1 Y1 Z1|");
                                                System.out.println("| X2 Y2 Z2|");
                                                System.out.println("| X3 Y3 Z3|");
                                                IGVecR3 a = new IGVecR3();
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 b = new IGVecR3();
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                IGVecR3 c = new IGVecR3();
                                                c.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                c.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                c.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                System.out.println("segunda matriz");
                                                System.out.println("| X1 Y1 Z1|");
                                                System.out.println("| X2 Y2 Z2|");
                                                System.out.println("| X3 Y3 Z3|");
                                                IGVecR3 d = new IGVecR3();
                                                d.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                d.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                d.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 f = new IGVecR3();
                                                f.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                f.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                f.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                IGVecR3 g = new IGVecR3();
                                                g.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                g.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                g.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));


                                                double x1 = a.productoPunto(d);
                                                double y1 = a.productoPunto(f);
                                                double z1 = a.productoPunto(g);
                                                double x2 = a.productoPunto(d);
                                                double y2 = a.productoPunto(f);
                                                double z2 = a.productoPunto(g);
                                                double x3 = a.productoPunto(d);
                                                double y3 = a.productoPunto(f);
                                                double z3 = a.productoPunto(g);

                                                System.out.println("|" + x1 + " " + y1 + " " + z1 + "|");
                                                System.out.println("|" + x2 + " " + y2 + " " + z2 + "|");
                                                System.out.println("|" + x3 + " " + y3 + " " + z3 + "|");
                                        }
                                        if (operaMat == 2) {

                                                System.out.println("Ingrese la matriz matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println("|X2 Y2 Z2|");
                                                System.out.println("|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));

                                                IGVecR3 g = new IGVecR3();
                                                System.out.println("Ingrese x1, y1 z1");
                                                g.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                g.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                g.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                double h = g.productoPunto(A);
                                                double m = g.productoPunto(B);
                                                double j = g.productoPunto(C);
                                                System.out.println("El resultado es: (" + h + ", " + m + ", " + j + ")\n");

                                        }
                                        if (operaMat == 3) {
                                                System.out.println("Ingrese la matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println("|X2 Y2 Z2|");
                                                System.out.println("|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));

                                                System.out.println("Ingrese la segunda matriz");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println("|X2 Y2 Z2|");
                                                System.out.println("|X3 Y3 Z3|");
                                                IGVecR3 d = new IGVecR3();
                                                d.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                d.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                d.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                IGVecR3 f = new IGVecR3();
                                                f.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                f.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                f.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                IGVecR3 g = new IGVecR3();
                                                g.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                g.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                g.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                IGVecR3 x4 = A.suma(d);
                                                IGVecR3 y4 = B.suma(f);
                                                IGVecR3 z4 = C.suma(g);
                                                System.out.println("|" + x4.getX() + " " + x4.getY() + " " + x4.getZ() + "|");
                                                System.out.println("|" + y4.getX() + " " + y4.getY() + " " + y4.getZ() + "|");
                                                System.out.println("|" + z4.getX() + " " + z4.getY() + " " + z4.getZ() + "|");

                                        }
                                        if (operaMat == 4) {
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");
                                                System.out.println("|X1 Y1 Z1|");
                                                System.out.println("|X2 Y2 Z2|");
                                                System.out.println("|X3 Y3 Z3|");
                                                IGVecR3 A = new IGVecR3();
                                                IGVecR3 B = new IGVecR3();
                                                IGVecR3 C = new IGVecR3();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));

                                                A.escalarPorVector(alpha);
                                                B.escalarPorVector(alpha);
                                                C.escalarPorVector(alpha);
                                                System.out.println("|" + A.getX() + " " + A.getY() + " " + A.getZ() + "|");
                                                System.out.println("|" + B.getX() + " " + B.getY() + " " + B.getZ() + "|");
                                                System.out.println("|" + C.getX() + " " + C.getY() + " " + C.getZ() + "|");

                                        }
                                        if (operaMat == 5) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, x1");
                                                R.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                R.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                R.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
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

                                                double x1 = R.productoPunto(A);
                                                double y1 = R.productoPunto(B);
                                                double z1 = R.productoPunto(C);
                                                System.out.println("El resultado es: (" + x1 + ", " + y1 + ", " + z1 + ")\n");
                                        }
                                        if (operaMat == 6) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, z1");
                                                R.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                R.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                R.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
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

                                                double x1 = R.productoPunto(A);
                                                double y1 = R.productoPunto(B);
                                                double z1 = R.productoPunto(C);
                                                System.out.println("El resultado es: (" + x1 + ", " + y1 + ", " + z1 + ")\n");

                                        }
                                        if (operaMat == 7) {
                                                IGVecR3 R = new IGVecR3();
                                                System.out.println("Ingrese x1, y1, z1");
                                                R.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                R.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                R.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                double angu = sc.nextDouble();
                                                double angulo = Math.toRadians(angu);
                                                IGVecR3 A = new IGVecR3();
                                                A.setx(Math.cos(angulo));
                                                A.setY(Math.sin(angulo));
                                                A.setZ(0);
                                                IGVecR3 B = new IGVecR3();
                                                B.setx(-(Math.sin(angulo)));
                                                B.setY(Math.cos(angulo));
                                                B.setZ(0);
                                                IGVecR3 C = new IGVecR3();
                                                C.setx(0);
                                                C.setY(0);
                                                C.setZ(1);

                                                double x1 = R.productoPunto(A);
                                                double y1 = R.productoPunto(B);
                                                double z1 = R.productoPunto(C);
                                                System.out.println("El resultado es: (" + x1 + ", " + y1 + ", " + z1 + ")\n");
                                        }

                                }
                                if (TipoMat == 3) {
                                        System.out.println("Presione 1 para calcular multiplicacion");
                                        System.out.println("Presione 2 para calcular columna por matriz");
                                        System.out.println("Presione 3 para calcular suma");
                                        System.out.println("Presione 4 para calcular escalar*matriz");
                                        double operaMat=leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                        if (operaMat == 1) {
                                                System.out.println("primera matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");
                                                IGVecR4 a = new IGVecR4();
                                                a.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                a.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                a.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                a.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 b = new IGVecR4();
                                                b.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                b.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                b.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                b.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
                                                IGVecR4 c = new IGVecR4();
                                                c.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                c.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                c.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                c.setw(leerReal(sc, "w3", "Ha ingresado un caracter no valido"));
                                                IGVecR4 d = new IGVecR4();
                                                d.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                d.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                d.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                d.setw(leerReal(sc, "w4", "Ha ingresado un caracter no valido"));
                                                System.out.println("segunda matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");


                                                IGVecR4 e = new IGVecR4();
                                                e.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                e.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                e.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                e.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                IGVecR4 f = new IGVecR4();
                                                f.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                f.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                f.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                f.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));
                                                IGVecR4 g = new IGVecR4();
                                                g.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                g.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                g.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                g.setw(leerReal(sc, "w3", "Ha ingresado un caracter no valido"));
                                                IGVecR4 h = new IGVecR4();
                                                h.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                h.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                h.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                h.setw(leerReal(sc, "w4", "Ha ingresado un caracter no valido"));


                                                double x1 = a.productoPunto(e);
                                                double y1 = a.productoPunto(f);
                                                double z1 = a.productoPunto(g);
                                                double W1 = a.productoPunto(h);

                                                double x2 = a.productoPunto(e);
                                                double y2 = a.productoPunto(f);
                                                double z2 = a.productoPunto(g);
                                                double W2 = a.productoPunto(h);
                                                double x3 = a.productoPunto(e);
                                                double y3 = a.productoPunto(f);
                                                double z3 = a.productoPunto(g);
                                                double W3 = a.productoPunto(h);
                                                double x4 = a.productoPunto(e);
                                                double y4 = a.productoPunto(f);
                                                double z4 = a.productoPunto(g);
                                                double W4 = a.productoPunto(h);

                                                System.out.println("|" + x1 + " " + y1 + " " + z1 + " " + W1 + "|");
                                                System.out.println("|" + x2 + " " + y2 + " " + z2 + " " + W2 + "|");
                                                System.out.println("|" + x3 + " " + y3 + " " + z3 + " " + W3 + "|");
                                                System.out.println("|" + x4 + " " + y4 + " " + z4 + " " + W4 + "|");
                                        }
                                        if (operaMat == 2) {
                                                System.out.println("Ingrese la matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");

                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                IGVecR4 C = new IGVecR4();
                                                IGVecR4 D = new IGVecR4();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                A.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                B.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                C.setw(leerReal(sc, "w3", "Ha ingresado un caracter no valido"));

                                                D.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                D.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                D.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                D.setw(leerReal(sc, "w4", "Ha ingresado un caracter no valido"));

                                                IGVecR4 g = new IGVecR4();
                                                System.out.println("Ingrese x1, y1,  z1,   W1");
                                                g.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                g.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                g.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                g.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));
                                                double h = g.productoPunto(A);
                                                double m = g.productoPunto(B);
                                                double j = g.productoPunto(C);
                                                double I = g.productoPunto(D);
                                                System.out.println("El resultado es: (" + h + ", " + m + ", " + j + ", " + I + ")\n");

                                        }
                                        if (operaMat == 3) {


                                                System.out.println("Ingrese la primera matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");

                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                IGVecR4 C = new IGVecR4();
                                                IGVecR4 D = new IGVecR4();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                A.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                B.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                C.setw(leerReal(sc, "w3", "Ha ingresado un caracter no valido"));

                                                D.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                D.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                D.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                D.setw(leerReal(sc, "w4", "Ha ingresado un caracter no valido"));


                                                System.out.println("Ingrese la segunda matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");
                                                IGVecR4 E = new IGVecR4();
                                                IGVecR4 F = new IGVecR4();
                                                IGVecR4 G = new IGVecR4();
                                                IGVecR4 H = new IGVecR4();

                                                E.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                E.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                E.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                E.setw(leerReal(sc, "w1", "Ha ingresado un caracter no valido"));

                                                F.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                F.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                F.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                F.setw(leerReal(sc, "w2", "Ha ingresado un caracter no valido"));

                                                G.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                G.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                G.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                G.setw(leerReal(sc, "w3", "Ha ingresado un caracter no valido"));

                                                H.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                H.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                H.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                H.setw(leerReal(sc, "w4", "Ha ingresado un caracter no valido"));

                                                IGVecR4 x4 = A.suma(E);
                                                IGVecR4 y4 = B.suma(F);
                                                IGVecR4 z4 = C.suma(G);
                                                IGVecR4 W4 = D.suma(H);
                                                System.out.println("|" + x4.getX() + " " + x4.getY() + " " + x4.getZ() + " " + x4.getw() + "|");
                                                System.out.println("|" + y4.getX() + " " + y4.getY() + " " + y4.getZ() + " " + y4.getw() + "|");
                                                System.out.println("|" + z4.getX() + " " + z4.getY() + " " + z4.getZ() + " " + z4.getw() + "|");
                                                System.out.println("|" + W4.getX() + " " + W4.getY() + " " + W4.getZ() + " " + W4.getw() + "|");


                                        }
                                        if (operaMat == 4) {

                                                System.out.println("Ingrese la matriz");
                                                System.out.println("| X1 Y1 Z1 w1|");
                                                System.out.println("| X2 Y2 Z2 w2|");
                                                System.out.println("| X3 Y3 Z3 w3|");
                                                System.out.println("| X4 Y4 Z4 w4|");
                                                System.out.println("Ingrese el escalar");
                                                double alpha = leerReal(sc, "alpha", "Ha ingresado un caracter no valido");

                                                IGVecR4 A = new IGVecR4();
                                                IGVecR4 B = new IGVecR4();
                                                IGVecR4 C = new IGVecR4();
                                                IGVecR4 D = new IGVecR4();

                                                A.setx(leerReal(sc, "x1", "Ha ingresado un caracter no valido"));
                                                A.setY(leerReal(sc, "y1", "Ha ingresado un caracter no valido"));
                                                A.setZ(leerReal(sc, "z1", "Ha ingresado un caracter no valido"));
                                                A.setw(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));

                                                B.setx(leerReal(sc, "x2", "Ha ingresado un caracter no valido"));
                                                B.setY(leerReal(sc, "y2", "Ha ingresado un caracter no valido"));
                                                B.setZ(leerReal(sc, "z2", "Ha ingresado un caracter no valido"));
                                                B.setw(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));

                                                C.setx(leerReal(sc, "x3", "Ha ingresado un caracter no valido"));
                                                C.setY(leerReal(sc, "y3", "Ha ingresado un caracter no valido"));
                                                C.setZ(leerReal(sc, "z3", "Ha ingresado un caracter no valido"));
                                                C.setw(leerReal(sc, "W3", "Ha ingresado un caracter no valido"));

                                                D.setx(leerReal(sc, "x4", "Ha ingresado un caracter no valido"));
                                                D.setY(leerReal(sc, "y4", "Ha ingresado un caracter no valido"));
                                                D.setZ(leerReal(sc, "z4", "Ha ingresado un caracter no valido"));
                                                D.setw(leerReal(sc, "W4", "Ha ingresado un caracter no valido"));


                                                A.escalarPorVector(alpha);
                                                B.escalarPorVector(alpha);
                                                C.escalarPorVector(alpha);
                                                D.escalarPorVector(alpha);

                                                System.out.println("|" + A.getX() + " " + A.getY() + " " + A.getZ() + " " + D.getw() + "|");
                                                System.out.println("|" + B.getX() + " " + B.getY() + " " + B.getZ() + " " + D.getw() + "|");
                                                System.out.println("|" + C.getX() + " " + C.getY() + " " + C.getZ() + " " + D.getw() + "|");
                                                System.out.println("|" + D.getX() + " " + D.getY() + " " + D.getZ() + " " + D.getw() + "|");
                                        }
                                }
                        }
                } while (Rep != 3);
                System.out.println("Esta Finalizando el programa");
        }

        public static double leerReal(Scanner sc, String mensaje, String mensajeError) {
                double retval = 0;
                System.out.println(mensaje);
                while (!sc.hasNextInt()){
                sc.nextLine();
                System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
        }
        public static double leerEntero(Scanner sc, String mensaje, String mensajeError) {
                double retval = 0;
                System.out.println(mensaje);
                while (!sc.hasNextDouble()){
                        sc.nextLine();
                        System.out.println(mensajeError);
                }
                retval = sc.nextDouble();
                sc.nextLine();
                return retval;
        }
}