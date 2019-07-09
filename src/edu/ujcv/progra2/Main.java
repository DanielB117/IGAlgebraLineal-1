package edu.ujcv.progra2;
import edu.ujcv.progra2.vector.IGVecR2;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                // write your code here
                Scanner sc = new Scanner(System.in);
                System.out.println("que desea calcular");

                int TipoVec = sc.nextInt();
                System.out.println("presione 1 para calcular Vector en R2");
                System.out.println("presione 2 para calcular Vector en R3 ");
                System.out.println("presione 3 para calcular Vector en R4");

                if (TipoVec == 1) {
                        int operaVec = sc.nextInt();
                        System.out.println("presione 1 para calcular suma en R2");
                        System.out.println("presione 2 para calcular resta en R2");
                        System.out.println("presione 3 para calcular escalarPorVector R2");
                        System.out.println("presione 4 para calcular productoPunto en R2");
                        System.out.println("presione 5 para calcular determinante en R2");
                        System.out.println("presione 6 para calcular magnitud en R2");
                        System.out.println("presione 7 para calcular angulo en R2");
                        if (operaVec == 1) {
                        }
                        if (operaVec == 2) {
                        }
                        if (operaVec == 3) {
                        }
                        if (operaVec == 4) {
                        }
                        if (operaVec == 5) {
                        }
                        if (operaVec == 6) {
                        }
                        if (operaVec == 7) {
                        }
                }
                //IGVecR2 A = new IGVecR2()
                //pedir componente x y componente y
                //declarar vector b
                //pedir componentes del vector b
                //resultado = a.suma(b);
                //sout{resultado}

                if (TipoVec == 2) {
                        int operaVec = sc.nextInt();
                        System.out.println("presione 1 para calcular suma en R3");
                        System.out.println("presione 2 para calcular resta en R3");
                        System.out.println("presione 3 para calcular escalarPorVector R3");
                        System.out.println("presione 4 para calcular productoPunto en r3");
                        System.out.println("presione 5 para calcular determinante en R3");
                        System.out.println("presione 6 para calcular magnitud en R3");
                        System.out.println("presione 7 para calcular angulo en R3");
                        if (operaVec == 1) {
                        }
                        if (operaVec == 2) {
                        }
                        if (operaVec == 3) {
                        }
                        if (operaVec == 4) {

                        }
                        if (operaVec == 5) {
                        }
                        if (operaVec == 6) {
                        }
                        if (operaVec == 7) {
                        }
                        //IGVecR3 A = new IGVecR3()
                        //pedir componente x y componente y y componente w
                        //declarar vector b
                        //pedir componentes del vector b
                        //resultado = a.suma(b);
                        //sout{resultado}
                }

                if (TipoVec == 3) {
                        if (TipoVec == 1) {
                                int operaVec = sc.nextInt();
                                System.out.println("presione 1 para calcular suma en R4");
                                System.out.println("presione 2 para calcular resta en R4");
                                System.out.println("presione 3 para calcular escalarPorVector R4");
                                System.out.println("presione 4 para calcular productoPunto en R4");
                                System.out.println("presione 5 para calcular determinante en R4");
                                System.out.println("presione 6 para calcular magnitud en R4");
                                System.out.println("presione 7 para calcular angulo en R4");
                                if (operaVec == 1) {
                                }
                                if (operaVec == 2) {
                                }
                                if (operaVec == 3) {
                                }
                                if (operaVec == 4) {

                                }
                                if (operaVec == 5) {
                                }
                                if (operaVec == 6) {
                                }
                                if (operaVec == 7) {
                                }
                                //IGVecR4 A = new IGVecR4()
                                //pedir componente x y componente y y componente w y componente z
                                //declarar vector b
                                //pedir componentes del vector b
                                //resultado = a.suma(b);
                                //sout{resultado}
                        }
                }
        }
}
