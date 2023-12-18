package mx.edu.utez;

public class Mercancia {
    private int peso;
    private int distancia;
    private String  Transporte;
    private String NumEnv;
    private String fecha;
    private double costo;

    public Mercancia() {
    }

    public Mercancia(int peso, int distancia, String transporte, String numEnv, String fecha, double costo) {
        this.peso = peso;
        this.distancia = distancia;
        Transporte = transporte;
        NumEnv = numEnv;
        this.fecha = fecha;
        this.costo = costo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String transporte) {
        Transporte = transporte;
    }

    public String getNumEnv() {
        return NumEnv;
    }

    public void setNumEnv(String numEnv) {
        NumEnv = numEnv;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
