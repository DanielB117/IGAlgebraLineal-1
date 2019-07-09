package edu.ujcv.progra2.vector;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGVecR3 {
    private double x;
    private double y;
    private double z;
    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public IGVecR3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public IGVecR3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public IGVecR3(IGVecR3 b) {
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public IGVecR3 suma(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = x + b.x;
        Resul.y = y + b.y;
        Resul.z = z + b.z;
        return Resul;
        //TODO: implementar
    }

    public IGVecR3 resta(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = x - b.x;
        Resul.y = y - b.y;
        Resul.z = z - b.z;
        return Resul;
        //TODO: implementar
    }

    //producto.
    public IGVecR3 escalarPorVector(double alpha) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = alpha * x;
        Resul.y= alpha *y;
        Resul.z= alpha *z;

        return Resul;

    }

    public double productoPunto(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = x * b.x;
        Resul.y = y * b.y;
        Resul.z = z * b.z;
        double a = Resul.x + Resul.y + Resul.z;
        return a;

        //TODO: implementar

    }

    public IGVecR3 productoCruz(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = (b.z * y) - (b.y * z);
        Resul.y = (b.x * z) - (b.z * x);
        Resul.z = (b.y * x) - (b.x * y);
        return Resul;
    }
    public double angulo(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = x * b.x;
        Resul.y = y * b.y;
        Resul.z = z * b.z;
        double a = Resul.x + Resul.y + Resul.z;
        double c = Math.sqrt(((Math.pow(b.x, 2) + Math.pow(b.y, 2) + Math.pow(b.z, 2))));
        double f = Math.sqrt(((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2))));
        double d = Math.acos((a / (c * f)));
        //TODO: implementar
        return d;
    }

    public double magnitud(IGVecR3 b) {
        IGVecR3 Resul = new IGVecR3();
        Resul.x = (b.x) - x;
        Resul.y = (b.y) - y;
        Resul.z = (b.z) - z;
        double a = Math.pow(Resul.x, 2) + Math.pow(Resul.y, 2) + Math.pow(Resul.z, 2);
        return Math.sqrt(a);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


}
