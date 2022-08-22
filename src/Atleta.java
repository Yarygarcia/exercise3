public class Atleta {
    private int numero;
    private String nombre;
    private double kmH;
    public Atleta(int numero, String nombre, double kmH){
        this.numero =  numero;
        this.nombre = nombre;
        this.kmH = kmH;
    }

    public double getKmH(){
        return kmH;
    }
    public String informacion(){
        return "Atleta Ganador(a): " + nombre + "\n numero: "+ numero + "\n km/h alcanzados: " + kmH;
    }
}
