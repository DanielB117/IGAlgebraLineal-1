package edu.ujcv.progra2.vector;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class IGVecR4 {
    private double x;
    private double y;
    private double z;
    private double w;
    private LectorDeTecladoValidado lt = new LectorDeTecladoValidado();

    public IGVecR4() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public IGVecR4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public IGVecR4(IGVecR4 b) {
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }

    public IGVecR4 suma(IGVecR4 b) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = x + b.x;
        Resul.y = y + b.y;
        Resul.z = z + b.z;
        Resul.w = w + b.w;
        return Resul;
        //TODO: implementar
    }

    public IGVecR4 resta(IGVecR4 b) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = x - b.x;
        Resul.y = y - b.y;
        Resul.z = z - b.z;
        Resul.w = w - b.w;
        return Resul;
        //TODO: implementar
    }

    //producto.
    public IGVecR4 escalarPorVector(double alpha) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = alpha * x;
        Resul.y= alpha *y;
        Resul.z= alpha *z;
        Resul.w= alpha *w;
        return Resul;
    }

    public double productoPunto(IGVecR4 b) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = x * b.x;
        Resul.y = y * b.y;
        Resul.z = z * b.z;
        Resul.w = w * b.w;
        double a = Resul.x + Resul.y + Resul.z + Resul.w;
        return a;
    }
    public double angulo(IGVecR4 b) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = x * b.x;
        Resul.y = y * b.y;
        Resul.z = z * b.z;
        Resul.w = w * b.w;
        double a = Resul.x + Resul.y + Resul.z + Resul.w;
        double c = Math.sqrt(((Math.pow(b.x, 2) + Math.pow(b.y, 2) + Math.pow(b.z, 2) + Math.pow(b.w, 2))));
        double f = Math.sqrt(((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + Math.pow(w, 2))));
        double d = Math.acos((a / (c * f)));
        return d;
    }

    public double magnitud(IGVecR4 b) {
        IGVecR4 Resul = new IGVecR4();
        Resul.x = (b.x) - x;
        Resul.y = (b.y) - y;
        Resul.z = (b.z) - z;
        Resul.w = (b.w) - w;
        double a = Math.pow(Resul.x, 2) + Math.pow(Resul.y, 2) + Math.pow(Resul.z, 2) + Math.pow(Resul.w, 2);
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

    public double getw() {
        return w;
    }

    public void setw(double w) {
        this.w = w;
    }


    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
}