import java.util.Scanner;

public class Main {

    public static int ganador( Atleta atletas[]){
        int posicion=0;
        double kmXHora = atletas[posicion].getKmH();

        for(int x = 1; x< atletas.length; x++){
            if(atletas[x].getKmH() < kmXHora){
                posicion= x;
                kmXHora = atletas[posicion].getKmH();            }
        }
        return posicion;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        String nombre;
        double kmH;
        System.out.print("Ingrese el número de participantes: ");
        int participantes = entrada.nextInt();

        Atleta atletas[] = new Atleta[participantes];

        for(int i =0; i < atletas.length; i++){
            System.out.println("Atleta " + (i+1));
            System.out.print("Ingrese el número del atleta: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese los kilometros por hora recorridos: ");
            kmH = entrada.nextDouble();
            atletas[i] = new Atleta(numero,nombre,kmH);
        }
        int position = ganador(atletas);
        System.out.println(atletas[position].informacion());
    }
}
