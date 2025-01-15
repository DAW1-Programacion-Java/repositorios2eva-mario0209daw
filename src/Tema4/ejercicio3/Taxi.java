package Tema4.ejercicio3;

public class Taxi {
    //ATRIBUTOS
    private String matricula;
    //private String distrito;//norte, sur, este, oeste
    //private String motor;//diesel o gasolina
    private Distrito distrito;
    private TipoMotor motor;
    private double[] coordenadas;
    //private double latitud;
    //private double longitud;

    //CONSTRUCTORES
    public Taxi(String matricula, Distrito distrito, TipoMotor motor, double[] coordenadas) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.motor = motor;
        this.coordenadas = coordenadas;
    }

    public Taxi(String matricula, Distrito distrito, TipoMotor motor) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.motor = motor;
        this.coordenadas = new double[]{0.0, 0.0};
    }

    //GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Distrito getDistrito() {
        return distrito;
    }
    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
    public TipoMotor getMotor() {
        return motor;
    }
    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }
    public double[] getCoordenadas() {
        return coordenadas;
    }
    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }
    //METODOS

    public boolean operan_distrito(Taxi otro_taxi){
        return this.distrito.equals(otro_taxi.getDistrito());
    }

    public String coordenadasToString(){
        return "Longitud:" + coordenadas[0] + ", Latitud: "+ coordenadas[1];
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula
                + "\nDistrito: " + distrito
                + "\nMotor: " + motor
                + "\nCoordenadas: " + coordenadasToString();
    }

}
