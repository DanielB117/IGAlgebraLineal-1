package edu.ujcv.progra2;
import edu.ujcv.progra2.vector.IGVecR2;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {

                // write your code here
                Scanner sc = new Scanner(System.in);


                System.out.println("que desea calcular");
                System.out.println("Presione 1 para vectores");
                System.out.println("presione 2 para matrices");

                int VecOMac = sc.nextInt();



                if (VecOMac == 1) {
                        System.out.println("que tipo de vector desea calcular");
                        int TipoVec = sc.nextInt();

                        System.out.println("presione 1 para calcular Vector en R2");
                        System.out.println("presione 2 para calcular Vector en R3 ");
                        System.out.println("presione 3 para calcular Vector en R4");
                        if (TipoVec == 1) {

                        }
                        if (TipoVec == 2) {

                        }
                        if (TipoVec == 3) {

                        }
                }
                        if (VecOMac == 2) {
                                System.out.println("que tipo de matriz desea calcular");
                                System.out.println("presione 1 para calcular Matriz en R2");
                                System.out.println("presione 2 para calcular Matriz en R3 ");
                                System.out.println("presione 3 para calcular  Matriz en R4");
                                int TipoMat = sc.nextInt();
                                if (TipoMat == 1) {

                                }
                                if (TipoMat == 2) {

                                }
                                if (TipoMat == 3) {

                                }

                        }


                }
        }

