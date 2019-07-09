package edu.ujcv.progra2;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                // write your code here
                Scanner sc = new Scanner(System.in);
                System.out.println("que desea calcular");
                System.out.println("Presione 1 para calcular vectores");
                System.out.println("Presione 2 para calcular matrices");
                int Tipoopera = sc.nextInt();
                if (Tipoopera == 1) {
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
                                        System.out.print("," + y.getY());
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
                                        System.out.print("," + y.getY());

                                }
                                if (operaVec == 3) {
//                                        IGVecR2 a = new IGVecR2();
//                                        System.out.println("ingrese los componentes del primer vector");
//                                        a.setx(sc.nextDouble());
//                                        a.setY(sc.nextDouble());
//                                        IGVecR2 alpha = new IGVecR2();
//                                        System.out.println("ingrese las componentes del segundo vector");
//                                        alpha.setx(sc.nextDouble());
//                                        alpha.setY(sc.nextDouble());
//                                        double x = a.escalarPorVector( double alpha);
//                                        double y = a.escalarPorVector( double alpha);
//                                        System.out.println("Su resultado es");
//                                        System.out.print(x);
//                                        System.out.print("," + y);
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
                                        System.out.print("," + y);
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
                                        System.out.print("," + y);

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
                                        System.out.print("," + y);
                                }

                        }
                        //IGVecR2 A = new IGVecR2()
                        //pedir componente x y componente y
                        //declarar vector b
                        //pedir componentes del vector b
                        //resultado = a.suma(b);
                        //sout{resultado}

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
                                        System.out.print("," + z.getZ());

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
                                        System.out.print("," + z.getZ());
                                }
                                if (operaVec == 3) {
//                                        IGVecR3 a = new IGVecR3();
//                                        System.out.println("ingrese los componentes del primer vector");
//                                        a.setx(sc.nextDouble());
//                                        a.setY(sc.nextDouble());
//                                        a.setZ(sc.nextDouble());
//                                        IGVecR3 alpha = new IGVecR3();
//                                        System.out.println("ingrese las componentes del segundo vector");
//                                        alpha.setx(sc.nextDouble());
//                                        alpha.setY(sc.nextDouble());
//                                        alpha.setZ(sc.nextDouble());
//                                        double x = a.escalarPorVector( double alpha);
//                                        double y = a.escalarPorVector( double alpha);
//                                        double z = a.escalarPorVector( double alpha);
//                                        System.out.println("Su resultado es");
//                                        System.out.print(x);
//                                        System.out.print("," + y);
//                                        System.out.print("," + z);

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
                                        System.out.print("," + z);
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
                                        System.out.print("," + z.getZ());
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
                                        System.out.print("," + z);
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
                                        System.out.print("," + z);


                                }

                                //IGVecR3 A = new IGVecR3()
                                //pedir componente x y componente y y componente w
                                //declarar vector b
                                //pedir componentes del vector b
                                //resultado = a.suma(b);
                                //sout{resultado}
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
                                        System.out.print("," + w.getw());
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
                                        System.out.print("," + w.getw());
                                }
                                if (operaVec == 3) {
//                                        IGVecR4 a = new IGVecR4();
//                                        System.out.println("ingrese los componentes del primer vector");
//                                        a.setx(sc.nextDouble());
//                                        a.setY(sc.nextDouble());
//                                        a.setZ(sc.nextDouble());
//                                        IGVecR4 alpha = new IGVecR4();
//                                        System.out.println("ingrese las componentes del segundo vector");
//                                        alpha.setx(sc.nextDouble());
//                                        alpha.setY(sc.nextDouble());
//                                        alpha.setZ(sc.nextDouble());
//                                        alpha.setw(sc.nextDouble());
//                                        double x = a.escalarPorVector( double alpha);
//                                        double y = a.escalarPorVector( double alpha);
//                                        double z = a.escalarPorVector( double alpha);
//                                        double w = a.escalarPorVector( double alpha);
//                                        System.out.println("Su resultado es");
//                                        System.out.print(x);
//                                        System.out.print("," + y);
//                                        System.out.print("," + z);
//                                        System.out.print("," + w);

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
                                        System.out.print("," + w);
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
                                        System.out.print("," + w);
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
                                        System.out.print("," + w);
                                }
                                //IGVecR4 A = new IGVecR4()
                                //pedir componente x y componente y y componente w y componente z
                                //declarar vector b
                                //pedir componentes del vector b
                                //resultado = a.suma(b);
                                //sout{resultado}
                        }
                }
                if (Tipoopera == 2) {

                }
        }
}

