package Tema4.ejercicio3;

public class ej3 {
    public static void main(String[] args) {
        double[] micoor = { -6.4572000, 38.4447100};
        Taxi taxi1 = new Taxi("1234MTT", Distrito.SUR,TipoMotor.GASOLINA, micoor);
        Taxi taxi2 = new Taxi("5555CCC",Distrito.OESTE,TipoMotor.DIESEL);

        System.out.println(taxi1.toString());
        System.out.println(taxi2.toString());


        System.out.println(taxi1.operan_distrito(taxi2));
    }
}
